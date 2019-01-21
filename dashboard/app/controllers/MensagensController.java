package controllers;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.*;
import javax.persistence.*;

import models.MensagensEnviadas;

import views.html.*;
import play.mvc.*;
import play.Logger;
import play.data.DynamicForm;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;


public class MensagensController extends Controller {
	
	//RECUPERAR MENSAGENS ENVIADAS
	@Transactional
	public static Result recuperarMensagensEnviadas() {
		String query = "FROM MensagensEnviadas ORDER BY id ASC";
		List<MensagensEnviadas> msgEnviadas = JPA.em().createQuery(query).getResultList();
			
		return ok(views.html.mensagensEnviadas.render(msgEnviadas, getMaiorMensagensEnviadas(), getMenorMensagensEnviadas()));
	}
	
	//TRATAMENTO DOS DADOS SOBRE MENSAGENS ENVIADAS
	@Transactional
	public static List<Object> getMensagensEnviadas(){
		String query = "SELECT mr.useridfrom, u.firstname, u.lastname, COUNT(useridfrom) AS popularity\r\n" + 
				"FROM mdl_message_read mr INNER JOIN mdl_user u\r\n" + 
				"WHERE u.id=mr.useridfrom\r\n" + 
				"GROUP BY mr.useridfrom\r\n" + 
				"ORDER BY popularity DESC";
		List<Object> msg = JPA.em().createNativeQuery(query).getResultList();
		
		return msg;
	}
	
	@Transactional
	public static List<MensagensEnviadas> getMaiorMensagensEnviadas(){
		List<MensagensEnviadas> maiorMensagensEnviadas = new ArrayList<MensagensEnviadas>();
		MensagensEnviadas me1;
		
		String query = "SELECT firstname, msgenviadas "
				+ " FROM MensagensEnviadas "
				+ " ORDER BY msgenviadas ASC LIMIT 15";
		List<Object> aux = JPA.em().createNativeQuery(query).getResultList();
		
		for (Object result: aux) {
			me1 = new MensagensEnviadas();
			Object[] items = (Object[]) result;
			
			me1.setFirstname((String)items[0]);
			me1.setMsgenviadas(((Integer)items[1]).intValue());
			
			maiorMensagensEnviadas.add(me1);
		}
		
		return maiorMensagensEnviadas;
	}
	
	public static List<MensagensEnviadas> getMenorMensagensEnviadas(){
		List<MensagensEnviadas> menorMensagensEnviadas = new ArrayList<MensagensEnviadas>();
		MensagensEnviadas me2;
		
		String query = "SELECT firstname, msgenviadas "
				+ " FROM MensagensEnviadas "
				+ " ORDER BY msgenviadas DESC LIMIT 15";
		List<Object> aux = JPA.em().createNativeQuery(query).getResultList();
		
		for (Object result: aux) {
			me2 = new MensagensEnviadas();
			Object[] items = (Object[]) result;
			
			me2.setFirstname((String)items[0]);
			me2.setMsgenviadas(((Integer)items[1]).intValue());
			
			menorMensagensEnviadas.add(me2);
		}
		
		return menorMensagensEnviadas;
	}
	
	//SALVAR MENSAGENS ENVIADAS NO BANCO
	@Transactional
	public static Result salvarMensagensEnviadas() {
		List<Object> mensagens = getMensagensEnviadas();
		
		MensagensEnviadas me;
		
		for(Object result: mensagens){
			me = new MensagensEnviadas();
			Object[] items = (Object []) result;
			
			me.setUserid(((BigInteger)items[0]).intValue());
			me.setFirstname((String)items[1]);
			me.setLastname((String)items[2]);
			me.setMsgenviadas(((BigInteger)items[3]).intValue());
			
			try {
				JPA.em().merge(me);				
			} catch (Exception ex){
				return badRequest("Erro salvando dados " + ex.getLocalizedMessage());
			}
		}
		return ok("Salvo com sucesso. Acesse /recuperar para ver os dados salvos no banco");
	}
}