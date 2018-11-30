
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


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
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
                <a href=""""),_display_(/*36.27*/routes/*36.33*/.HomeController.index()),format.raw/*36.56*/("""">
                    <img src=""""),_display_(/*37.32*/routes/*37.38*/.Assets.versioned("images/logo_dashboard-03.png")),format.raw/*37.87*/("""" alt="ConnectEad" />
                </a>
            </div>
            <div class="menu-sidebar__content js-scrollbar1">
                <nav class="navbar-sidebar">
                    <ul class="list-unstyled navbar__list">
                        <li>
                            <a href=""""),_display_(/*44.39*/routes/*44.45*/.HomeController.dashboard()),format.raw/*44.72*/("""">
                                <i class="fas fa-tachometer-alt"></i>Dashboard</a>
                        </li>
                        <li class="has-sub">
                            <a class="js-arrow" href="#">
                                <i class="fas fa-chart-bar"></i>Gráficos</a>
                            <ul class="list-unstyled navbar__sub-list js-sub-list">
                                <li>
                                    <a href=""""),_display_(/*52.47*/routes/*52.53*/.HomeController.buscaAjuda()),format.raw/*52.81*/("""">Busca por Ajuda</a>
                                </li>
                                <li>
                                    <a href=""""),_display_(/*55.47*/routes/*55.53*/.HomeController.realizacaoTarefas()),format.raw/*55.88*/("""">Realização de Tarefas</a>
                                </li>
                                <li>
                                    <a href=""""),_display_(/*58.47*/routes/*58.53*/.HomeController.autoavaliacao()),format.raw/*58.84*/("""">Autoavaliação</a>
                                </li>
                                <li>
                                	<a href=""""),_display_(/*61.44*/routes/*61.50*/.HomeController.gerenciamentoTempo()),format.raw/*61.86*/("""">Gerenciamento do Tempo</a>
                                </li>
                                <li>
                                	<a href=""""),_display_(/*64.44*/routes/*64.50*/.HomeController.estabelecimentoMeta()),format.raw/*64.87*/("""">Estabelecimento de Metas</a>
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
                                                    <img src=""""),_display_(/*105.64*/routes/*105.70*/.Assets.versioned("template/images/icon/avatar-06.jpg")),format.raw/*105.125*/("""" alt="Cynthia Harvey" />
                                                </div>
                                                <div class="content">
                                                    <p>Meeting about new dashboard...</p>
                                                    <span>Cynthia Harvey, 3 min ago</span>
                                                </div>
                                            </div>
                                            <div class="email__item">
                                                <div class="image img-cir img-40">
                                                    <img src=""""),_display_(/*114.64*/routes/*114.70*/.Assets.versioned("template/images/icon/avatar-05.jpg")),format.raw/*114.125*/("""" alt="Cynthia Harvey" />
                                                </div>
                                                <div class="content">
                                                    <p>Meeting about new dashboard...</p>
                                                    <span>Cynthia Harvey, Yesterday</span>
                                                </div>
                                            </div>
                                            <div class="email__item">
                                                <div class="image img-cir img-40">
                                                    <img src=""""),_display_(/*123.64*/routes/*123.70*/.Assets.versioned("template/images/icon/avatar-04.jpg")),format.raw/*123.125*/("""" alt="Cynthia Harvey" />
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
                                            <img src=""""),_display_(/*178.56*/routes/*178.62*/.Assets.versioned("template/images/icon/avatar-01.jpg")),format.raw/*178.117*/("""" alt="João Silva" />
                                        </div>
                                        <div class="content">
                                            <a class="js-acc-btn" href="#">João Silva</a>
                                        </div>
                                        <div class="account-dropdown js-dropdown">
                                            <div class="info clearfix">
                                                <div class="image">
                                                    <a href="#">
                                                        <img src=""""),_display_(/*187.68*/routes/*187.74*/.Assets.versioned("template/images/icon/avatar-01.jpg")),format.raw/*187.129*/("""" alt="João Silva" />
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
                                                <a href=""""),_display_(/*208.59*/routes/*208.65*/.HomeController.login()),format.raw/*208.88*/("""">
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
            """),_display_(/*221.14*/content),format.raw/*221.21*/("""
            """),format.raw/*222.13*/("""<!-- END MAIN CONTENT-->
            <!-- END PAGE CONTAINER-->
        </div>
    </div>
    <script src=""""),_display_(/*226.19*/routes/*226.25*/.Assets.versioned("template/vendor/jquery-3.2.1.min.js")),format.raw/*226.81*/(""""></script>
    <!-- Bootstrap JS-->
    <script src=""""),_display_(/*228.19*/routes/*228.25*/.Assets.versioned("template/vendor/bootstrap-4.1/popper.min.js")),format.raw/*228.89*/(""""></script>
    <script src=""""),_display_(/*229.19*/routes/*229.25*/.Assets.versioned("template/vendor/bootstrap-4.1/bootstrap.min.js")),format.raw/*229.92*/(""""></script>
    <!-- Vendor JS       -->
    <script src=""""),_display_(/*231.19*/routes/*231.25*/.Assets.versioned("template/vendor/slick/slick.min.js")),format.raw/*231.80*/("""">
    </script>
    <script src=""""),_display_(/*233.19*/routes/*233.25*/.Assets.versioned("template/vendor/wow/wow.min.js")),format.raw/*233.76*/(""""></script>
    <script src=""""),_display_(/*234.19*/routes/*234.25*/.Assets.versioned("template/vendor/animsition/animsition.min.js")),format.raw/*234.90*/(""""></script>
    <script src=""""),_display_(/*235.19*/routes/*235.25*/.Assets.versioned("template/vendor/bootstrap-progressbar/bootstrap-progressbar.min.js")),format.raw/*235.112*/("""">
    </script>
    <script src=""""),_display_(/*237.19*/routes/*237.25*/.Assets.versioned("template/vendor/counter-up/jquery.waypoints.min.js")),format.raw/*237.96*/(""""></script>
    <script src=""""),_display_(/*238.19*/routes/*238.25*/.Assets.versioned("template/vendor/counter-up/jquery.counterup.min.js")),format.raw/*238.96*/("""">
    </script>
    <script src=""""),_display_(/*240.19*/routes/*240.25*/.Assets.versioned("template/vendor/circle-progress/circle-progress.min.js")),format.raw/*240.100*/(""""></script>
    <script src=""""),_display_(/*241.19*/routes/*241.25*/.Assets.versioned("template/vendor/perfect-scrollbar/perfect-scrollbar.js")),format.raw/*241.100*/(""""></script>
    <script src=""""),_display_(/*242.19*/routes/*242.25*/.Assets.versioned("template/vendor/chartjs/Chart.bundle.min.js")),format.raw/*242.89*/(""""></script>
    <script src=""""),_display_(/*243.19*/routes/*243.25*/.Assets.versioned("template/vendor/select2/select2.min.js")),format.raw/*243.84*/("""">
    </script>
    <!-- Main JS-->
    <script src=""""),_display_(/*246.19*/routes/*246.25*/.Assets.versioned("template/js/main.js")),format.raw/*246.65*/(""""></script>
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
                  DATE: Fri Nov 30 13:19:58 BRST 2018
                  SOURCE: C:/Users/natha/Documents/play/app/views/dashboard.scala.html
                  HASH: 9365290f1682513bd48e7f28db894fccc3965da3
                  MATRIX: 955->1|1077->30|1378->305|1392->311|1455->354|1520->392|1546->397|1625->449|1640->455|1708->502|1784->551|1799->557|1899->635|1975->684|1990->690|2091->769|2167->818|2182->824|2289->909|2391->984|2406->990|2495->1058|2594->1130|2609->1136|2696->1202|2772->1251|2787->1257|2903->1351|2979->1400|2994->1406|3067->1458|3143->1507|3158->1513|3249->1583|3325->1632|3340->1638|3413->1690|3489->1739|3504->1745|3585->1805|3661->1854|3676->1860|3774->1936|3871->2006|3886->2012|3950->2055|4220->2298|4235->2304|4279->2327|4340->2361|4355->2367|4425->2416|4748->2712|4763->2718|4811->2745|5301->3208|5316->3214|5365->3242|5535->3385|5550->3391|5606->3426|5782->3575|5797->3581|5849->3612|6014->3750|6029->3756|6086->3792|6260->3939|6275->3945|6333->3982|8538->6159|8554->6165|8632->6220|9314->6874|9330->6880|9408->6935|10090->7589|10106->7595|10184->7650|14011->11449|14027->11455|14105->11510|14756->12133|14772->12139|14850->12194|16396->13712|16412->13718|16457->13741|16979->14235|17008->14242|17050->14255|17186->14363|17202->14369|17280->14425|17363->14480|17379->14486|17465->14550|17523->14580|17539->14586|17628->14653|17715->14712|17731->14718|17808->14773|17871->14808|17887->14814|17960->14865|18018->14895|18034->14901|18121->14966|18179->14996|18195->15002|18305->15089|18368->15124|18384->15130|18477->15201|18535->15231|18551->15237|18644->15308|18707->15343|18723->15349|18821->15424|18879->15454|18895->15460|18993->15535|19051->15565|19067->15571|19153->15635|19211->15665|19227->15671|19308->15730|19391->15785|19407->15791|19469->15831
                  LINES: 28->1|33->2|40->9|40->9|40->9|42->11|42->11|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|49->18|49->18|49->18|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|59->28|59->28|59->28|67->36|67->36|67->36|68->37|68->37|68->37|75->44|75->44|75->44|83->52|83->52|83->52|86->55|86->55|86->55|89->58|89->58|89->58|92->61|92->61|92->61|95->64|95->64|95->64|136->105|136->105|136->105|145->114|145->114|145->114|154->123|154->123|154->123|209->178|209->178|209->178|218->187|218->187|218->187|239->208|239->208|239->208|252->221|252->221|253->222|257->226|257->226|257->226|259->228|259->228|259->228|260->229|260->229|260->229|262->231|262->231|262->231|264->233|264->233|264->233|265->234|265->234|265->234|266->235|266->235|266->235|268->237|268->237|268->237|269->238|269->238|269->238|271->240|271->240|271->240|272->241|272->241|272->241|273->242|273->242|273->242|274->243|274->243|274->243|277->246|277->246|277->246
                  -- GENERATED --
              */
          