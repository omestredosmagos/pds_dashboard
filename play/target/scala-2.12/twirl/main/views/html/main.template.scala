
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
  def apply/*7.2*/(title: Html)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="pt-br">

    <head>
        <!-- Mobile Specific Meta -->
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- Favicon-->
        <link rel="shortcut icon" href=""""),_display_(/*16.42*/routes/*16.48*/.Assets.versioned("images/speedometer.png")),format.raw/*16.91*/("""">
        <!-- Author Meta -->
        <meta name="author" content="">
        <!-- Meta Description -->
        <meta name="description" content="">
        <!-- Meta Keyword -->
        <meta name="keywords" content="">
        <!-- meta character set -->
        <meta charset="UTF-8">
        <!-- Site Title -->
        <title>"""),_display_(/*26.17*/title),format.raw/*26.22*/("""</title>
    
        <link href=""""),_display_(/*28.22*/routes/*28.28*/.Assets.versioned("template/css/font-face.css")),format.raw/*28.75*/("""" rel="stylesheet" media="all">
            <!--
            CSS
            ============================================= -->
            <link rel="stylesheet" href=""""),_display_(/*32.43*/routes/*32.49*/.Assets.versioned("home/css/linearicons.css")),format.raw/*32.94*/("""">
            <link rel="stylesheet" href=""""),_display_(/*33.43*/routes/*33.49*/.Assets.versioned("home/css/owl.carousel.css")),format.raw/*33.95*/("""">
            <link rel="stylesheet" href=""""),_display_(/*34.43*/routes/*34.49*/.Assets.versioned("home/css/font-awesome.min.css")),format.raw/*34.99*/("""">
            <link rel="stylesheet" href=""""),_display_(/*35.43*/routes/*35.49*/.Assets.versioned("home/css/nice-select.css")),format.raw/*35.94*/("""">
            <link rel="stylesheet" href=""""),_display_(/*36.43*/routes/*36.49*/.Assets.versioned("home/css/magnific-popup.css")),format.raw/*36.97*/("""">
            <link rel="stylesheet" href=""""),_display_(/*37.43*/routes/*37.49*/.Assets.versioned("home/css/bootstrap.css")),format.raw/*37.92*/("""">
            <link rel="stylesheet" href=""""),_display_(/*38.43*/routes/*38.49*/.Assets.versioned("home/css/main.css")),format.raw/*38.87*/("""">
    </head>
    <body class="dup-body">
        <div class="dup-body-wrap">
            <!-- Start Header Area -->
            <header class="default-header">
                <div class="header-wrap">
                    <div class="header-top d-flex justify-content-between align-items-center">
                        <div class="logo">
                            <a href="#"><img src=""""),_display_(/*47.52*/routes/*47.58*/.Assets.versioned("images/logo_dashboard-05-05.png")),format.raw/*47.110*/("""" alt="ConnectEad"></a>
                        </div>
                        <div class="main-menubar d-flex align-items-center">
                            <nav class="hide">
                                <a href=""""),_display_(/*51.43*/routes/*51.49*/.HomeController.index()),format.raw/*51.72*/("""">Home</a>
                                <a href=""""),_display_(/*52.43*/routes/*52.49*/.HomeController.login()),format.raw/*52.72*/("""">Dashboard</a>
                                <a href="#">Contatos</a>
                            </nav>
                            <div class="menu-bar"><span class="lnr lnr-menu"></span></div>
                        </div>
                    </div>
                </div>
            </header>
            <!-- End Header Area -->
            """),_display_(/*61.14*/content),format.raw/*61.21*/("""
            """),format.raw/*62.13*/("""<!-- End Contact Area -->
            <!-- END CONTENT -->
            <!-- Start Subscription Area -->

            <!-- End Subscription Area -->
            <!-- Strat Footer Area -->
            <footer class="section-gap footer-widget-area">
                <div class="overlay overlay-bg"></div>
                <div class="container">
                    <div class="row">
                        <div class="col-lg-3 col-sm-6">
                            <div class="single-footer-widget">
                                <h6 class="text-white text-uppercase mb-20">Links de Navegação</h6>
                                <ul class="footer-nav">
                                    <li><a href="#">Home</a></li>
                                    <li><a href="#">Features</a></li>
                                    <li><a href="#">Serviços</a></li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <div class="single-footer-widget">
                                <h6 class="text-white text-uppercase mb-20">Localização</h6>
                                <p class="text-white">Rua Dom Manuel de Medeiros, s/n, Dois Irmãos - CEP: 52171-900 - Recife/PE</p>
                            </div>
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <div class="single-footer-widget">
                                <h6 class="text-white text-uppercase mb-20">Email</h6>
                                <p class="text-white">
                                    <a class="text-white" href="#">hello&commat;ufrpe.com</a> <br>
                                    <a class="text-white" href="#">mainhelpinfo&commat;ufrpe.com</a> <br>
                                    <a class="text-white" href="#">infohelp&commat;ufrpe.com</a>
                                </p>
                            </div>
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <div class="single-footer-widget">
                                <h6 class="text-white text-uppercase mb-20">Suporte</h6>
                                <p class="text-white">
                                    <a class="text-white" href="#">support&commat;ufrpe.com</a> <br>
                                    <a class="text-white" href="#">emergencysupp&commat;ufrpe.com</a> <br>
                                </p>
                            </div>
                        </div>
                    </div>
                    <div class="footer-bottom d-flex justify-content-between align-items-center flex-wrap">
                        <p class="footer-text m-0">Copyright &copy; 2018 All rights reserved   |   This template is made with by <a href="https://colorlib.com/">Colorlib</a></p>
                        <div class="footer-social d-flex align-items-center">
                            <a href="#"><i class="fa fa-facebook"></i></a>
                            <a href="#"><i class="fa fa-twitter"></i></a>
                            <a href="#"><i class="fa fa-instagram"></i></a>
                        </div>
                    </div>
                </div>
            </footer>
            <!-- End Footer Area -->
        </div>
        <script src=""""),_display_(/*120.23*/routes/*120.29*/.Assets.versioned("home/js/vendor/jquery-2.2.4.min.js")),format.raw/*120.84*/(""""></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
        <script src=""""),_display_(/*122.23*/routes/*122.29*/.Assets.versioned("home/js/vendor/bootstrap.min.js")),format.raw/*122.81*/(""""></script>
        <script src=""""),_display_(/*123.23*/routes/*123.29*/.Assets.versioned("home/js/jquery.ajaxchimp.min.js")),format.raw/*123.81*/(""""></script>
        <script src=""""),_display_(/*124.23*/routes/*124.29*/.Assets.versioned("home/js/owl.carousel.min.js")),format.raw/*124.77*/(""""></script>
        <script src=""""),_display_(/*125.23*/routes/*125.29*/.Assets.versioned("home/js/jquery.nice-select.min.js")),format.raw/*125.83*/(""""></script>
        <script src=""""),_display_(/*126.23*/routes/*126.29*/.Assets.versioned("home/js/jquery.magnific-popup.min.js")),format.raw/*126.86*/(""""></script>
        <script src=""""),_display_(/*127.23*/routes/*127.29*/.Assets.versioned("home/js/main.js")),format.raw/*127.65*/(""""></script>
    </body>
