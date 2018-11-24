
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
                            <a href="#"><img src=""""),_display_(/*47.52*/routes/*47.58*/.Assets.versioned("home/img/logo.png")),format.raw/*47.96*/("""" alt=""></a>
                        </div>
                        <div class="main-menubar d-flex align-items-center">
                            <nav class="hide">
                                <a href="#">Home</a>
                                <a href="#">Generic</a>
                                <a href="#">Elements</a>
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
                    <div class="subscription-area">
                        <div class="row justify-content-center">
                            <div class="col-lg-6">
                                <div id="mc_embed_signup">
                                    <form target="_blank" novalidate action="https://spondonit.us12.list-manage.com/subscribe/post?u=1462626880ade1ac87bd9c93a&id=92a4423d01" method="get" class="subscription relative">
                                        <input type="email" name="EMAIL" placeholder="Email address" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Email address'" required>
                                        <div style="position: absolute; left: -5000px;">
                                            <input type="text" name="b_36c4fd991d266f23781ded980_aefe40901a" tabindex="-1" value="">
                                        </div>
                                        <button class="primary-btn">Subscribe now<span class="lnr lnr-arrow-right"></span></button>
                                        <div class="info"></div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-3 col-sm-6">
                            <div class="single-footer-widget">
                                <h6 class="text-white text-uppercase mb-20">About Agency</h6>
                                <ul class="footer-nav">
                                    <li><a href="#">Managed Website</a></li>
                                    <li><a href="#">Manage Reputation</a></li>
                                    <li><a href="#">Power Tools</a></li>
                                    <li><a href="#">Marketing Service</a></li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <div class="single-footer-widget">
                                <h6 class="text-white text-uppercase mb-20">Navigation Links</h6>
                                <ul class="footer-nav">
                                    <li><a href="#">Home</a></li>
                                    <li><a href="#">Main Features</a></li>
                                    <li><a href="#">Offered Services</a></li>
                                    <li><a href="#">Latest Portfolio</a></li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <div class="single-footer-widget">
                                <h6 class="text-white text-uppercase mb-20">Navigation Links</h6>
                                <ul class="footer-nav">
                                    <li><a href="#">Works & Builders</a></li>
                                    <li><a href="#">Works & Wordpress</a></li>
                                    <li><a href="#">Works & Templates</a></li>
                                </ul>
                            </div>
                        </div>

                        <div class="col-lg-3 col-sm-6">
                            <div class="single-footer-widget">
                                <h6 class="text-white text-uppercase mb-20">Instafeed</h6>
                                <ul class="instafeed d-flex flex-wrap">
                                    <li><img src=""""),_display_(/*126.52*/routes/*126.58*/.Assets.versioned("home/img/i1.jpg")),format.raw/*126.94*/("""" alt=""></li>
                                    <li><img src=""""),_display_(/*127.52*/routes/*127.58*/.Assets.versioned("home/img/i2.jpg")),format.raw/*127.94*/("""" alt=""></li>
                                    <li><img src=""""),_display_(/*128.52*/routes/*128.58*/.Assets.versioned("home/img/i3.jpg")),format.raw/*128.94*/("""" alt=""></li>
                                    <li><img src=""""),_display_(/*129.52*/routes/*129.58*/.Assets.versioned("home/img/i4.jpg")),format.raw/*129.94*/("""" alt=""></li>
                                    <li><img src=""""),_display_(/*130.52*/routes/*130.58*/.Assets.versioned("home/img/i5.jpg")),format.raw/*130.94*/("""" alt=""></li>
                                    <li><img src=""""),_display_(/*131.52*/routes/*131.58*/.Assets.versioned("home/img/i6.jpg")),format.raw/*131.94*/("""" alt=""></li>
                                    <li><img src=""""),_display_(/*132.52*/routes/*132.58*/.Assets.versioned("home/img/i7.jpg")),format.raw/*132.94*/("""" alt=""></li>
                                    <li><img src=""""),_display_(/*133.52*/routes/*133.58*/.Assets.versioned("home/img/i8.jpg")),format.raw/*133.94*/("""" alt=""></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="footer-bottom d-flex justify-content-between align-items-center flex-wrap">
                        <p class="footer-text m-0">Copyright &copy; 2018 All rights reserved   |   This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com/">Colorlib</a></p>
                        <div class="footer-social d-flex align-items-center">
                            <a href="#"><i class="fa fa-facebook"></i></a>
                            <a href="#"><i class="fa fa-twitter"></i></a>
                            <a href="#"><i class="fa fa-dribbble"></i></a>
                            <a href="#"><i class="fa fa-behance"></i></a>
                        </div>
                    </div>
                </div>
            </footer>
            <!-- End Footer Area -->
        </div>

        <script src=""""),_display_(/*152.23*/routes/*152.29*/.Assets.versioned("home/js/vendor/jquery-2.2.4.min.js")),format.raw/*152.84*/(""""></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
        <script src=""""),_display_(/*154.23*/routes/*154.29*/.Assets.versioned("home/js/vendor/bootstrap.min.js")),format.raw/*154.81*/(""""></script>
        <script src=""""),_display_(/*155.23*/routes/*155.29*/.Assets.versioned("home/js/jquery.ajaxchimp.min.js")),format.raw/*155.81*/(""""></script>
        <script src=""""),_display_(/*156.23*/routes/*156.29*/.Assets.versioned("home/js/owl.carousel.min.js")),format.raw/*156.77*/(""""></script>
        <script src=""""),_display_(/*157.23*/routes/*157.29*/.Assets.versioned("home/js/jquery.nice-select.min.js")),format.raw/*157.83*/(""""></script>
        <script src=""""),_display_(/*158.23*/routes/*158.29*/.Assets.versioned("home/js/jquery.magnific-popup.min.js")),format.raw/*158.86*/(""""></script>
        <script src=""""),_display_(/*159.23*/routes/*159.29*/.Assets.versioned("home/js/main.js")),format.raw/*159.65*/(""""></script>
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
                  DATE: Sat Nov 24 15:08:05 BRST 2018
                  SOURCE: C:/Users/natha/Documents/play/app/views/main.scala.html
                  HASH: cb0bd19beed514dc59d6e2cf408f2121b936274c
                  MATRIX: 1204->261|1327->289|1357->293|1637->546|1652->552|1716->595|2087->939|2113->944|2177->981|2192->987|2260->1034|2460->1207|2475->1213|2541->1258|2614->1304|2629->1310|2696->1356|2769->1402|2784->1408|2855->1458|2928->1504|2943->1510|3009->1555|3082->1601|3097->1607|3166->1655|3239->1701|3254->1707|3318->1750|3391->1796|3406->1802|3465->1840|3894->2242|3909->2248|3968->2286|4623->2914|4651->2921|4693->2935|8742->6956|8758->6962|8816->6998|8911->7065|8927->7071|8985->7107|9080->7174|9096->7180|9154->7216|9249->7283|9265->7289|9323->7325|9418->7392|9434->7398|9492->7434|9587->7501|9603->7507|9661->7543|9756->7610|9772->7616|9830->7652|9925->7719|9941->7725|9999->7761|11081->8815|11097->8821|11174->8876|11452->9126|11468->9132|11542->9184|11605->9219|11621->9225|11695->9277|11758->9312|11774->9318|11844->9366|11907->9401|11923->9407|11999->9461|12062->9496|12078->9502|12157->9559|12220->9594|12236->9600|12294->9636
                  LINES: 33->7|38->7|40->9|47->16|47->16|47->16|57->26|57->26|59->28|59->28|59->28|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|78->47|78->47|78->47|92->61|92->61|93->62|157->126|157->126|157->126|158->127|158->127|158->127|159->128|159->128|159->128|160->129|160->129|160->129|161->130|161->130|161->130|162->131|162->131|162->131|163->132|163->132|163->132|164->133|164->133|164->133|183->152|183->152|183->152|185->154|185->154|185->154|186->155|186->155|186->155|187->156|187->156|187->156|188->157|188->157|188->157|189->158|189->158|189->158|190->159|190->159|190->159
                  -- GENERATED --
              */
          