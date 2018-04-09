
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

object games extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.Product],List[models.Category],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.121*/(""" """),format.raw/*1.122*/("""<!-- Declaring a parameter for the product list -->

"""),_display_(/*3.2*/main("Games", user)/*3.21*/{_display_(Seq[Any](format.raw/*3.22*/("""
    """),format.raw/*4.5*/("""<div class ="wrapper">
    <p class="lead">Product Catalogue</p>
    <br>
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
          <th>Image</th>

          <th>Name</th>
    
          <th>Genre</th>
    
          <th>Description</th>
    
          <th>Stock</th>
    
          <th>Price</th>
    
        </tr>
    
      </thead>
    
      <tbody>
    
        <!-- Product row(s) -->
        """),format.raw/*56.33*/("""
        """),_display_(/*57.10*/for(p<-products) yield /*57.26*/{_display_(Seq[Any](format.raw/*57.27*/(""" 
          """),format.raw/*58.11*/("""<tr>
              """),_display_(/*59.16*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".png").isDefined)/*59.104*/ {_display_(Seq[Any](format.raw/*59.106*/("""
                    """),format.raw/*60.21*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*60.76*/(p.getId + ".png")),format.raw/*60.94*/(""""/></td>
                """)))}/*61.19*/else/*61.24*/{_display_(Seq[Any](format.raw/*61.25*/("""
                    """),format.raw/*62.21*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.png"/></td>
                """)))}),format.raw/*63.18*/("""
              """),format.raw/*64.15*/("""<td>"""),_display_(/*64.20*/p/*64.21*/.getName),format.raw/*64.29*/("""</td>
              <td>"""),_display_(/*65.20*/p/*65.21*/.getCategory.getName),format.raw/*65.41*/("""</td>
              <td>"""),_display_(/*66.20*/p/*66.21*/.getDescription),format.raw/*66.36*/(""" """),format.raw/*66.37*/("""</td>
              <td>"""),_display_(/*67.20*/p/*67.21*/.getStock),format.raw/*67.30*/(""" """),format.raw/*67.31*/("""</td>
              
              <td>&euro; """),_display_(/*69.27*/("%.2f".format(p.getPrice))),format.raw/*69.54*/(""" """),format.raw/*69.55*/("""</td> 
              
              <td>
                  <a href=""""),_display_(/*72.29*/routes/*72.35*/.HomeController.updateProduct(p.getId)),format.raw/*72.73*/("""" class="button-xs btn-danger">
                      <span class="glyphicon glyphicon-pencil"></span>
                  </a>
              </td>
    
              <!-- Delete button -->
              <td>
                  <a href=""""),_display_(/*79.29*/routes/*79.35*/.HomeController.deleteProduct(p.getId)),format.raw/*79.73*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                      <span class="glyphicon glyphicon-trash"></span>
                  </a>
              </td>
          </tr>
        """)))}),format.raw/*84.10*/(""" """),format.raw/*84.28*/("""
    
    
      """),format.raw/*87.7*/("""</tbody>
    
    </table>
    
    <p>
        <a href =""""),_display_(/*92.20*/routes/*92.26*/.HomeController.addProduct()),format.raw/*92.54*/("""">
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

  def render(products:List[models.Product],categories:List[models.Category],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user,env)

  def f:((List[models.Product],List[models.Category],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user,env) => apply(products,categories,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 09 03:43:08 IST 2018
                  SOURCE: /home/wdd/webapps/Practice/PlayPractice12/CRUDPractice/play-java-seed/app/views/games.scala.html
                  HASH: 66370f44ebd530a11dfe911bcc296238da049fc3
                  MATRIX: 1023->1|1238->120|1267->121|1346->175|1373->194|1411->195|1442->200|1689->420|1704->426|1749->450|1842->516|1878->536|1917->537|1968->560|2005->570|2020->576|2071->606|2125->633|2135->634|2165->642|2220->669|2268->690|2278->691|2318->710|2405->766|2446->779|2539->905|2571->911|2612->943|2652->945|2686->952|2756->995|2770->1000|2806->1015|2840->1022|2882->1034|2914->1039|3359->1564|3396->1574|3428->1590|3467->1591|3507->1603|3554->1623|3652->1711|3693->1713|3742->1734|3824->1789|3863->1807|3908->1834|3921->1839|3960->1840|4009->1861|4131->1952|4174->1967|4206->1972|4216->1973|4245->1981|4297->2006|4307->2007|4348->2027|4400->2052|4410->2053|4446->2068|4475->2069|4527->2094|4537->2095|4567->2104|4596->2105|4670->2152|4718->2179|4747->2180|4843->2249|4858->2255|4917->2293|5179->2528|5194->2534|5253->2572|5485->2773|5514->2791|5558->2808|5644->2867|5659->2873|5708->2901
                  LINES: 28->1|33->1|33->1|35->3|35->3|35->3|36->4|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|48->16|49->17|55->23|56->24|56->24|56->24|57->25|58->26|58->26|58->26|59->27|60->28|61->29|87->56|88->57|88->57|88->57|89->58|90->59|90->59|90->59|91->60|91->60|91->60|92->61|92->61|92->61|93->62|94->63|95->64|95->64|95->64|95->64|96->65|96->65|96->65|97->66|97->66|97->66|97->66|98->67|98->67|98->67|98->67|100->69|100->69|100->69|103->72|103->72|103->72|110->79|110->79|110->79|115->84|115->84|118->87|123->92|123->92|123->92
                  -- GENERATED --
              */
          