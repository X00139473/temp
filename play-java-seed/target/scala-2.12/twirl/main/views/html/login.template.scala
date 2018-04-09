
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Login", user)/*4.21*/{_display_(Seq[Any](format.raw/*4.22*/("""

    """),format.raw/*6.5*/("""<div class="col-xs-s4">
        <h3>Sign in</h3>
        <!-- Displays login errors if they exist -->
        """),_display_(/*9.10*/if(loginForm.hasGlobalErrors)/*9.39*/{_display_(Seq[Any](format.raw/*9.40*/("""
            """),format.raw/*10.13*/("""<p class="alert alert-warning"> 
                """),_display_(/*11.18*/loginForm/*11.27*/.globalError.message),format.raw/*11.47*/("""
            """),format.raw/*12.13*/("""</p>
        """)))}),format.raw/*13.10*/("""
        """),_display_(/*14.10*/if(flash.containsKey("error"))/*14.40*/{_display_(Seq[Any](format.raw/*14.41*/("""
            """),format.raw/*15.13*/("""<p class="alert alert-warning">
                """),_display_(/*16.18*/flash/*16.23*/.get("loginRequired")),format.raw/*16.44*/("""
            """),format.raw/*17.13*/("""</p>
        """)))}),format.raw/*18.10*/("""

        """),format.raw/*20.9*/("""<!-- The  Login form -->

        """),_display_(/*22.10*/helper/*22.16*/.form(action = controllers.routes.LoginController.loginSubmit())/*22.80*/ {_display_(Seq[Any](format.raw/*22.82*/("""
            """),_display_(/*23.14*/CSRF/*23.18*/.formField),format.raw/*23.28*/("""

            """),format.raw/*25.13*/("""<div class="form-group">
                """),_display_(/*26.18*/inputText(loginForm("email"), '_label -> "",
                'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*27.76*/("""
            """),format.raw/*28.13*/("""</div>
            <div class="form-group">
                """),_display_(/*30.18*/inputPassword(loginForm("password"), '_label -> "",
                'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*31.79*/("""
            """),format.raw/*32.13*/("""</div>
            <div class="form-group">
                <input type="submit" value="Sign In" class="btn btn-primary">
            </div>
        """)))}),format.raw/*36.10*/(""" """),format.raw/*36.28*/("""
    """),format.raw/*37.5*/("""</div>
""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 09 04:58:38 IST 2018
                  SOURCE: /home/wdd/webapps/Practice/PlayPractice12/CRUDPractice/play-java-seed/app/views/login.scala.html
                  HASH: 9aea15be24d87b2440dec28d9347a4b85bf50691
                  MATRIX: 984->1|1118->64|1162->80|1189->82|1216->101|1254->102|1286->108|1423->219|1460->248|1498->249|1539->262|1616->312|1634->321|1675->341|1716->354|1761->368|1798->378|1837->408|1876->409|1917->422|1993->471|2007->476|2049->497|2090->510|2135->524|2172->534|2234->569|2249->575|2322->639|2362->641|2403->655|2416->659|2447->669|2489->683|2558->725|2699->845|2740->858|2828->919|2979->1049|3020->1062|3201->1212|3230->1230|3262->1235
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|37->6|40->9|40->9|40->9|41->10|42->11|42->11|42->11|43->12|44->13|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|49->18|51->20|53->22|53->22|53->22|53->22|54->23|54->23|54->23|56->25|57->26|58->27|59->28|61->30|62->31|63->32|67->36|67->36|68->37
                  -- GENERATED --
              */
          