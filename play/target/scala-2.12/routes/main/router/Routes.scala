// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/natha/Documents/play/conf/routes
// @DATE:Mon Nov 26 20:57:16 BRST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:9
  Assets_1: controllers.Assets,
  // @LINE:12
  HomeController_0: controllers.HomeController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:9
    Assets_1: controllers.Assets,
    // @LINE:12
    HomeController_0: controllers.HomeController
  ) = this(errorHandler, Assets_1, HomeController_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_1, HomeController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard""", """controllers.HomeController.dashboard"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """buscaajuda""", """controllers.HomeController.buscaAjuda"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """realizacaotarefas""", """controllers.HomeController.realizacaoTarefas"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """autoavaliacao""", """controllers.HomeController.autoavaliacao"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """gerenciamentotempo""", """controllers.HomeController.gerenciamentoTempo"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """estabelecimentometa""", """controllers.HomeController.estabelecimentoMeta"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:9
  private[this] lazy val controllers_Assets_versioned0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned0_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index1_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_login2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_login2_invoker = createInvoker(
    HomeController_0.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """ GET     /about                      controllers.HomeController.about""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_dashboard3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard")))
  )
  private[this] lazy val controllers_HomeController_dashboard3_invoker = createInvoker(
    HomeController_0.dashboard,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "dashboard",
      Nil,
      "GET",
      this.prefix + """dashboard""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_buscaAjuda4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("buscaajuda")))
  )
  private[this] lazy val controllers_HomeController_buscaAjuda4_invoker = createInvoker(
    HomeController_0.buscaAjuda,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "buscaAjuda",
      Nil,
      "GET",
      this.prefix + """buscaajuda""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_realizacaoTarefas5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("realizacaotarefas")))
  )
  private[this] lazy val controllers_HomeController_realizacaoTarefas5_invoker = createInvoker(
    HomeController_0.realizacaoTarefas,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "realizacaoTarefas",
      Nil,
      "GET",
      this.prefix + """realizacaotarefas""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_autoavaliacao6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("autoavaliacao")))
  )
  private[this] lazy val controllers_HomeController_autoavaliacao6_invoker = createInvoker(
    HomeController_0.autoavaliacao,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "autoavaliacao",
      Nil,
      "GET",
      this.prefix + """autoavaliacao""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_gerenciamentoTempo7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("gerenciamentotempo")))
  )
  private[this] lazy val controllers_HomeController_gerenciamentoTempo7_invoker = createInvoker(
    HomeController_0.gerenciamentoTempo,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "gerenciamentoTempo",
      Nil,
      "GET",
      this.prefix + """gerenciamentotempo""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_estabelecimentoMeta8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("estabelecimentometa")))
  )
  private[this] lazy val controllers_HomeController_estabelecimentoMeta8_invoker = createInvoker(
    HomeController_0.estabelecimentoMeta,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "estabelecimentoMeta",
      Nil,
      "GET",
      this.prefix + """estabelecimentometa""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:9
    case controllers_Assets_versioned0_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned0_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:12
    case controllers_HomeController_index1_route(params@_) =>
      call { 
        controllers_HomeController_index1_invoker.call(HomeController_0.index)
      }
  
    // @LINE:14
    case controllers_HomeController_login2_route(params@_) =>
      call { 
        controllers_HomeController_login2_invoker.call(HomeController_0.login)
      }
  
    // @LINE:15
    case controllers_HomeController_dashboard3_route(params@_) =>
      call { 
        controllers_HomeController_dashboard3_invoker.call(HomeController_0.dashboard)
      }
  
    // @LINE:16
    case controllers_HomeController_buscaAjuda4_route(params@_) =>
      call { 
        controllers_HomeController_buscaAjuda4_invoker.call(HomeController_0.buscaAjuda)
      }
  
    // @LINE:17
    case controllers_HomeController_realizacaoTarefas5_route(params@_) =>
      call { 
        controllers_HomeController_realizacaoTarefas5_invoker.call(HomeController_0.realizacaoTarefas)
      }
  
    // @LINE:18
    case controllers_HomeController_autoavaliacao6_route(params@_) =>
      call { 
        controllers_HomeController_autoavaliacao6_invoker.call(HomeController_0.autoavaliacao)
      }
  
    // @LINE:19
    case controllers_HomeController_gerenciamentoTempo7_route(params@_) =>
      call { 
        controllers_HomeController_gerenciamentoTempo7_invoker.call(HomeController_0.gerenciamentoTempo)
      }
  
    // @LINE:20
    case controllers_HomeController_estabelecimentoMeta8_route(params@_) =>
      call { 
        controllers_HomeController_estabelecimentoMeta8_invoker.call(HomeController_0.estabelecimentoMeta)
      }
  }
}
