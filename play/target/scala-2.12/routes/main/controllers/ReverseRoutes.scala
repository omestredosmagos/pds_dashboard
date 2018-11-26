// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/natha/Documents/play/conf/routes
// @DATE:Mon Nov 26 20:57:16 BRST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:9
package controllers {

  // @LINE:12
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def gerenciamentoTempo(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "gerenciamentotempo")
    }
  
    // @LINE:20
    def estabelecimentoMeta(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "estabelecimentometa")
    }
  
    // @LINE:15
    def dashboard(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dashboard")
    }
  
    // @LINE:17
    def realizacaoTarefas(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "realizacaotarefas")
    }
  
    // @LINE:16
    def buscaAjuda(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "buscaajuda")
    }
  
    // @LINE:18
    def autoavaliacao(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "autoavaliacao")
    }
  
    // @LINE:12
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:14
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:9
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
