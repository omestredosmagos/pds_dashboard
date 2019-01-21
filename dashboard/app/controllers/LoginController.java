package controllers;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.*;
import javax.persistence.*;

import models.QuantidadeLogin;

import views.html.*;
import play.mvc.*;
import play.Logger;
import play.data.DynamicForm;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;


public class LoginController extends Controller {
	
	//RECUPERAR A QUANTIDADE DE LOGINS DOS ALUNOS
	@Transactional
	public static Result recuperarQuantidadeLogin() {
		String query = "FROM QuantidadeLogin ORDER BY id ASC";
		List<QuantidadeLogin> qtdLogin = JPA.em().createQuery(query).getResultList();
		
		return ok(views.html.quantidadeLogin.render(qtdLogin, getMaiorQuantidadeLogin(), getMenorQuantidadeLogin()));
	}
	
	//TRATAMENTO DOS DADOS SOBRE A QUANTIDADE DE LOGINS
	@Transactional
	public static List<Object> getQuantidadeLogin() {
		String query = "SELECT u.id, u.firstname, u.lastname, count(*) as visitas" + 
				" FROM mdl_user u, mdl_log log" + 
				" WHERE u.id = log.userid AND log.action='login' AND log.course=1" + 
				" GROUP BY u.id" + 
				" ORDER BY visitas DESC";
		List<Object> logins = JPA.em().createNativeQuery(query).getResultList();
		
		return logins;
	}
	
	@Transctional
	public static List<QuantidadeLogin> getMaiorQuantidadeLogin(){
		List<QuantidadeLogin> maiorQuantidadeLogin = new ArrayList<QuantidadeLogin>();
		QuantidadeLogin ql1;
		
		String query = "SELECT firstname, qtdlogin"
				+ " FROM QuantidadeLogin"
				+ "	ORDER BY qtdlogin DESC LIMIT 25";
		List<Object> aux = JPA.em().createNativeQuery(query).getResultList();
		
		for (Object result: aux) {
			ql1 = new QuantidadeLogin();
			Object[] items = (Object[]) result;
			
			ql1.setFirstname((String)items[0]);
			ql1.setQtdLogin(((Integer)items[1]).intValue());
			
			maiorQuantidadeLogin.add(ql1);
		}
		
		return maiorQuantidadeLogin;
	}
	
	@Transctional
	public static List<QuantidadeLogin> getMenorQuantidadeLogin(){
		List<QuantidadeLogin> menorQuantidadeLogin = new ArrayList<QuantidadeLogin>();
		QuantidadeLogin ql2;
		
		String query = "SELECT firstname, qtdlogin"
				+ " FROM QuantidadeLogin"
				+ "	ORDER BY qtdlogin ASC LIMIT 25";
		List<Object> aux = JPA.em().createNativeQuery(query).getResultList();
		
		for (Object result: aux) {
			ql2 = new QuantidadeLogin();
			Object[] items = (Object[]) result;
			
			ql2.setFirstname((String)items[0]);
			ql2.setQtdLogin(((Integer)items[1]).intValue());
			
			menorQuantidadeLogin.add(ql2);
		}
		
		return menorQuantidadeLogin;
	}
	
	//SALVAR QUANTIDADE DE LOGIN O BANCO
	@Transactional
	public static Result salvarQuantidadeLogin() {
		List<Object> qtdLogin = getQuantidadeLogin();
		
		QuantidadeLogin ql;
		
		for(Object result: qtdLogin) {
			ql = new QuantidadeLogin();
			Object[] items = (Object[]) result;
			
			ql.setUserid(((BigInteger)items[0]).intValue());
			ql.setFirstname((String)items[1]);
			ql.setLastname((String)items[2]);
			ql.setQtdLogin(((BigInteger)items[3]).intValue());
			
			try {
				JPA.em().merge(ql);				
			} catch (Exception ex){
				return badRequest("Erro salvando dados " + ex.getLocalizedMessage());
			}	
		}
		return ok("Salvo com sucesso. Acesse /recuperar para ver os dados salvos no banco");
	}
}