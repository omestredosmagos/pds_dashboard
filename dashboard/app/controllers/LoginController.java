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
		
		return ok(views.html.quantidadeLogin.render(qtdLogin));
	}
	
	//TRATAMENTO DOS DADOS SOBRE A QUANTIDADE DE LOGINS
	@Transactional
	public static List<Object> getQuantidadeLogin() {
		String query = "SELECT u.id, u.firstname, u.lastname, COUNT(l.id) AS qvisita" + 
				"FROM mdl_user u" + 
				"INNER JOIN mdl_log l ON u.id = l.userid" + 
				"WHERE action='login'" + 
				"GROUP BY u.id, u.firstname, u.lastname" + 
				"ORDER BY COUNT(l.id) DESC LIMIT 15";
		List<Object> logins = JPA.em().createNativeQuery(query).getResultList();
		
		return logins;
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