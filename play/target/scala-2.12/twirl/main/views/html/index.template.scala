
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
                    <img src=""""),_display_(/*33.32*/routes/*33.38*/.Assets.versioned("images/logo_cide-01-01.png")),format.raw/*33.85*/("""" class="img-fluid" alt="">
                </div>
            </div>
            <div class="col-md-8 col-sm-6">
                <div class="studio-content">
                    <h2>Sobre a Equipe</h2>
                    <p>O Grupo de Pesquisa em Ciência de Dados Educacionais visa a extração de conhecimento a partir do processamento de grandes volumes de dados provindos de ambientes educacionais.</p>
                    <a href=""""),_display_(/*40.31*/routes/*40.37*/.HomeController.login()),format.raw/*40.60*/("""" class="primary-btn">Ver mais<span class="lnr lnr-arrow-right"></span></a>
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
                    <a href="#" class="primary-btn">Ver mais<span class="lnr lnr-arrow-right"></span></a>
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
<!-- Start Carousel Area -->
<section class="section-gap carousel-area">
    <div class="overlay overlay-bg"></div>
    <div class="active-bottle-carousel">
        <div class="item">
            <div class="container">
                <div class="row align-items-center">
                    <div class="col-xl-6 col-md-4">
                        <div class="carousel-thumb">
                            <img src=""""),_display_(/*125.40*/routes/*125.46*/.Assets.versioned("images/slide4.jpg")),format.raw/*125.84*/("""" alt="" class="img-fluid">
                        </div>
                    </div>
                    <div class="col-xl-6 col-md-7">
                        <div class="carousel-content">
                            <h2 class="text-white">Glowing Milk Bottle</h2>
                            <h5 class="text-white mb-20">Collect from your nearest supershop imedietely</h5>
                            <p class="text-white mb-30">Few would argue that, despite the advancements of feminism over the past three decades, women still face a double standard when it comes to their behavior. While men’s borderline-inappropriate behavior is often laughed off as “boys will be boys,” women face higher conduct standards – especially in the workplace. That’s why it’s crucial that, as women, our behavior on the job is beyond reproach.Small Towns and Big StatesFor evidence of the double standard, we need look no farther than Arlington.</p>
                            <a href="#" class="primary-btn white">Ver mais<span class="lnr lnr-arrow-right"></span></a>
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
                            <img src=""""),_display_(/*144.40*/routes/*144.46*/.Assets.versioned("home/img/c.jpg")),format.raw/*144.81*/("""" alt="" class="img-fluid">
                        </div>
                    </div>
                    <div class="col-xl-6 col-md-7">
                        <div class="carousel-content">
                            <h2 class="text-white">Glowing Milk Bottle</h2>
                            <h5 class="text-white mb-20">Collect from your nearest supershop imedietely</h5>
                            <p class="text-white mb-30">Few would argue that, despite the advancements of feminism over the past three decades, women still face a double standard when it comes to their behavior. While men’s borderline-inappropriate behavior is often laughed off as “boys will be boys,” women face higher conduct standards – especially in the workplace. That’s why it’s crucial that, as women, our behavior on the job is beyond reproach.Small Towns and Big StatesFor evidence of the double standard, we need look no farther than Arlington.</p>
                            <a href="#" class="primary-btn white">Ver mais<span class="lnr lnr-arrow-right"></span></a>
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
                            <img src=""""),_display_(/*163.40*/routes/*163.46*/.Assets.versioned("home/img/c.jpg")),format.raw/*163.81*/("""" alt="" class="img-fluid">
                        </div>
                    </div>
                    <div class="col-xl-6 col-md-7">
                        <div class="carousel-content">
                            <h2 class="text-white">Glowing Milk Bottle</h2>
                            <h5 class="text-white mb-20">Collect from your nearest supershop imedietely</h5>
                            <p class="text-white mb-30">Few would argue that, despite the advancements of feminism over the past three decades, women still face a double standard when it comes to their behavior. While men’s borderline-inappropriate behavior is often laughed off as “boys will be boys,” women face higher conduct standards – especially in the workplace. That’s why it’s crucial that, as women, our behavior on the job is beyond reproach.Small Towns and Big StatesFor evidence of the double standard, we need look no farther than Arlington.</p>
                            <a href="#" class="primary-btn white">Ver mais<span class="lnr lnr-arrow-right"></span></a>
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
                            <img src=""""),_display_(/*182.40*/routes/*182.46*/.Assets.versioned("home/img/c.jpg")),format.raw/*182.81*/("""" alt="" class="img-fluid">
                        </div>
                    </div>
                    <div class="col-xl-6 col-md-7">
                        <div class="carousel-content">
                            <h2 class="text-white">Glowing Milk Bottle</h2>
                            <h5 class="text-white mb-20">Collect from your nearest supershop imedietely</h5>
                            <p class="text-white mb-30">Few would argue that, despite the advancements of feminism over the past three decades, women still face a double standard when it comes to their behavior. While men’s borderline-inappropriate behavior is often laughed off as “boys will be boys,” women face higher conduct standards – especially in the workplace. That’s why it’s crucial that, as women, our behavior on the job is beyond reproach.Small Towns and Big StatesFor evidence of the double standard, we need look no farther than Arlington.</p>
                            <a href="#" class="primary-btn white">Ver mais<span class="lnr lnr-arrow-right"></span></a>
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
                            <img src=""""),_display_(/*201.40*/routes/*201.46*/.Assets.versioned("home/img/c.jpg")),format.raw/*201.81*/("""" alt="" class="img-fluid">
                        </div>
                    </div>
                    <div class="col-xl-6 col-md-7">
                        <div class="carousel-content">
                            <h2 class="text-white">Glowing Milk Bottle</h2>
                            <h5 class="text-white mb-20">Collect from your nearest supershop imedietely</h5>
                            <p class="text-white mb-30">Few would argue that, despite the advancements of feminism over the past three decades, women still face a double standard when it comes to their behavior. While men’s borderline-inappropriate behavior is often laughed off as “boys will be boys,” women face higher conduct standards – especially in the workplace. That’s why it’s crucial that, as women, our behavior on the job is beyond reproach.Small Towns and Big StatesFor evidence of the double standard, we need look no farther than Arlington.</p>
                            <a href="#" class="primary-btn white">Ver mais<span class="lnr lnr-arrow-right"></span></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- End Carousel Area -->
