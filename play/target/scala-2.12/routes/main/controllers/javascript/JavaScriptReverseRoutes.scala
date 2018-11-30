// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/natha/Documents/play/conf/routes
// @DATE:Fri Nov 30 13:19:56 BRST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:9
package controllers.javascript {

  // @LINE:12
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def gerenciamentoTempo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.gerenciamentoTempo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "gerenciamentotempo"})
        }
      """
    )
  
    // @LINE:20
    def estabelecimentoMeta: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.estabelecimentoMeta",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "estabelecimentometa"})
        }
      """
    )
  
    // @LINE:15
    def dashboard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.dashboard",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard"})
        }
      """
    )
  
    // @LINE:17
    def realizacaoTarefas: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.realizacaoTarefas",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "realizacaotarefas"})
        }
      """
    )
  
    // @LINE:16
    def buscaAjuda: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.buscaAjuda",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "buscaajuda"})
        }
      """
    )
  
    // @LINE:18
    def autoavaliacao: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.autoavaliacao",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "autoavaliacao"})
        }
      """
    )
  
    // @LINE:12
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:14
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
