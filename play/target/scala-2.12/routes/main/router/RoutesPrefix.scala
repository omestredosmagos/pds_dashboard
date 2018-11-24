// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/natha/Documents/play/conf/routes
// @DATE:Sat Nov 24 15:02:23 BRST 2018


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
