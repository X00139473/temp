
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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add product")/*5.21*/{_display_(Seq[Any](format.raw/*5.22*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add or update a product </p>

    <!-- Using the views.html.elpers package to create the form -->
    """),_display_(/*9.6*/form(action=routes.HomeController.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form")/*9.105*/ {_display_(Seq[Any](format.raw/*9.107*/("""
        """),format.raw/*10.37*/("""
        """),format.raw/*11.99*/("""
        """),_display_(/*12.10*/CSRF/*12.14*/.formField),format.raw/*12.24*/("""

        """),format.raw/*14.9*/("""<!-- Build the form, adding an input for each field -->
        <!-- Note the label parameter -->
        """),_display_(/*16.10*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*16.85*/("""
        """),_display_(/*17.10*/inputText(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*17.99*/("""
        """),_display_(/*18.10*/select(
            productForm("category.id"),
            options(Category.options),
            '_label -> "Category", '_default -> "-- Choose a category --",
            '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*23.10*/("""
        """),_display_(/*24.10*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*24.87*/("""
        """),_display_(/*25.10*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*25.87*/("""

        """),format.raw/*27.9*/("""<!-- Add a submit button -->
        """),_display_(/*28.10*/inputText(productForm("id"), '_label -> "", 'hidden-> "hidden")),format.raw/*28.73*/("""

        """),format.raw/*30.9*/("""<!-- Add a submit button -->
        <div class="actions">
            <input type="submit" value="Add/Update Product" class="btn btn-primary">
            <a href=""""),_display_(/*33.23*/routes/*33.29*/.HomeController.games(0)),format.raw/*33.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*37.6*/(""" """),format.raw/*37.24*/("""
""")))}),format.raw/*38.2*/(""" """),format.raw/*38.28*/("""
"""))
      }
    }
  }

  def render(productForm:Form[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(productForm)

  def f:((Form[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (productForm) => apply(productForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 22 23:20:52 GMT 2018
                  SOURCE: /home/wdd/webapps/Practice/PlayPractice12/CRUDPractice/play-java-seed/app/views/addProduct.scala.html
                  HASH: 8140c1b287b56877e41b6e6f95530e70589e796e
                  MATRIX: 967->1|1075->39|1119->37|1146->55|1173->57|1200->76|1238->77|1269->82|1413->201|1521->300|1561->302|1598->339|1635->438|1672->448|1685->452|1716->462|1753->472|1887->579|1983->654|2020->664|2130->753|2167->763|2424->999|2461->1009|2559->1086|2596->1096|2694->1173|2731->1183|2796->1221|2880->1284|2917->1294|3110->1460|3125->1466|3170->1490|3318->1608|3347->1626|3379->1628|3408->1654
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|40->9|40->9|40->9|41->10|42->11|43->12|43->12|43->12|45->14|47->16|47->16|48->17|48->17|49->18|54->23|55->24|55->24|56->25|56->25|58->27|59->28|59->28|61->30|64->33|64->33|64->33|68->37|68->37|69->38|69->38
                  -- GENERATED --
              */
          