
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

object addEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Employee],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employeeForm: Form[models.Employee], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Employee", user)/*5.28*/ {_display_(Seq[Any](format.raw/*5.30*/("""
    """),format.raw/*6.5*/("""<p class="lead"> Add a new Employee</p>

        <!-- Using the views.html.elpers package to create the form -->
        """),_display_(/*9.10*/form(action=routes.HomeController.addEmployeeSubmit(), 'class -> "form-horizontal", 'role -> "form")/*9.110*/ {_display_(Seq[Any](format.raw/*9.112*/("""
            """),format.raw/*10.41*/("""
            """),format.raw/*11.103*/("""
            """),_display_(/*12.14*/CSRF/*12.18*/.formField),format.raw/*12.28*/("""
    
            """),format.raw/*14.13*/("""<!-- Build the form, adding an input for each field -->
            <!-- Note the label parameter -->
            """),_display_(/*16.14*/inputText(employeeForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*16.90*/("""
            """),_display_(/*17.14*/inputText(employeeForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*17.92*/("""
            """),_display_(/*18.14*/inputText(employeeForm("department"), '_label -> "Department", 'class -> "form-control")),format.raw/*18.102*/("""
            """),_display_(/*19.14*/inputText(employeeForm("DOB"), '_label -> "Date of Birth", 'class -> "form-control")),format.raw/*19.98*/("""
    
            """),format.raw/*21.13*/("""<!-- Add a submit button -->
            """),_display_(/*22.14*/inputText(employeeForm("employee_Num"), '_label -> "", 'hidden-> "hidden")),format.raw/*22.88*/("""
    
            """),format.raw/*24.13*/("""<!-- Add a submit button -->
            <div class="actions">
                <input type="submit" value="Add/Update Employee" class="btn btn-primary">
                <a href=""""),_display_(/*27.27*/routes/*27.33*/.HomeController.employee),format.raw/*27.57*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
        """)))}),format.raw/*31.10*/(""" """),format.raw/*31.28*/("""

""")))}))
      }
    }
  }

  def render(employeeForm:Form[models.Employee],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(employeeForm,user)

  def f:((Form[models.Employee],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (employeeForm,user) => apply(employeeForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 09 04:58:38 IST 2018
                  SOURCE: /home/wdd/webapps/Practice/PlayPractice12/CRUDPractice/play-java-seed/app/views/addEmployee.scala.html
                  HASH: 71ecd469b8a080880eca09f51dafd019c1fb368c
                  MATRIX: 987->1|1122->66|1166->64|1193->82|1220->84|1254->110|1293->112|1324->117|1472->239|1581->339|1621->341|1662->382|1704->485|1745->499|1758->503|1789->513|1835->531|1977->646|2074->722|2115->736|2214->814|2255->828|2365->916|2406->930|2511->1014|2557->1032|2626->1074|2721->1148|2767->1166|2973->1345|2988->1351|3033->1375|3198->1509|3227->1527
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|40->9|40->9|40->9|41->10|42->11|43->12|43->12|43->12|45->14|47->16|47->16|48->17|48->17|49->18|49->18|50->19|50->19|52->21|53->22|53->22|55->24|58->27|58->27|58->27|62->31|62->31
                  -- GENERATED --
              */
          