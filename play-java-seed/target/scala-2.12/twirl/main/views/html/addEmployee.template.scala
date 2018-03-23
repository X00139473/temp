
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

object addEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.Employee],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employeeForm: Form[models.Employee]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Employee")/*5.22*/ {_display_(Seq[Any](format.raw/*5.24*/("""
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

  def render(employeeForm:Form[models.Employee]): play.twirl.api.HtmlFormat.Appendable = apply(employeeForm)

  def f:((Form[models.Employee]) => play.twirl.api.HtmlFormat.Appendable) = (employeeForm) => apply(employeeForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 11 15:47:14 GMT 2018
                  SOURCE: /home/wdd/webapps/Practice/PlayPractice12/CRUDPractice/play-java-seed/app/views/addEmployee.scala.html
                  HASH: be925ee6a8a2a1bdb198bcd1e2fe3d9687a3a378
                  MATRIX: 969->1|1079->41|1123->39|1150->57|1177->59|1205->79|1244->81|1275->86|1423->208|1532->308|1572->310|1613->351|1655->454|1696->468|1709->472|1740->482|1786->500|1928->615|2025->691|2066->705|2165->783|2206->797|2316->885|2357->899|2462->983|2508->1001|2577->1043|2672->1117|2718->1135|2924->1314|2939->1320|2984->1344|3149->1478|3178->1496
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|40->9|40->9|40->9|41->10|42->11|43->12|43->12|43->12|45->14|47->16|47->16|48->17|48->17|49->18|49->18|50->19|50->19|52->21|53->22|53->22|55->24|58->27|58->27|58->27|62->31|62->31
                  -- GENERATED --
              */
          