</html>"""))
      }
    }
  }

  def render(title:Html,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 30 13:19:58 BRST 2018
                  SOURCE: C:/Users/natha/Documents/play/app/views/main.scala.html
                  HASH: 1bd979523f24bd53f2cd160309856b6eb76b01cd
                  MATRIX: 1199->255|1321->284|1348->285|1621->531|1636->537|1700->580|2061->914|2087->919|2149->954|2164->960|2232->1007|2428->1176|2443->1182|2509->1227|2581->1272|2596->1278|2663->1324|2735->1369|2750->1375|2821->1425|2893->1470|2908->1476|2974->1521|3046->1566|3061->1572|3130->1620|3202->1665|3217->1671|3281->1714|3353->1759|3368->1765|3427->1803|3847->2196|3862->2202|3936->2254|4184->2475|4199->2481|4243->2504|4323->2557|4338->2563|4382->2586|4761->2938|4789->2945|4830->2958|8266->6366|8282->6372|8359->6427|8635->6675|8651->6681|8725->6733|8787->6767|8803->6773|8877->6825|8939->6859|8955->6865|9025->6913|9087->6947|9103->6953|9179->7007|9241->7041|9257->7047|9336->7104|9398->7138|9414->7144|9472->7180
                  LINES: 33->7|38->8|39->9|46->16|46->16|46->16|56->26|56->26|58->28|58->28|58->28|62->32|62->32|62->32|63->33|63->33|63->33|64->34|64->34|64->34|65->35|65->35|65->35|66->36|66->36|66->36|67->37|67->37|67->37|68->38|68->38|68->38|77->47|77->47|77->47|81->51|81->51|81->51|82->52|82->52|82->52|91->61|91->61|92->62|150->120|150->120|150->120|152->122|152->122|152->122|153->123|153->123|153->123|154->124|154->124|154->124|155->125|155->125|155->125|156->126|156->126|156->126|157->127|157->127|157->127
                  -- GENERATED --
              */
          