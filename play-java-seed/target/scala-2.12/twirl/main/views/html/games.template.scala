
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

object games extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Product],List[models.Category],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.69*/(""" """),format.raw/*1.70*/("""<!-- Declaring a parameter for the product list -->

"""),_display_(/*3.2*/main("Games")/*3.15*/{_display_(Seq[Any](format.raw/*3.16*/("""

    """),format.raw/*5.5*/("""<p class="lead">Product Catalogue</p>
    <div id="wrapper">
    <div class="row">
        <div class="col-sm-2">
            <h4>Categories</h4>
            <div class="list-group">
              <a href=""""),_display_(/*11.25*/routes/*11.31*/.HomeController.games(0)),format.raw/*11.55*/("""" class="list-group-item">All categories</a>
                    """),_display_(/*12.22*/for(c <- categories) yield /*12.42*/{_display_(Seq[Any](format.raw/*12.43*/("""
                      """),format.raw/*13.23*/("""<a href=""""),_display_(/*13.33*/routes/*13.39*/.HomeController.games(c.getId)),format.raw/*13.69*/("""" class="list-group-item">"""),_display_(/*13.96*/c/*13.97*/.getName),format.raw/*13.105*/("""
                          """),format.raw/*14.27*/("""<span class="badge">"""),_display_(/*14.48*/c/*14.49*/.getProducts.size()),format.raw/*14.68*/("""</span>
                      </a>
                    """)))}),format.raw/*16.22*/("""
            """),format.raw/*17.13*/("""</div>
        </div>
        <div class="col-sm-10">
    
      
    
    """),format.raw/*23.66*/("""
    """),_display_(/*24.6*/if(flash.containsKey("success"))/*24.38*/ {_display_(Seq[Any](format.raw/*24.40*/("""
      """),format.raw/*25.7*/("""<div class="alert alert-success">
        """),_display_(/*26.10*/flash/*26.15*/.get("success")),format.raw/*26.30*/("""
      """),format.raw/*27.7*/("""</div>
    """)))}),format.raw/*28.6*/("""
    """),format.raw/*29.5*/("""<table class="table table-bordered table-hover table-condensed">
    
      <thead>
    
        <!-- The header row-->
    
        <tr>
    
          <th>Name</th>
    
          <th>Genre</th>
    
          <th>Description</th>
    
          <th>Stock</th>
    
          <th>Price</th>
    
        </tr>
    
      </thead>
    
      <tbody>
    
        <!-- Product row(s) -->
        """),format.raw/*55.33*/("""
        """),_display_(/*56.10*/for(p<-products) yield /*56.26*/{_display_(Seq[Any](format.raw/*56.27*/(""" 
          """),format.raw/*57.11*/("""<tr>
              
              <td>"""),_display_(/*59.20*/p/*59.21*/.getName),format.raw/*59.29*/("""</td>
              <td>"""),_display_(/*60.20*/p/*60.21*/.getCategory.getName),format.raw/*60.41*/("""</td>
              <td>"""),_display_(/*61.20*/p/*61.21*/.getDescription),format.raw/*61.36*/(""" """),format.raw/*61.37*/("""</td>
              <td>"""),_display_(/*62.20*/p/*62.21*/.getStock),format.raw/*62.30*/(""" """),format.raw/*62.31*/("""</td>
              
              <td>&euro; """),_display_(/*64.27*/("%.2f".format(p.getPrice))),format.raw/*64.54*/(""" """),format.raw/*64.55*/("""</td> 
              
              <td>
                  <a href=""""),_display_(/*67.29*/routes/*67.35*/.HomeController.updateProduct(p.getId)),format.raw/*67.73*/("""" class="button-xs btn-danger">
                      <span class="glyphicon glyphicon-pencil"></span>
                  </a>
              </td>
    
              <!-- Delete button -->
              <td>
                  <a href=""""),_display_(/*74.29*/routes/*74.35*/.HomeController.deleteProduct(p.getId)),format.raw/*74.73*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                      <span class="glyphicon glyphicon-trash"></span>
                  </a>
              </td>
          </tr>
        """)))}),format.raw/*79.10*/(""" """),format.raw/*79.28*/("""
    
    
      """),format.raw/*82.7*/("""</tbody>
    
    </table>
    
    <p>
        <a href =""""),_display_(/*87.20*/routes/*87.26*/.HomeController.addProduct()),format.raw/*87.54*/("""">
            <button class=btn "btn-primary">Add a product</button>
        </a>
    </p>
      </div>
    
    </div>

</div>
""")))}))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category]): play.twirl.api.HtmlFormat.Appendable = apply(products,categories)

  def f:((List[models.Product],List[models.Category]) => play.twirl.api.HtmlFormat.Appendable) = (products,categories) => apply(products,categories)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 23 00:03:58 GMT 2018
                  SOURCE: /home/wdd/webapps/Practice/PlayPractice12/CRUDPractice/play-java-seed/app/views/games.scala.html
                  HASH: da524e237a54b4133fd740b8cf7c98c742b5f947
                  MATRIX: 984->1|1146->68|1174->69|1253->123|1274->136|1312->137|1344->143|1578->350|1593->356|1638->380|1731->446|1767->466|1806->467|1857->490|1894->500|1909->506|1960->536|2014->563|2024->564|2054->572|2109->599|2157->620|2167->621|2207->640|2294->696|2335->709|2438->845|2470->851|2511->883|2551->885|2585->892|2655->935|2669->940|2705->955|2739->962|2781->974|2813->979|3237->1483|3274->1493|3306->1509|3345->1510|3385->1522|3451->1561|3461->1562|3490->1570|3542->1595|3552->1596|3593->1616|3645->1641|3655->1642|3691->1657|3720->1658|3772->1683|3782->1684|3812->1693|3841->1694|3915->1741|3963->1768|3992->1769|4088->1838|4103->1844|4162->1882|4424->2117|4439->2123|4498->2161|4730->2362|4759->2380|4803->2397|4889->2456|4904->2462|4953->2490
                  LINES: 28->1|33->1|33->1|35->3|35->3|35->3|37->5|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|48->16|49->17|55->23|56->24|56->24|56->24|57->25|58->26|58->26|58->26|59->27|60->28|61->29|86->55|87->56|87->56|87->56|88->57|90->59|90->59|90->59|91->60|91->60|91->60|92->61|92->61|92->61|92->61|93->62|93->62|93->62|93->62|95->64|95->64|95->64|98->67|98->67|98->67|105->74|105->74|105->74|110->79|110->79|113->82|118->87|118->87|118->87
                  -- GENERATED --
              */
          