package controllers;

import play.mvc.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render());
    }

    /* public Result about() {
        return ok(views.html.about.render());
    } */

    public Result login() {
        return ok(views.html.login.render());
    }

    public Result signUp() {
        return ok(views.html.signup.render());
    }

    public Result forgetPassword() {
        return ok(views.html.forgetpassword.render());
    }

    public Result dashboard() {
        return ok(views.html.dashboard2.render());
    }
    
    public Result buscaAjuda() {
    	return ok(views.html.buscaAjuda.render());
    }
    
    /* public Result buscaAjudaCurso(int codCurso) {
        list dadosAlunos = select * from pedidoAjuda;
        list dadosProfessores = select * from pedidoAjuda;
    	return ok(views.html.listagemAjuda.render(dadosAlunos, dadosProfessores));
    } */

    public Result realizacaoTarefas() {
    	return ok(views.html.realizacaoTarefas.render());
    }
    
    public Result autoavaliacao() {
    	return ok(views.html.autoavaliacao.render());
    }
    
    public Result gerenciamentoTempo() {
    	return ok(views.html.gerenciamentoTempo.render());
    }
    
    public Result estabelecimentoMeta() {
    	return ok(views.html.estabelecimentoMeta.render());
    }
}

