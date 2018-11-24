
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

object dashboard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: Html)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="pt-br">
<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="au theme template">
	<link rel="icon" href=""""),_display_(/*9.26*/routes/*9.32*/.Assets.versioned("images/speedometer.png")),format.raw/*9.75*/("""">
    <!-- Title Page-->
    <title>"""),_display_(/*11.13*/title),format.raw/*11.18*/("""</title>
    <!-- Fontfaces CSS-->
    <link href=""""),_display_(/*13.18*/routes/*13.24*/.Assets.versioned("template/css/font-face.css")),format.raw/*13.71*/("""" rel="stylesheet" media="all">
    <link href=""""),_display_(/*14.18*/routes/*14.24*/.Assets.versioned("template/vendor/font-awesome-4.7/css/font-awesome.min.css")),format.raw/*14.102*/("""" rel="stylesheet" media="all">
    <link href=""""),_display_(/*15.18*/routes/*15.24*/.Assets.versioned("template/vendor/font-awesome-5/css/fontawesome-all.min.css")),format.raw/*15.103*/("""" rel="stylesheet" media="all">
    <link href=""""),_display_(/*16.18*/routes/*16.24*/.Assets.versioned("template/vendor/mdi-font/css/material-design-iconic-font.min.css")),format.raw/*16.109*/("""" rel="stylesheet" media="all">
    <!-- Bootstrap CSS-->
    <link href=""""),_display_(/*18.18*/routes/*18.24*/.Assets.versioned("template/vendor/bootstrap-4.1/bootstrap.min.css")),format.raw/*18.92*/("""" rel="stylesheet" media="all">
    <!-- Vendor CSS-->
    <link href=""""),_display_(/*20.18*/routes/*20.24*/.Assets.versioned("template/vendor/animsition/animsition.min.css")),format.raw/*20.90*/("""" rel="stylesheet" media="all">
    <link href=""""),_display_(/*21.18*/routes/*21.24*/.Assets.versioned("template/vendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css")),format.raw/*21.118*/("""" rel="stylesheet" media="all">
    <link href=""""),_display_(/*22.18*/routes/*22.24*/.Assets.versioned("template/vendor/wow/animate.css")),format.raw/*22.76*/("""" rel="stylesheet" media="all">
    <link href=""""),_display_(/*23.18*/routes/*23.24*/.Assets.versioned("template/vendor/css-hamburgers/hamburgers.min.css")),format.raw/*23.94*/("""" rel="stylesheet" media="all">
    <link href=""""),_display_(/*24.18*/routes/*24.24*/.Assets.versioned("template/vendor/slick/slick.css")),format.raw/*24.76*/("""" rel="stylesheet" media="all">
    <link href=""""),_display_(/*25.18*/routes/*25.24*/.Assets.versioned("template/vendor/select2/select2.min.css")),format.raw/*25.84*/("""" rel="stylesheet" media="all">
    <link href=""""),_display_(/*26.18*/routes/*26.24*/.Assets.versioned("template/vendor/perfect-scrollbar/perfect-scrollbar.css")),format.raw/*26.100*/("""" rel="stylesheet" media="all">
    <!-- Main CSS-->
    <link href=""""),_display_(/*28.18*/routes/*28.24*/.Assets.versioned("template/css/theme.css")),format.raw/*28.67*/("""" rel="stylesheet" media="all">
