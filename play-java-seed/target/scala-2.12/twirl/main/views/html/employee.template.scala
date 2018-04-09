
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

object employee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Employee],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[models.Employee], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.61*/(""" """),format.raw/*1.62*/("""<!-- Declaring a parameter for the product list -->

"""),_display_(/*3.2*/main("Employees", user)/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

"""),format.raw/*5.1*/("""<p class="lead">Merchandise</p>

"""),format.raw/*7.62*/("""
"""),_display_(/*8.2*/if(flash.containsKey("success"))/*8.34*/ {_display_(Seq[Any](format.raw/*8.36*/("""
  """),format.raw/*9.3*/("""<div class="alert alert-success">
    """),_display_(/*10.6*/flash/*10.11*/.get("success")),format.raw/*10.26*/("""
  """),format.raw/*11.3*/("""</div>
""")))}),format.raw/*12.2*/("""

"""),format.raw/*14.1*/("""<table class="table table-bordered table-hover table-condensed">

  <thead>

    <!-- The header row-->

    <tr>

    

      <th>Name</th>

      

      <th>Colour</th>

      

    </tr>

  </thead>

  <tbody>

    <!-- Product row(s) -->
    """),format.raw/*40.29*/("""
    """),_display_(/*41.6*/for(e<-employees) yield /*41.23*/{_display_(Seq[Any](format.raw/*41.24*/(""" 
      """),format.raw/*42.7*/("""<tr>
    
          <td>"""),_display_(/*44.16*/e/*44.17*/.getName),format.raw/*44.25*/("""</td>
          
          <td>"""),_display_(/*46.16*/e/*46.17*/.getDepartment),format.raw/*46.31*/(""" """),format.raw/*46.32*/("""</td>
          


      </tr>
    """)))}),format.raw/*51.6*/(""" """),format.raw/*51.24*/("""


  """),format.raw/*54.3*/("""</tbody>

</table>

<p>
    <a href =""""),_display_(/*59.16*/routes/*59.22*/.HomeController.addEmployee()),format.raw/*59.51*/("""">
        <button class=btn "btn-primary">Add a product</button>
    </a>
</p>

""")))}))
      }
    }
  }

  def render(employees:List[models.Employee],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(employees,user)

  def f:((List[models.Employee],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (employees,user) => apply(employees,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 09 03:46:39 IST 2018
                  SOURCE: /home/wdd/webapps/Practice/PlayPractice12/CRUDPractice/play-java-seed/app/views/employee.scala.html
                  HASH: 4691bed6ff34b0f6912816d83c87b95d4ec05013
                  MATRIX: 984->1|1138->60|1166->61|1245->115|1276->138|1315->140|1343->142|1403->236|1430->238|1470->270|1509->272|1538->275|1603->314|1617->319|1653->334|1683->337|1721->345|1750->347|2025->698|2057->704|2090->721|2129->722|2164->730|2216->755|2226->756|2255->764|2314->796|2324->797|2359->811|2388->812|2454->848|2483->866|2515->871|2581->910|2596->916|2646->945
                  LINES: 28->1|33->1|33->1|35->3|35->3|35->3|37->5|39->7|40->8|40->8|40->8|41->9|42->10|42->10|42->10|43->11|44->12|46->14|71->40|72->41|72->41|72->41|73->42|75->44|75->44|75->44|77->46|77->46|77->46|77->46|82->51|82->51|85->54|90->59|90->59|90->59
                  -- GENERATED --
              */
          