<!-- Start Skill Area -->
<section class="section-gap skill-area">
    <div class="container">
        <div class="row justify-content-between">
            <div class="col-lg-6">
                <div class="skill-content">
                    <h2>Sobre o ConnectEad</h2>
                    <p class="mb-30">
                        Com a implementação da educação à distância, em centros educacionais
                        dos mais variados níveis, os professores e instrutores estão enfrentando
                        o desafio de acompanhar o processo de aprendizagem de forma
                        mais efetiva em salas de aula com um grande número de alunos. 
                    </p>
                    <p class="mb-30">
                        A proposta para solução desse problema, é a criação de um dashboard
                        para os professores realizarem o acompanhamento da sua turma,
                        utilizando dados coletados do AVA Moodle e através de
                        visualizações desses dados.
                    </p>
                    <p class="mb-30">
                        Através destas visualizações os professores poderão detectar os
                        comportamentos dos alunos, facilitando intervenções pedagógicas
                        durante o curso a fim de auxiliar da melhor forma o aluno com
                        dificuldades de aprendizado.
                    </p>
                    <p class="mb-30">
                        Este projeto faz parte da disciplina Projeto de Desenvolvimento de Software, ministrada e orientada pelo 
                        <strong>Prof. Kellyton Brito</strong>, da Universidade Federal Rural de Pernambuco.
                    </p>
                    <a href="#" class="primary-btn">Ver mais<span class="lnr lnr-arrow-right"></span></a>
                </div>
            </div>
            <div id="lms-img" class="col-lg-6">
                <img src=""""),_display_(/*251.28*/routes/*251.34*/.Assets.versioned("home/img/lms.png")),format.raw/*251.71*/("""" alt="" class="img-fluid">
            </div>
        </div>
    </div>
</section>
<!-- End Skill Area -->
<!-- Start Contact Area -->
<!-- <section class="contact-area">
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
</section> -->
""")))};
Seq[Any](format.raw/*3.2*/("""

"""),format.raw/*292.2*/("""

"""),_display_(/*294.2*/main(title)/*294.13*/(content)),format.raw/*294.22*/("""
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
                  DATE: Sat Nov 24 21:44:41 BRST 2018
                  SOURCE: C:/Users/natha/Documents/play/app/views/index.scala.html
                  HASH: 74165394df9dfff4305bcd54995aefa7ac9d27f9
                  MATRIX: 1014->1|1026->6|1106->10|1138->16|1172->33|1186->40|1266->44|1297->66|1327->70|2092->808|2107->814|2174->860|2649->1308|2664->1314|2732->1361|3202->1804|3217->1810|3261->1833|7517->6061|7533->6067|7593->6105|9073->7557|9089->7563|9146->7598|10626->9050|10642->9056|10699->9091|12179->10543|12195->10549|12252->10584|13732->12036|13748->12042|13805->12077|17074->15318|17090->15324|17149->15361|19160->28|19192->17334|19224->17339|19245->17350|19276->17359
                  LINES: 32->1|32->1|34->1|35->2|36->5|36->5|38->5|39->6|40->7|53->20|53->20|53->20|66->33|66->33|66->33|73->40|73->40|73->40|158->125|158->125|158->125|177->144|177->144|177->144|196->163|196->163|196->163|215->182|215->182|215->182|234->201|234->201|234->201|284->251|284->251|284->251|326->3|328->292|330->294|330->294|330->294
                  -- GENERATED --
              */
          