</head>
<body class="animsition">
    <div class="page-wrapper">
        <!-- MENU SIDEBAR-->
        <aside class="menu-sidebar d-none d-lg-block">
            <div class="logo">
                <a href="#">
                    <img src=""""),_display_(/*36.32*/routes/*36.38*/.Assets.versioned("images/logo_dashboard-03.png")),format.raw/*36.87*/("""" alt="ConnectEad" />
                </a>
            </div>
            <div class="menu-sidebar__content js-scrollbar1">
                <nav class="navbar-sidebar">
                    <ul class="list-unstyled navbar__list">
                        <li>
                            <a href=""""),_display_(/*43.39*/routes/*43.45*/.HomeController.dashboard()),format.raw/*43.72*/("""">
                                <i class="fas fa-tachometer-alt"></i>Dashboard</a>
                        </li>
                        <li class="has-sub">
                            <a class="js-arrow" href="#">
                                <i class="fas fa-chart-bar"></i>Gráficos</a>
                            <ul class="list-unstyled navbar__sub-list js-sub-list">
                                <li>
                                    <a href=""""),_display_(/*51.47*/routes/*51.53*/.HomeController.buscaAjuda()),format.raw/*51.81*/("""">Busca por Ajuda</a>
                                </li>
                                <li>
                                    <a href=""""),_display_(/*54.47*/routes/*54.53*/.HomeController.realizacaoTarefas()),format.raw/*54.88*/("""">Realização de Tarefas</a>
                                </li>
                                <li>
                                    <a href=""""),_display_(/*57.47*/routes/*57.53*/.HomeController.autoavaliacao()),format.raw/*57.84*/("""">Autoavaliação</a>
                                </li>
                                <li>
                                	<a href=""""),_display_(/*60.44*/routes/*60.50*/.HomeController.gerenciamentoTempo()),format.raw/*60.86*/("""">Gerenciamento do Tempo</a>
                                </li>
                                <li>
                                	<a href=""""),_display_(/*63.44*/routes/*63.50*/.HomeController.estabelecimentoMeta()),format.raw/*63.87*/("""">Estabelecimento de Metas</a>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <a href="#">
                                <i class="fas fa-envelope"></i>Inbox</a>
                        </li>
                        <li>
                            <a href="#">
                                <i class="fas fa-calendar-alt"></i>Calendário</a>
                        </li>
                    </ul>
                </nav>
            </div>
        </aside>
        <!-- END MENU SIDEBAR-->
        <!-- PAGE CONTAINER-->
        <div class="page-container">
            <!-- HEADER DESKTOP-->
            <header class="header-desktop">
                <div class="section__content section__content--p30">
                    <div class="container-fluid">
                        <div class="header-wrap">
                            <form class="form-header" action="" method="POST">
                                <input class="au-input au-input--xl" type="text" name="search" placeholder="pesquisar..." />
                                <button class="au-btn--submit" type="submit">
                                    <i class="zmdi zmdi-search"></i>
                                </button>
                            </form>
                            <div class="header-button">
                                <div class="noti-wrap">
                                    <div class="noti__item js-item-menu">
                                        <i class="zmdi zmdi-email"></i>
                                        <span class="quantity">1</span>
                                        <div class="email-dropdown js-dropdown">
                                            <div class="email__title">
                                                <p>Você tem 1 Novo Email</p>
                                            </div>
                                            <div class="email__item">
                                                <div class="image img-cir img-40">
                                                    <img src=""""),_display_(/*104.64*/routes/*104.70*/.Assets.versioned("template/images/icon/avatar-06.jpg")),format.raw/*104.125*/("""" alt="Cynthia Harvey" />
                                                </div>
                                                <div class="content">
                                                    <p>Meeting about new dashboard...</p>
                                                    <span>Cynthia Harvey, 3 min ago</span>
                                                </div>
                                            </div>
                                            <div class="email__item">
                                                <div class="image img-cir img-40">
                                                    <img src=""""),_display_(/*113.64*/routes/*113.70*/.Assets.versioned("template/images/icon/avatar-05.jpg")),format.raw/*113.125*/("""" alt="Cynthia Harvey" />
                                                </div>
                                                <div class="content">
                                                    <p>Meeting about new dashboard...</p>
                                                    <span>Cynthia Harvey, Yesterday</span>
                                                </div>
                                            </div>
                                            <div class="email__item">
                                                <div class="image img-cir img-40">
                                                    <img src=""""),_display_(/*122.64*/routes/*122.70*/.Assets.versioned("template/images/icon/avatar-04.jpg")),format.raw/*122.125*/("""" alt="Cynthia Harvey" />
                                                </div>
                                                <div class="content">
                                                    <p>Meeting about new dashboard...</p>
                                                    <span>Cynthia Harvey, April 12,2018</span>
                                                </div>
                                            </div>
                                            <div class="email__footer">
                                                <a href="#">Ver Todos</a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="noti__item js-item-menu">
                                        <i class="zmdi zmdi-notifications"></i>
                                        <span class="quantity">3</span>
                                        <div class="notifi-dropdown js-dropdown">
                                            <div class="notifi__title">
                                                <p>Você tem 3 Notificações</p>
                                            </div>
                                            <div class="notifi__item">
                                                <div class="bg-c1 img-cir img-40">
                                                    <i class="zmdi zmdi-email-open"></i>
                                                </div>
                                                <div class="content">
                                                    <p>You got a email notification</p>
                                                    <span class="date">April 12, 2018 06:50</span>
                                                </div>
                                            </div>
                                            <div class="notifi__item">
                                                <div class="bg-c2 img-cir img-40">
                                                    <i class="zmdi zmdi-account-box"></i>
                                                </div>
                                                <div class="content">
                                                    <p>Your account has been blocked</p>
                                                    <span class="date">April 12, 2018 06:50</span>
                                                </div>
                                            </div>
                                            <div class="notifi__item">
                                                <div class="bg-c3 img-cir img-40">
                                                    <i class="zmdi zmdi-file-text"></i>
                                                </div>
                                                <div class="content">
                                                    <p>You got a new file</p>
                                                    <span class="date">April 12, 2018 06:50</span>
                                                </div>
                                            </div>
                                            <div class="notifi__footer">
                                                <a href="#">Ver Todas</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="account-wrap">
                                    <div class="account-item clearfix js-item-menu">
                                        <div class="image">
                                            <img src=""""),_display_(/*177.56*/routes/*177.62*/.Assets.versioned("template/images/icon/avatar-01.jpg")),format.raw/*177.117*/("""" alt="João Silva" />
                                        </div>
                                        <div class="content">
                                            <a class="js-acc-btn" href="#">João Silva</a>
                                        </div>
                                        <div class="account-dropdown js-dropdown">
                                            <div class="info clearfix">
                                                <div class="image">
                                                    <a href="#">
                                                        <img src=""""),_display_(/*186.68*/routes/*186.74*/.Assets.versioned("template/images/icon/avatar-01.jpg")),format.raw/*186.129*/("""" alt="João Silva" />
                                                    </a>
                                                </div>
                                                <div class="content">
                                                    <h5 class="name">
                                                        <a href="#">João Silva</a>
                                                    </h5>
                                                    <span class="email">joão.silva&commat;ufrpe.br</span>
                                                </div>
                                            </div>
                                            <div class="account-dropdown__body">
                                                <div class="account-dropdown__item">
                                                    <a href="#">
                                                        <i class="zmdi zmdi-account"></i>Perfil</a>
                                                </div>
                                                <div class="account-dropdown__item">
                                                    <a href="#">
                                                        <i class="zmdi zmdi-settings"></i>Configurações</a>
                                                </div>
                                            </div>
                                            <div class="account-dropdown__footer">
                                                <a href=""""),_display_(/*207.59*/routes/*207.65*/.HomeController.login()),format.raw/*207.88*/("""">
                                                    <i class="zmdi zmdi-power"></i>Sair</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </header>
            <!-- HEADER DESKTOP-->
            <!-- MAIN CONTENT-->
            """),_display_(/*220.14*/content),format.raw/*220.21*/("""
            """),format.raw/*221.13*/("""<!-- END MAIN CONTENT-->
            <!-- END PAGE CONTAINER-->
        </div>
    </div>
    <script src=""""),_display_(/*225.19*/routes/*225.25*/.Assets.versioned("template/vendor/jquery-3.2.1.min.js")),format.raw/*225.81*/(""""></script>
    <!-- Bootstrap JS-->
    <script src=""""),_display_(/*227.19*/routes/*227.25*/.Assets.versioned("template/vendor/bootstrap-4.1/popper.min.js")),format.raw/*227.89*/(""""></script>
    <script src=""""),_display_(/*228.19*/routes/*228.25*/.Assets.versioned("template/vendor/bootstrap-4.1/bootstrap.min.js")),format.raw/*228.92*/(""""></script>
    <!-- Vendor JS       -->
    <script src=""""),_display_(/*230.19*/routes/*230.25*/.Assets.versioned("template/vendor/slick/slick.min.js")),format.raw/*230.80*/("""">
    </script>
    <script src=""""),_display_(/*232.19*/routes/*232.25*/.Assets.versioned("template/vendor/wow/wow.min.js")),format.raw/*232.76*/(""""></script>
    <script src=""""),_display_(/*233.19*/routes/*233.25*/.Assets.versioned("template/vendor/animsition/animsition.min.js")),format.raw/*233.90*/(""""></script>
    <script src=""""),_display_(/*234.19*/routes/*234.25*/.Assets.versioned("template/vendor/bootstrap-progressbar/bootstrap-progressbar.min.js")),format.raw/*234.112*/("""">
    </script>
    <script src=""""),_display_(/*236.19*/routes/*236.25*/.Assets.versioned("template/vendor/counter-up/jquery.waypoints.min.js")),format.raw/*236.96*/(""""></script>
    <script src=""""),_display_(/*237.19*/routes/*237.25*/.Assets.versioned("template/vendor/counter-up/jquery.counterup.min.js")),format.raw/*237.96*/("""">
    </script>
    <script src=""""),_display_(/*239.19*/routes/*239.25*/.Assets.versioned("template/vendor/circle-progress/circle-progress.min.js")),format.raw/*239.100*/(""""></script>
    <script src=""""),_display_(/*240.19*/routes/*240.25*/.Assets.versioned("template/vendor/perfect-scrollbar/perfect-scrollbar.js")),format.raw/*240.100*/(""""></script>
    <script src=""""),_display_(/*241.19*/routes/*241.25*/.Assets.versioned("template/vendor/chartjs/Chart.bundle.min.js")),format.raw/*241.89*/(""""></script>
    <script src=""""),_display_(/*242.19*/routes/*242.25*/.Assets.versioned("template/vendor/select2/select2.min.js")),format.raw/*242.84*/("""">
    </script>
    <!-- Main JS-->
    <script src=""""),_display_(/*245.19*/routes/*245.25*/.Assets.versioned("template/js/main.js")),format.raw/*245.65*/(""""></script>
