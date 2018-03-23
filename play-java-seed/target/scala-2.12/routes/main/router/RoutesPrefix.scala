// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/Practice/PlayPractice12/CRUDPractice/play-java-seed/conf/routes
// @DATE:Fri Mar 23 00:20:30 GMT 2018


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
