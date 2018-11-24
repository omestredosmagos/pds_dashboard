
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*1.2*/title/*1.7*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*1.11*/("""
    """),format.raw/*2.5*/("""Home Page
""")))};def /*5.2*/content/*5.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.13*/("""
  """),format.raw/*6.21*/("""
  """),format.raw/*7.3*/("""<!-- Start Banner Area -->
  <section class="banner-area relative">
    <div class="overlay overlay-bg"></div>
    <div class="container">
        <div class="row fullscreen align-items-center justify-content-between">
            <div class="col-lg-4 ">
                <div class="banner-content">
                    <h1>Simples e Prático<br>esse é o ConnectEad</h1>
                    <p>Uma solução dashboard para professores e tutores EAD para acompanhar sua turma de forma mais eficaz e constante.</p>
                    <a href="#" class="primary-btn">Comece agora<span class="lnr lnr-arrow-right"></span></a>
                </div>
            </div>
            <div class="col-lg-8 ">
                <img src=""""),_display_(/*20.28*/routes/*20.34*/.Assets.versioned("images/macbook_mockup.png")),format.raw/*20.80*/("""" alt="" class="img-fluid banner-img">
            </div>
        </div>
    </div>
</section>
<!-- End Banner Area -->
<!-- Start studio Area -->
<section class="section-gap studio-area">
    <div class="overlay overlay-bg"></div>
    <div class="container">
        <div class="row align-items-center">
            <div class="col-md-4 col-sm-6 text-center">
                <div class="studio-thumb">
                    <img src=""""),_display_(/*33.32*/routes/*33.38*/.Assets.versioned("home/img/s.jpg")),format.raw/*33.73*/("""" class="img-fluid" alt="">
                </div>
            </div>
            <div class="col-md-8 col-sm-6">
                <div class="studio-content">
                    <h2>Green Forest Studio</h2>
                    <p>Few would argue that, despite the advancements of feminism over the past three decades, women still face a double standard when it comes to their behavior. While men’s borderline-inappropriate behavior is often laughed off as “boys will be boys,” women face higher conduct standards – especially in the workplace. That’s why it’s crucial that, as women, our behavior on the job is beyond reproach.Small Towns and Big StatesFor </p>
                    <a href="#" class="primary-btn">View More<span class="lnr lnr-arrow-right"></span></a>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- End studio Area -->
<!-- Start Achivement Area -->
<section class="section-gap achivement-area">
    <div class="container">
        <div class="row align-items-center">
            <div class="col-lg-5">
                <div class="achivement-content">
                    <h2>Our Achievements</h2>
                    <p class="mb-30">Few would argue that, despite the advancements of feminism over the past three decades, women still face a double standard when it comes to their behavior. While men’s borderline-inappropriate behavior is often laughed off as “boys will be boys,” women face higher conduct </p>
                    <a href="#" class="primary-btn">View More<span class="lnr lnr-arrow-right"></span></a>
                </div>
            </div>
            <div class="col-lg-6">
                <div class="total-achivement">
                    <div class="row">
                        <div class="col-md-4 col-sm-6">
                            <div class="single-achivement">
                                <a href="#" class="achivement-link">
                                    <i class="fa fa-behance"></i>
                                </a>
                                <h6><a href="#">Behance Review</a></h6>
                            </div>
                        </div>
                        <div class="col-md-4 col-sm-6">
                            <div class="single-achivement">
                                <a href="#" class="achivement-link">
                                    <i class="fa fa-dribbble"></i>
                                </a>
                                <h6><a href="#">Dribbble Shots</a></h6>
                            </div>
                        </div>
                        <div class="col-md-4 col-sm-6">
                            <div class="single-achivement">
                                <a href="#" class="achivement-link">
                                    <i class="fa fa-youtube"></i>
                                </a>
                                <h6><a href="#">Youtube Subscribe</a></h6>
                            </div>
                        </div>
                        <div class="col-md-4 col-sm-6">
                            <div class="single-achivement">
                                <a href="#" class="achivement-link">
                                    <i class="fa fa-github"></i>
                                </a>
                                <h6><a href="#">Github Push</a></h6>
                            </div>
                        </div>
                        <div class="col-md-4 col-sm-6">
                            <div class="single-achivement">
                                <a href="#" class="achivement-link">
                                    <i class="fa fa-trophy"></i>
                                </a>
                                <h6><a href="#">Offline Trophy</a></h6>
                            </div>
                        </div>
                        <div class="col-md-4 col-sm-6">
                            <div class="single-achivement">
                                <a href="#" class="achivement-link">
                                    <i class="fa fa-usd"></i>
                                </a>
                                <h6><a href="#">Cash Prizes</a></h6>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- End Achivement Area -->
<!-- Start Video Area -->
<section class="video-area">
    <div class="overlay overlay-bg"></div>
    <div class="container">
        <div class="video-content">
            <a href="http://www.youtube.com/watch?v=0O2aH4XLbto" class="play-btn"><img src=""""),_display_(/*121.94*/routes/*121.100*/.Assets.versioned("home/img/play-btn.png")),format.raw/*121.142*/("""" alt=""></a>
            <h3 class="h2 text-white">Everyone wants to be unique</h3>
        </div>
    </div>
</section>
<!-- End Video Area -->
<!-- Start Skill Area -->
<section class="section-gap skill-area">
    <div class="container">
        <div class="row justify-content-between">
            <div class="col-lg-5">
                <div class="skill-content">
                    <h2>Our Tools Expertness</h2>
                    <p class="mb-30">Few would argue that, despite the advancements of feminism over the past three decades, women still face a double standard when it comes to their behavior. While men’s borderline-inappropriate behavior is often laughed off as “boys will be boys,” women face higher conduct </p>
                    <a href="#" class="primary-btn">View More<span class="lnr lnr-arrow-right"></span></a>
                </div>
            </div>
            <div class="col-lg-6">
                <div class="total-progress-bar">
                    <p>Adobe Photoshop CC</p>
                    <div class="single-progressbar mb-20">
                        <div class="progress-bar" role="progressbar" style="width: 70%" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100"></div>
                    </div>
                    <p>Adobe Illustrator CC</p>
                    <div class="single-progressbar mb-20">
                        <div class="progress-bar" role="progressbar" style="width: 60%" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"></div>
                    </div>
                    <p>Adobe Indesign CC</p>
                    <div class="single-progressbar mb-20">
                        <div class="progress-bar" role="progressbar" style="width: 50%" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100"></div>
                    </div>
                    <p>Adobe After Effects CC</p>
                    <div class="single-progressbar mb-20">
                        <div class="progress-bar" role="progressbar" style="width: 80%" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100"></div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- End Skill Area -->
<!-- Start Carousel Area -->
<section class="section-gap carousel-area">
    <div class="overlay overlay-bg"></div>
    <div class="active-bottle-carousel">
        <div class="item">
            <div class="container">
                <div class="row align-items-center">
                    <div class="col-xl-6 col-md-4">
                        <div class="carousel-thumb">
                            <img src=""""),_display_(/*171.40*/routes/*171.46*/.Assets.versioned("home/img/c.jpg")),format.raw/*171.81*/("""" alt="" class="img-fluid">
                        </div>
                    </div>
                    <div class="col-xl-6 col-md-7">
                        <div class="carousel-content">
                            <h2 class="text-white">Glowing Milk Bottle</h2>
                            <h5 class="text-white mb-20">Collect from your nearest supershop imedietely</h5>
                            <p class="text-white mb-30">Few would argue that, despite the advancements of feminism over the past three decades, women still face a double standard when it comes to their behavior. While men’s borderline-inappropriate behavior is often laughed off as “boys will be boys,” women face higher conduct standards – especially in the workplace. That’s why it’s crucial that, as women, our behavior on the job is beyond reproach.Small Towns and Big StatesFor evidence of the double standard, we need look no farther than Arlington.</p>
                            <a href="#" class="primary-btn white">View More<span class="lnr lnr-arrow-right"></span></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="item">
            <div class="container">
                <div class="row align-items-center">
                    <div class="col-xl-6 col-md-4">
                        <div class="carousel-thumb">
                            <img src=""""),_display_(/*190.40*/routes/*190.46*/.Assets.versioned("home/img/c.jpg")),format.raw/*190.81*/("""" alt="" class="img-fluid">
                        </div>
                    </div>
                    <div class="col-xl-6 col-md-7">
                        <div class="carousel-content">
                            <h2 class="text-white">Glowing Milk Bottle</h2>
                            <h5 class="text-white mb-20">Collect from your nearest supershop imedietely</h5>
                            <p class="text-white mb-30">Few would argue that, despite the advancements of feminism over the past three decades, women still face a double standard when it comes to their behavior. While men’s borderline-inappropriate behavior is often laughed off as “boys will be boys,” women face higher conduct standards – especially in the workplace. That’s why it’s crucial that, as women, our behavior on the job is beyond reproach.Small Towns and Big StatesFor evidence of the double standard, we need look no farther than Arlington.</p>
                            <a href="#" class="primary-btn white">View More<span class="lnr lnr-arrow-right"></span></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="item">
            <div class="container">
                <div class="row align-items-center">
                    <div class="col-xl-6 col-md-4">
                        <div class="carousel-thumb">
                            <img src=""""),_display_(/*209.40*/routes/*209.46*/.Assets.versioned("home/img/c.jpg")),format.raw/*209.81*/("""" alt="" class="img-fluid">
                        </div>
                    </div>
                    <div class="col-xl-6 col-md-7">
                        <div class="carousel-content">
                            <h2 class="text-white">Glowing Milk Bottle</h2>
                            <h5 class="text-white mb-20">Collect from your nearest supershop imedietely</h5>
                            <p class="text-white mb-30">Few would argue that, despite the advancements of feminism over the past three decades, women still face a double standard when it comes to their behavior. While men’s borderline-inappropriate behavior is often laughed off as “boys will be boys,” women face higher conduct standards – especially in the workplace. That’s why it’s crucial that, as women, our behavior on the job is beyond reproach.Small Towns and Big StatesFor evidence of the double standard, we need look no farther than Arlington.</p>
                            <a href="#" class="primary-btn white">View More<span class="lnr lnr-arrow-right"></span></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="item">
            <div class="container">
                <div class="row align-items-center">
                    <div class="col-xl-6 col-md-4">
                        <div class="carousel-thumb">
                            <img src=""""),_display_(/*228.40*/routes/*228.46*/.Assets.versioned("home/img/c.jpg")),format.raw/*228.81*/("""" alt="" class="img-fluid">
                        </div>
                    </div>
                    <div class="col-xl-6 col-md-7">
                        <div class="carousel-content">
                            <h2 class="text-white">Glowing Milk Bottle</h2>
                            <h5 class="text-white mb-20">Collect from your nearest supershop imedietely</h5>
                            <p class="text-white mb-30">Few would argue that, despite the advancements of feminism over the past three decades, women still face a double standard when it comes to their behavior. While men’s borderline-inappropriate behavior is often laughed off as “boys will be boys,” women face higher conduct standards – especially in the workplace. That’s why it’s crucial that, as women, our behavior on the job is beyond reproach.Small Towns and Big StatesFor evidence of the double standard, we need look no farther than Arlington.</p>
                            <a href="#" class="primary-btn white">View More<span class="lnr lnr-arrow-right"></span></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="item">
            <div class="container">
                <div class="row align-items-center">
                    <div class="col-xl-6 col-md-4">
                        <div class="carousel-thumb">
                            <img src=""""),_display_(/*247.40*/routes/*247.46*/.Assets.versioned("home/img/c.jpg")),format.raw/*247.81*/("""" alt="" class="img-fluid">
                        </div>
                    </div>
                    <div class="col-xl-6 col-md-7">
                        <div class="carousel-content">
                            <h2 class="text-white">Glowing Milk Bottle</h2>
                            <h5 class="text-white mb-20">Collect from your nearest supershop imedietely</h5>
                            <p class="text-white mb-30">Few would argue that, despite the advancements of feminism over the past three decades, women still face a double standard when it comes to their behavior. While men’s borderline-inappropriate behavior is often laughed off as “boys will be boys,” women face higher conduct standards – especially in the workplace. That’s why it’s crucial that, as women, our behavior on the job is beyond reproach.Small Towns and Big StatesFor evidence of the double standard, we need look no farther than Arlington.</p>
                            <a href="#" class="primary-btn white">View More<span class="lnr lnr-arrow-right"></span></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>


    </div>
</section>
<!-- End Carousel Area -->


<!-- Start Contact Area -->
<section class="contact-area">
    <div class="container">
        <div class="row">
            <div class="col-lg-3 col-md-6">
                <div class="single-address text-center">
                    <h6>Visit Our Office</h6>
                    <p>56/8, bir uttam qazi nuruzzaman road, west panthapath, kalabagan, Dhanmondi, Dhaka - 1205</p>
                </div>
            </div>
            <div class="col-lg-3 col-md-6">
                <div class="single-address text-center">
                    <h6>Let’s call us</h6>
                    <p>Phone 01: <a href="tel:023545">012-6532-568-9746</a> <br> Phone 02:<a href="tel:023545">012-6532-568-9748</a> <br>FAX:<a href="tel:023545">02-6532-568-746</a></p>
                </div>
            </div>
            <div class="col-lg-3 col-md-6">
                <div class="single-address text-center">
                    <h6>Let’s Email Us</h6>
                    <p><a href="mailto:demo&commat;gmail.com">hello&commat;colorlib.com</a> <br>
                        <a href="mailto:demo&commat;gmail.com">mainhelpinfo&commat;colorlib.com</a> <br>
                        <a href="mailto:demo&commat;gmail.com">infohelp&commat;colorlib.com</a></p>
                </div>
            </div>
            <div class="col-lg-3 col-md-6">
                <div class="single-address text-center">
                    <h6>Customer Support</h6>
                    <p><a href="mailto:demo&commat;gmail.com">support&commat;colorlib.com</a> <br>
                        <a href="mailto:demo&commat;gmail.com">emergencysupp&commat;colorlib.com</a> <br>
                        <a href="mailto:demo&commat;gmail.com">extremesupp&commat;colorlib.com</a></p>
                </div>
            </div>
        </div>
    </div>
</section>
""")))};
Seq[Any](format.raw/*3.2*/("""

"""),format.raw/*303.2*/("""

"""),_display_(/*305.2*/main(title)/*305.13*/(content)),format.raw/*305.22*/("""
 """))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Nov 24 20:16:26 BRST 2018
                  SOURCE: C:/Users/natha/Documents/play/app/views/index.scala.html
                  HASH: ded4f9440b2d6d6cc8564b52b1708676501b97ce
                  MATRIX: 1014->1|1026->6|1106->10|1138->16|1172->33|1186->40|1266->44|1297->66|1327->70|2092->808|2107->814|2174->860|2649->1308|2664->1314|2720->1349|7512->6113|7529->6119|7594->6161|10301->8840|10317->8846|10374->8881|11855->10334|11871->10340|11928->10375|13409->11828|13425->11834|13482->11869|14963->13322|14979->13328|15036->13363|16517->14816|16533->14822|16590->14857|19726->28|19758->17955|19790->17960|19811->17971|19842->17980
                  LINES: 32->1|32->1|34->1|35->2|36->5|36->5|38->5|39->6|40->7|53->20|53->20|53->20|66->33|66->33|66->33|154->121|154->121|154->121|204->171|204->171|204->171|223->190|223->190|223->190|242->209|242->209|242->209|261->228|261->228|261->228|280->247|280->247|280->247|337->3|339->303|341->305|341->305|341->305
                  -- GENERATED --
              */
          