</body>
</html>
<!-- end document-->
"""))
      }
    }
  }

  def render(title:Html,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Nov 24 15:02:24 BRST 2018
                  SOURCE: C:/Users/natha/Documents/play/app/views/dashboard.scala.html
                  HASH: 5ab400a95b9286e5edbde978b63d3920e9dbdc63
                  MATRIX: 955->1|1078->29|1106->31|1414->313|1428->319|1491->362|1558->402|1584->407|1665->461|1680->467|1748->514|1825->564|1840->570|1940->648|2017->698|2032->704|2133->783|2210->833|2225->839|2332->924|2436->1001|2451->1007|2540->1075|2641->1149|2656->1155|2743->1221|2820->1271|2835->1277|2951->1371|3028->1421|3043->1427|3116->1479|3193->1529|3208->1535|3299->1605|3376->1655|3391->1661|3464->1713|3541->1763|3556->1769|3637->1829|3714->1879|3729->1885|3827->1961|3926->2033|3941->2039|4005->2082|4312->2362|4327->2368|4397->2417|4727->2720|4742->2726|4790->2753|5288->3224|5303->3230|5352->3258|5525->3404|5540->3410|5596->3445|5775->3597|5790->3603|5842->3634|6010->3775|6025->3781|6082->3817|6259->3967|6274->3973|6332->4010|8578->6228|8594->6234|8672->6289|9363->6952|9379->6958|9457->7013|10148->7676|10164->7682|10242->7737|14124->11591|14140->11597|14218->11652|14878->12284|14894->12290|14972->12345|16539->13884|16555->13890|16600->13913|17135->14420|17164->14427|17207->14441|17347->14553|17363->14559|17441->14615|17526->14672|17542->14678|17628->14742|17687->14773|17703->14779|17792->14846|17881->14907|17897->14913|17974->14968|18039->15005|18055->15011|18128->15062|18187->15093|18203->15099|18290->15164|18349->15195|18365->15201|18475->15288|18540->15325|18556->15331|18649->15402|18708->15433|18724->15439|18817->15510|18882->15547|18898->15553|18996->15628|19055->15659|19071->15665|19169->15740|19228->15771|19244->15777|19330->15841|19389->15872|19405->15878|19486->15937|19572->15995|19588->16001|19650->16041
                  LINES: 28->1|33->1|34->2|41->9|41->9|41->9|43->11|43->11|45->13|45->13|45->13|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|50->18|50->18|50->18|52->20|52->20|52->20|53->21|53->21|53->21|54->22|54->22|54->22|55->23|55->23|55->23|56->24|56->24|56->24|57->25|57->25|57->25|58->26|58->26|58->26|60->28|60->28|60->28|68->36|68->36|68->36|75->43|75->43|75->43|83->51|83->51|83->51|86->54|86->54|86->54|89->57|89->57|89->57|92->60|92->60|92->60|95->63|95->63|95->63|136->104|136->104|136->104|145->113|145->113|145->113|154->122|154->122|154->122|209->177|209->177|209->177|218->186|218->186|218->186|239->207|239->207|239->207|252->220|252->220|253->221|257->225|257->225|257->225|259->227|259->227|259->227|260->228|260->228|260->228|262->230|262->230|262->230|264->232|264->232|264->232|265->233|265->233|265->233|266->234|266->234|266->234|268->236|268->236|268->236|269->237|269->237|269->237|271->239|271->239|271->239|272->240|272->240|272->240|273->241|273->241|273->241|274->242|274->242|274->242|277->245|277->245|277->245
                  -- GENERATED --
              */
          