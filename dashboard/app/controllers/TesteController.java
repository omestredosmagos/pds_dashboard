package controllers;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.*;
import javax.persistence.*;

import models.Tarefa;
import models.NumeroPosts;

import views.html.*;
import play.mvc.*;
import play.Logger;
import play.data.DynamicForm;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;


public class TesteController extends Controller {

	/*public static Result teste() {
        
		List<Tarefa> tarefas = crieTarefas();
		
		return ok(views.html.teste.render(tarefas));
    }*/
	
	@Transactional
	public static Result salvar(){
		
		Tarefa t;
		for (int i = 0; i < 3; i++){
			String sufixo = " do dia " 
					+ new Date();
			
			t = new Tarefa();
			t.setId(i);
			t.setDescricao("Descricao" + sufixo);
			t.setTitulo("Titulo" + sufixo);
			
			try {
				JPA.em().persist(t);					
			} catch (Exception ex){
				return badRequest("Erro salvando dados " + ex.getLocalizedMessage());
			}
		}
		return ok("Salvo com sucesso. Acesse /recuperar para ver os dados salvos no banco");
		
	}
	
	@Transactional
	public static Result recuperar(){
		String query = "FROM NumeroPosts ORDER BY id ASC";
		List<NumeroPosts> numPosts = JPA.em().createQuery(query).getResultList();
		
		return ok(views.html.teste.render(numPosts));
	}

	private static List<Tarefa> crieTarefas() {
		List<Tarefa> tarefa = new ArrayList<Tarefa>();
		Tarefa t;
		for (int i = 0; i < 10; i++){
			t = new Tarefa();
			t.setId(i);
			t.setDescricao("Descricao " + i);
			t.setTitulo("Titulo " + i);
			tarefa.add(t);
			
		}
		return tarefa;
	}
	
	@Transactional
	public static List<Object> idsForum() {
		String query = "SELECT u.id FROM mdl_role_assignments rs INNER JOIN mdl_user u ON u.id=rs.userid INNER JOIN mdl_context e ON rs.contextid=e.id WHERE e.contextlevel=50 AND rs.roleid=5 AND e.instanceid=48 LIMIT 15;";
		List<Object> idsList = JPA.em().createNativeQuery(query).getResultList();

		return idsList;
	}

	@Transactional
	public static List<Object> getNumeroPosts(List<Object> id) {
		List<Object> result = idsForum();
		List<Object> posts = new ArrayList<Object> (result.size()); 
		List<Object> aux;
		String query;
		
		for (short i = 0; i < posts.size(); i++) {
			query = "SELECT u.id, u.firstname, u.lastname, COUNT(u.id) AS NumeroPosts " + 
					"FROM mdl_forum_posts fp INNER JOIN mdl_user u ON u.id=fp.userid " + 
					"WHERE fp.userid = :id;";
			aux = JPA.em().createNativeQuery(query).setParameter("id", (BigInteger)id.get(i)).getResultList();
			
			posts.add(aux);
		}
		return posts;
	}

	@Transactional
	public static Result salvarBanco() {
		List<Object> aux = idsForum();
		List<Object> numeroPosts = getNumeroPosts(aux);

		NumeroPosts np;

		for (Object result: numeroPosts) {
			np = new NumeroPosts();
			Object[] items = (Object[]) result;

			np.setUserid((Integer)items[0]);
			np.setFirstname((String)items[1]);
			np.setLastname((String)items[2]);
			np.setNumberposts((Integer)items[3]);

			try {
				JPA.em().persist(np);				
			} catch (Exception ex){
				return badRequest("Erro salvando dados " + ex.getLocalizedMessage());
			}
		}
		return ok("Salvo com sucesso. Acesse /recuperar para ver os dados salvos no banco");
	}
}