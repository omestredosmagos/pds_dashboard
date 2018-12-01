// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/natha/Documents/play/conf/routes
// @DATE:Fri Nov 30 22:15:40 BRST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
