
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
                  DATE: Mon Nov 26 20:57:18 BRST 2018
                  SOURCE: C:/Users/natha/Documents/play/app/views/dashboard.scala.html
                  HASH: e8af13e68dc361e1931269c89d228f86723e7c54
                  MATRIX: 955->1|1078->29|1106->31|1414->313|1428->319|1491->362|1558->402|1584->407|1665->461|1680->467|1748->514|1825->564|1840->570|1940->648|2017->698|2032->704|2133->783|2210->833|2225->839|2332->924|2436->1001|2451->1007|2540->1075|2641->1149|2656->1155|2743->1221|2820->1271|2835->1277|2951->1371|3028->1421|3043->1427|3116->1479|3193->1529|3208->1535|3299->1605|3376->1655|3391->1661|3464->1713|3541->1763|3556->1769|3637->1829|3714->1879|3729->1885|3827->1961|3926->2033|3941->2039|4005->2082|4283->2333|4298->2339|4342->2362|4404->2397|4419->2403|4489->2452|4819->2755|4834->2761|4882->2788|5380->3259|5395->3265|5444->3293|5617->3439|5632->3445|5688->3480|5867->3632|5882->3638|5934->3669|6102->3810|6117->3816|6174->3852|6351->4002|6366->4008|6424->4045|8670->6263|8686->6269|8764->6324|9455->6987|9471->6993|9549->7048|10240->7711|10256->7717|10334->7772|14216->11626|14232->11632|14310->11687|14970->12319|14986->12325|15064->12380|16631->13919|16647->13925|16692->13948|17227->14455|17256->14462|17299->14476|17439->14588|17455->14594|17533->14650|17618->14707|17634->14713|17720->14777|17779->14808|17795->14814|17884->14881|17973->14942|17989->14948|18066->15003|18131->15040|18147->15046|18220->15097|18279->15128|18295->15134|18382->15199|18441->15230|18457->15236|18567->15323|18632->15360|18648->15366|18741->15437|18800->15468|18816->15474|18909->15545|18974->15582|18990->15588|19088->15663|19147->15694|19163->15700|19261->15775|19320->15806|19336->15812|19422->15876|19481->15907|19497->15913|19578->15972|19664->16030|19680->16036|19742->16076
                  LINES: 28->1|33->1|34->2|41->9|41->9|41->9|43->11|43->11|45->13|45->13|45->13|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|50->18|50->18|50->18|52->20|52->20|52->20|53->21|53->21|53->21|54->22|54->22|54->22|55->23|55->23|55->23|56->24|56->24|56->24|57->25|57->25|57->25|58->26|58->26|58->26|60->28|60->28|60->28|68->36|68->36|68->36|69->37|69->37|69->37|76->44|76->44|76->44|84->52|84->52|84->52|87->55|87->55|87->55|90->58|90->58|90->58|93->61|93->61|93->61|96->64|96->64|96->64|137->105|137->105|137->105|146->114|146->114|146->114|155->123|155->123|155->123|210->178|210->178|210->178|219->187|219->187|219->187|240->208|240->208|240->208|253->221|253->221|254->222|258->226|258->226|258->226|260->228|260->228|260->228|261->229|261->229|261->229|263->231|263->231|263->231|265->233|265->233|265->233|266->234|266->234|266->234|267->235|267->235|267->235|269->237|269->237|269->237|270->238|270->238|270->238|272->240|272->240|272->240|273->241|273->241|273->241|274->242|274->242|274->242|275->243|275->243|275->243|278->246|278->246|278->246
                  -- GENERATED --
              */
          