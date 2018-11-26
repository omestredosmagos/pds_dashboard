
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


Seq[Any](format.raw/*7.30*/("""

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
                  DATE: Mon Nov 26 20:57:18 BRST 2018
                  SOURCE: C:/Users/natha/Documents/play/app/views/main.scala.html
                  HASH: 307ad9fd38fdfb04bb951f4cd19fe04446dbd497
                  MATRIX: 1204->261|1327->289|1357->293|1637->546|1652->552|1716->595|2087->939|2113->944|2177->981|2192->987|2260->1034|2460->1207|2475->1213|2541->1258|2614->1304|2629->1310|2696->1356|2769->1402|2784->1408|2855->1458|2928->1504|2943->1510|3009->1555|3082->1601|3097->1607|3166->1655|3239->1701|3254->1707|3318->1750|3391->1796|3406->1802|3465->1840|3894->2242|3909->2248|3983->2300|4235->2525|4250->2531|4294->2554|4375->2608|4390->2614|4434->2637|4822->2998|4850->3005|4892->3019|8386->6485|8402->6491|8479->6546|8757->6796|8773->6802|8847->6854|8910->6889|8926->6895|9000->6947|9063->6982|9079->6988|9149->7036|9212->7071|9228->7077|9304->7131|9367->7166|9383->7172|9462->7229|9525->7264|9541->7270|9599->7306
                  LINES: 33->7|38->7|40->9|47->16|47->16|47->16|57->26|57->26|59->28|59->28|59->28|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|78->47|78->47|78->47|82->51|82->51|82->51|83->52|83->52|83->52|92->61|92->61|93->62|151->120|151->120|151->120|153->122|153->122|153->122|154->123|154->123|154->123|155->124|155->124|155->124|156->125|156->125|156->125|157->126|157->126|157->126|158->127|158->127|158->127
                  -- GENERATED --
              */
          