package controllers;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.*;
import javax.persistence.*;

import models.NumeroPosts;

import views.html.*;
import play.mvc.*;
import play.Logger;
import play.data.DynamicForm;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;


public class PostsController extends Controller {
	
	//RECUPERAR OS NUMERO DE POSTS
	@Transactional
	public static Result recuperarNumeroPosts(){
		String query = "FROM NumeroPosts ORDER BY id ASC";
		List<NumeroPosts> numPosts = JPA.em().createQuery(query).getResultList();
			
		return ok(views.html.numeroPosts.render(numPosts, getMaiorNumeroPosts()));
	}
	
	//TRATAMENTO DOS DADOS SOBRE NUMERO DE POSTS
	@Transactional
	public static List<Object> idsForum() {
		String query = "SELECT u.id FROM mdl_role_assignments rs INNER JOIN mdl_user u ON u.id=rs.userid "
				+ "INNER JOIN mdl_context e ON rs.contextid=e.id WHERE e.contextlevel=50 AND rs.roleid=5 "
				+ "AND e.instanceid=48";
		List<Object> idsList = JPA.em().createNativeQuery(query).getResultList();

		return idsList;
	}

	@Transactional
	public static List<Object> getNumeroPosts(List<Object> id) {
		List<Object> posts = new ArrayList<Object> (id.size()); 
		Object aux;
		String query;
		
		for (short i = 0; i < id.size(); i++) {
			query = "SELECT u.id, u.firstname, u.lastname, COUNT(u.id) AS NumeroPosts " + 
					" FROM mdl_forum_posts fp INNER JOIN mdl_user u ON u.id=fp.userid " + 
					" WHERE fp.userid=:id";
			aux = JPA.em().createNativeQuery(query)
					.setParameter("id", (BigInteger)id.get(i))
					.getResultList().get(0);
			
			posts.add(aux);
		}
		return posts;
	}
	
	@Transactional
	public static List<NumeroPosts> getMaiorNumeroPosts() {
		List<NumeroPosts> maiorNumPosts = new ArrayList<NumeroPosts>();
		NumeroPosts np1;
		
		String query = "SELECT firstname, numberposts FROM NumeroPosts ORDER BY numberposts DESC LIMIT 15";
		List<Object> aux = JPA.em().createNativeQuery(query).getResultList();
		
		for (Object result: aux) {
			np1 = new NumeroPosts();
			Object[] items = (Object[]) result;
			
			np1.setFirstname((String)items[0]);
			np1.setNumberposts(((Integer)items[1]).intValue());
			
			maiorNumPosts.add(np1);
		}
		
		return maiorNumPosts;
	}
	
	/*@Transactional
	public static List<NumeroPosts> getMenorNumeroPosts() {
		String query = "SELECT firstname, numberposts FROM NumeroPosts ORDER BY numberposts ASC LIMIT 15";
		List<NumeroPosts> menorNumPosts = (List<NumeroPosts>) JPA.em().createNativeQuery(query).getResultList();
		
		return menorNumPosts;
	}*/
	
	//SALVAR NUMERO DE POSTS NO BANCO
	@Transactional
	public static Result salvarNumeroPosts() {
		List<Object> aux = idsForum();
		List<Object> numeroPosts = getNumeroPosts(aux);

		NumeroPosts np;

		for (Object result: numeroPosts) {
			np = new NumeroPosts();
			Object[] items = (Object[]) result;

			np.setUserid(((BigInteger)items[0]).intValue());
			np.setFirstname((String)items[1]);
			np.setLastname((String)items[2]);
			np.setNumberposts(((BigInteger)items[3]).intValue());

			try {
				JPA.em().merge(np);				
			} catch (Exception ex){
				return badRequest("Erro salvando dados " + ex.getLocalizedMessage());
			}
		}
		return ok("Salvo com sucesso. Acesse /recuperar para ver os dados salvos no banco");
	}
	
}