
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Celtic Games Online Store - """),_display_(/*9.41*/title),format.raw/*9.46*/("""</title>
    <!-- Bootstrap Core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href=""""),_display_(/*13.18*/routes/*13.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.65*/("""" rel="stylesheet" />
</head>

<body>

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="/">Celtic Games Online Store</a>
            </div>

            <ul class="nav navbar-nav">
                
                <li """),_display_(/*26.22*/if(title=="Products")/*26.43*/{_display_(Seq[Any](format.raw/*26.44*/("""class="active"""")))}),format.raw/*26.59*/(""">
                    <a href=""""),_display_(/*27.31*/routes/*27.37*/.HomeController.index()),format.raw/*27.60*/("""">Home</a>
                </li>

                <li """),_display_(/*30.22*/if(title=="Games")/*30.40*/{_display_(Seq[Any](format.raw/*30.41*/("""class="active"""")))}),format.raw/*30.56*/(""">
                    <a href="games">Games</a>
                </li>

                <li>
                    <a href="employee">Merchandise</a>
                </li>

                <li """),_display_(/*38.22*/if(title=="About Us")/*38.43*/{_display_(Seq[Any](format.raw/*38.44*/("""class="active"""")))}),format.raw/*38.59*/(""">
                    <a href="about">About</a>
                </li>

                <li """),_display_(/*42.22*/if(title=="Login")/*42.40*/{_display_(Seq[Any](format.raw/*42.41*/("""class="active"""")))}),format.raw/*42.56*/(""">
                    """),_display_(/*43.22*/if(user != null)/*43.38*/ {_display_(Seq[Any](format.raw/*43.40*/("""
                        """),format.raw/*44.25*/("""<a href=""""),_display_(/*44.35*/routes/*44.41*/.LoginController.logout()),format.raw/*44.66*/("""">Logout """),_display_(/*44.76*/user/*44.80*/.getName()),format.raw/*44.90*/("""</a>
                    """)))}/*45.23*/else/*45.28*/{_display_(Seq[Any](format.raw/*45.29*/("""
                        """),format.raw/*46.25*/("""<a href=""""),_display_(/*46.35*/routes/*46.41*/.LoginController.login()),format.raw/*46.65*/("""">Login</a>
                    """)))}),format.raw/*47.22*/("""
    
                """),format.raw/*49.17*/("""</li>

            </ul>

        </div>

    </nav>

    <container>
        <div class="row">
            <div class="col-md-12">
                """),_display_(/*60.18*/content),format.raw/*60.25*/("""
            """),format.raw/*61.13*/("""</div>
        </div>
    </container>

    <container>
        <footer>
        <row>
            <div class="col-md-12">
                Copyright
                <strong>Celtic Games</strong>
            </div>
        </row>
        </footer>
    </container>

    <script src=""""),_display_(/*76.19*/routes/*76.25*/.Assets.versioned("javascripts/main.js")),format.raw/*76.65*/(""""></script>
</body>

</html>"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 09 03:57:33 IST 2018
                  SOURCE: /home/wdd/webapps/Practice/PlayPractice12/CRUDPractice/play-java-seed/app/views/main.scala.html
                  HASH: 1a864f9ca0a5ac56cb2e45a590e19485164028d8
                  MATRIX: 970->1|1119->57|1146->58|1281->167|1306->172|1518->357|1533->363|1595->404|1956->738|1986->759|2025->760|2071->775|2130->807|2145->813|2189->836|2271->891|2298->909|2337->910|2383->925|2601->1116|2631->1137|2670->1138|2716->1153|2835->1245|2862->1263|2901->1264|2947->1279|2997->1302|3022->1318|3062->1320|3115->1345|3152->1355|3167->1361|3213->1386|3250->1396|3263->1400|3294->1410|3339->1437|3352->1442|3391->1443|3444->1468|3481->1478|3496->1484|3541->1508|3605->1541|3655->1563|3831->1712|3859->1719|3900->1732|4210->2015|4225->2021|4286->2061
                  LINES: 28->1|33->2|34->3|40->9|40->9|44->13|44->13|44->13|57->26|57->26|57->26|57->26|58->27|58->27|58->27|61->30|61->30|61->30|61->30|69->38|69->38|69->38|69->38|73->42|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|75->44|75->44|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|77->46|78->47|80->49|91->60|91->60|92->61|107->76|107->76|107->76
                  -- GENERATED --
              */
          