
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
                    <h1>Simples e Prático,<br>esse é o ConnectEad</h1>
                    <p>Uma solução dashboard para professores e tutores EAD para acompanhar sua turma de forma mais eficaz e constante.</p>
                    <a href=""""),_display_(/*16.31*/routes/*16.37*/.HomeController.login()),format.raw/*16.60*/("""" class="primary-btn">Comece agora<span class="lnr lnr-arrow-right"></span></a>
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
                    <h2>Apoiadores</h2>
                    <p class="mb-30">Este projeto conta com a colaboração dos alunos e professores da Universidade Federal Rural de Pernambuco e da Universidade Federal de Pernambuco no desenvolvimento do sistema e analise de dados. E a parceria coma Universidade de Pernambuco com a disponibilização de uma base de dados da EAD da mesma. </p>
                    <a href="#" class="primary-btn">Ver mais<span class="lnr lnr-arrow-right"></span></a>
                </div>
            </div>
            <div class="col-lg-6">
                <div class="total-achivement">
                    <div class="row">
                        <div class="col-md-4 col-sm-6">
                            <div class="single-achivement">
                                <a href="#" class="achivement-link">
                                    <i class="fa fa-globe"></i>
                                </a>
                                <h6><a href="https://ufrpe.br">UFRPE</a></h6>
                            </div>
                        </div>
                        <div class="col-md-4 col-sm-6">
                            <div class="single-achivement">
                                <a href="#" class="achivement-link">
                                    <i class="fa fa-globe"></i>
                                </a>
                                <h6><a href="https://ufpe.br">UFPE</a></h6>
                            </div>
                        </div>
                        <div class="col-md-4 col-sm-6">
                            <div class="single-achivement">
                                <a href="#" class="achivement-link">
                                    <i class="fa fa-globe"></i>
                                </a>
                                <h6><a href="https://upe.br">UPE</a></h6>
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
                            <img src=""""),_display_(/*101.40*/routes/*101.46*/.Assets.versioned("images/slide5.jpg")),format.raw/*101.84*/("""" alt="" class="img-fluid">
                        </div>
                    </div>
                    <div class="col-xl-6 col-md-7">
                        <div class="carousel-content">
                            <h2 class="text-white">Dashboard</h2>
                            <h5 class="text-white mb-20">No entanto, não podemos esquecer que a determinação clara de objetivos promove a alavancagem dos índices pretendidos.</h5>
                            <p class="text-white mb-30">O cuidado em identificar pontos críticos no surgimento do comércio virtual agrega valor ao estabelecimento dos métodos utilizados na avaliação de resultados. O empenho em analisar a competitividade nas transações comerciais ainda não demonstrou convincentemente que vai participar na mudança das diretrizes de desenvolvimento para o futuro. Assim mesmo, o acompanhamento das preferências de consumo pode nos levar a considerar a reestruturação das posturas dos órgãos dirigentes com relação às suas atribuições.</p>
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
                            <img src=""""),_display_(/*120.40*/routes/*120.46*/.Assets.versioned("images/slide6.jpg")),format.raw/*120.84*/("""" alt="" class="img-fluid">
                        </div>
                    </div>
                    <div class="col-xl-6 col-md-7">
                        <div class="carousel-content">
                            <h2 class="text-white">Moodle</h2>
                            <h5 class="text-white mb-20">No entanto, não podemos esquecer que a determinação clara de objetivos promove a alavancagem dos índices pretendidos.</h5>
                            <p class="text-white mb-30">O cuidado em identificar pontos críticos no surgimento do comércio virtual agrega valor ao estabelecimento dos métodos utilizados na avaliação de resultados. O empenho em analisar a competitividade nas transações comerciais ainda não demonstrou convincentemente que vai participar na mudança das diretrizes de desenvolvimento para o futuro. Assim mesmo, o acompanhamento das preferências de consumo pode nos levar a considerar a reestruturação das posturas dos órgãos dirigentes com relação às suas atribuições.</p>
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
                            <img src=""""),_display_(/*139.40*/routes/*139.46*/.Assets.versioned("home/img/c.jpg")),format.raw/*139.81*/("""" alt="" class="img-fluid">
                        </div>
                    </div>
                    <div class="col-xl-6 col-md-7">
                        <div class="carousel-content">
                            <h2 class="text-white">Educação a Distância</h2>
                            <h5 class="text-white mb-20">No entanto, não podemos esquecer que a determinação clara de objetivos promove a alavancagem dos índices pretendidos.</h5>
                            <p class="text-white mb-30">O cuidado em identificar pontos críticos no surgimento do comércio virtual agrega valor ao estabelecimento dos métodos utilizados na avaliação de resultados. O empenho em analisar a competitividade nas transações comerciais ainda não demonstrou convincentemente que vai participar na mudança das diretrizes de desenvolvimento para o futuro. Assim mesmo, o acompanhamento das preferências de consumo pode nos levar a considerar a reestruturação das posturas dos órgãos dirigentes com relação às suas atribuições.</p>
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
                <img src=""""),_display_(/*189.28*/routes/*189.34*/.Assets.versioned("home/img/lms.png")),format.raw/*189.71*/("""" alt="" class="img-fluid">
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

"""),format.raw/*230.2*/("""

"""),_display_(/*232.2*/main(title)/*232.13*/(content)),format.raw/*232.22*/("""
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
                  DATE: Fri Nov 30 13:19:58 BRST 2018
                  SOURCE: C:/Users/natha/Documents/play/app/views/index.scala.html
                  HASH: 1077cc1ee50ca8632d2da5f974834c7f6ffe4e53
                  MATRIX: 1014->1|1026->6|1106->10|1137->15|1170->29|1184->36|1264->40|1294->61|1323->64|1891->605|1906->611|1950->634|2162->819|2177->825|2244->871|2706->1306|2721->1312|2789->1359|3252->1795|3267->1801|3311->1824|6241->4726|6257->4732|6317->4770|7851->6276|7867->6282|7927->6320|9458->7823|9474->7829|9531->7864|12834->11139|12850->11145|12909->11182|14879->26|14909->13114|14939->13117|14960->13128|14991->13137
                  LINES: 32->1|32->1|34->1|35->2|36->5|36->5|38->5|39->6|40->7|49->16|49->16|49->16|53->20|53->20|53->20|66->33|66->33|66->33|73->40|73->40|73->40|134->101|134->101|134->101|153->120|153->120|153->120|172->139|172->139|172->139|222->189|222->189|222->189|264->3|266->230|268->232|268->232|268->232
                  -- GENERATED --
              */
          