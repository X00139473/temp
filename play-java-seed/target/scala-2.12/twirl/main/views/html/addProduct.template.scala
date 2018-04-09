
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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add product", user)/*5.27*/{_display_(Seq[Any](format.raw/*5.28*/("""
    
    """),format.raw/*7.5*/("""<p class="lead">Add or update a product </p>

    <!-- Using the views.html.elpers package to create the form -->
    """),_display_(/*10.6*/form(action=routes.HomeController.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form", 'enctype -> "multipart/form-data")/*10.140*/ {_display_(Seq[Any](format.raw/*10.142*/("""
        """),format.raw/*11.37*/("""
        """),format.raw/*12.99*/("""
        """),_display_(/*13.10*/CSRF/*13.14*/.formField),format.raw/*13.24*/("""

        """),format.raw/*15.9*/("""<!-- Build the form, adding an input for each field -->
        <!-- Note the label parameter -->
        """),_display_(/*17.10*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*17.85*/("""
        """),_display_(/*18.10*/inputText(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*18.99*/("""
        """),_display_(/*19.10*/select(
            productForm("category.id"),
            options(Category.options),
            '_label -> "Category", '_default -> "-- Choose a category --",
            '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*24.10*/("""
        """),_display_(/*25.10*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*25.87*/("""
        """),_display_(/*26.10*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*26.87*/("""

        """),format.raw/*28.9*/("""<!-- Add a submit button -->
        """),_display_(/*29.10*/inputText(productForm("id"), '_label -> "", 'hidden-> "hidden")),format.raw/*29.73*/("""
    
        """),format.raw/*31.9*/("""<label>Upload product image</label>
        <input class="btn-sm btn-default" type="file" name="upload">
        <br><br>

        <!-- Add a submit button -->
        <div class="actions">
            <input type="submit" value="Add/Update Product" class="btn btn-primary">
            <a href=""""),_display_(/*38.23*/routes/*38.29*/.HomeController.games(0)),format.raw/*38.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*42.6*/(""" """),format.raw/*42.24*/("""


""")))}),format.raw/*45.2*/(""" """),format.raw/*45.28*/("""
"""))
      }
    }
  }

  def render(productForm:Form[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(productForm,user)

  def f:((Form[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (productForm,user) => apply(productForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 09 04:58:38 IST 2018
                  SOURCE: /home/wdd/webapps/Practice/PlayPractice12/CRUDPractice/play-java-seed/app/views/addProduct.scala.html
                  HASH: 1d6a1c8a9faabf1a46c484f03f801f7ad16ac80b
                  MATRIX: 985->1|1118->64|1162->62|1189->80|1216->82|1249->107|1287->108|1323->118|1468->237|1612->371|1653->373|1690->410|1727->509|1764->519|1777->523|1808->533|1845->543|1979->650|2075->725|2112->735|2222->824|2259->834|2516->1070|2553->1080|2651->1157|2688->1167|2786->1244|2823->1254|2888->1292|2972->1355|3013->1369|3337->1666|3352->1672|3397->1696|3545->1814|3574->1832|3608->1836|3637->1862
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|38->7|41->10|41->10|41->10|42->11|43->12|44->13|44->13|44->13|46->15|48->17|48->17|49->18|49->18|50->19|55->24|56->25|56->25|57->26|57->26|59->28|60->29|60->29|62->31|69->38|69->38|69->38|73->42|73->42|76->45|76->45
                  -- GENERATED --
              */
          