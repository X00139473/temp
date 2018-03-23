
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.users.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Login")/*4.15*/{_display_(Seq[Any](format.raw/*4.16*/("""

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

  def render(loginForm:Form[models.users.Login]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[models.users.Login]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 11 22:28:28 GMT 2018
                  SOURCE: /home/wdd/webapps/Practice/PlayPractice12/CRUDPractice/play-java-seed/app/views/login.scala.html
                  HASH: beffc97ae01ec83853621c83600ff406bb7b53dc
                  MATRIX: 966->1|1076->40|1120->56|1147->58|1168->71|1206->72|1238->78|1375->189|1412->218|1450->219|1491->232|1568->282|1586->291|1627->311|1668->324|1713->338|1750->348|1789->378|1828->379|1869->392|1945->441|1959->446|2001->467|2042->480|2087->494|2124->504|2186->539|2201->545|2274->609|2314->611|2355->625|2368->629|2399->639|2441->653|2510->695|2651->815|2692->828|2780->889|2931->1019|2972->1032|3153->1182|3182->1200|3214->1205
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|37->6|40->9|40->9|40->9|41->10|42->11|42->11|42->11|43->12|44->13|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|49->18|51->20|53->22|53->22|53->22|53->22|54->23|54->23|54->23|56->25|57->26|58->27|59->28|61->30|62->31|63->32|67->36|67->36|68->37
                  -- GENERATED --
              */
          