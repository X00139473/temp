
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

<head>

    <meta charset="utf-8">

    <title>Celtic Games Online Store - """),_display_(/*11.41*/title),format.raw/*11.46*/("""</title>

    <!-- Bootstrap Core CSS -->

    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />

    <!-- Custom CSS -->
    <link href=""""),_display_(/*18.18*/routes/*18.24*/.Assets.versioned(" stylesheets/main.css ")),format.raw/*18.67*/("""" rel="stylesheet" type="text/css"/>

</head>

<body>

    <nav class="navbar navbar-inverse">

        <div class="container-fluid">

            <div class="navbar-header">

                <a class="navbar-brand" href="/">Celtic Games Online Store</a>

            </div>

            <ul class="nav navbar-nav">
                <li """),_display_(/*35.22*/if(title=="Products")/*35.43*/{_display_(Seq[Any](format.raw/*35.44*/("""class="active"""")))}),format.raw/*35.59*/(""">
                    <a href=""""),_display_(/*36.31*/routes/*36.37*/.HomeController.index()),format.raw/*36.60*/("""">Home</a>
                </li>
                <li """),_display_(/*38.22*/if(title=="About Us")/*38.43*/{_display_(Seq[Any](format.raw/*38.44*/("""class="active"""")))}),format.raw/*38.59*/(""">
                    <a href="about">About</a>
                </li>

                <li """),_display_(/*42.22*/if(title=="Games")/*42.40*/{_display_(Seq[Any](format.raw/*42.41*/("""class="active"""")))}),format.raw/*42.56*/(""">
                    <a href="games">Games</a>
                </li>

                <li>
                    <a href="employee">Merchandise</a>
                </li>

                <li """),_display_(/*50.22*/if(title=="Login")/*50.40*/{_display_(Seq[Any](format.raw/*50.41*/("""class="active"""")))}),format.raw/*50.56*/(""">
                    <a href=""""),_display_(/*51.31*/routes/*51.37*/.LoginController.login()),format.raw/*51.61*/("""">Login</a>
                </li>

            </ul>

        </div>

    </nav>

    <container>

        <div class="row">

            <div class="col-md-12">

                """),_display_(/*66.18*/content),format.raw/*66.25*/("""

            """),format.raw/*68.13*/("""</div>

        </div>

    </container>

    <container>

        <div class="row">

            <div class="col-md-12">

                Copyright
                <strong>Celtic Games</strong>

            </div>

        </div>

    </container>
    <script src=""""),_display_(/*88.19*/routes/*88.25*/.Assets.versioned("javascripts/main.js")),format.raw/*88.65*/(""""></script>"
</body>
</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 23 01:13:33 GMT 2018
                  SOURCE: /home/wdd/webapps/Practice/PlayPractice12/CRUDPractice/play-java-seed/app/views/main.scala.html
                  HASH: 7eaf80b0c73dd81dd2fee4bd1ff6133bc05a45f2
                  MATRIX: 952->1|1076->32|1103->33|1241->144|1267->149|1482->337|1497->343|1561->386|1925->723|1955->744|1994->745|2040->760|2099->792|2114->798|2158->821|2239->875|2269->896|2308->897|2354->912|2473->1004|2500->1022|2539->1023|2585->1038|2803->1229|2830->1247|2869->1248|2915->1263|2974->1295|2989->1301|3034->1325|3241->1505|3269->1512|3311->1526|3605->1793|3620->1799|3681->1839
                  LINES: 28->1|33->2|34->3|42->11|42->11|49->18|49->18|49->18|66->35|66->35|66->35|66->35|67->36|67->36|67->36|69->38|69->38|69->38|69->38|73->42|73->42|73->42|73->42|81->50|81->50|81->50|81->50|82->51|82->51|82->51|97->66|97->66|99->68|119->88|119->88|119->88
                  -- GENERATED --
              */
          