
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="pt-br">

<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="au theme template">
	<link rel="icon" href=""""),_display_(/*9.26*/routes/*9.32*/.Assets.versioned("images/speedometer.png")),format.raw/*9.75*/("""">
    <!-- Title Page-->
    <title>Login</title>

    <!-- Fontfaces CSS-->
    <link href=""""),_display_(/*14.18*/routes/*14.24*/.Assets.versioned("template/css/font-face.css")),format.raw/*14.71*/("""" rel="stylesheet" media="all">
    <link href=""""),_display_(/*15.18*/routes/*15.24*/.Assets.versioned("template/vendor/font-awesome-4.7/css/font-awesome.min.css")),format.raw/*15.102*/("""" rel="stylesheet" media="all">
    <link href=""""),_display_(/*16.18*/routes/*16.24*/.Assets.versioned("template/vendor/font-awesome-5/css/fontawesome-all.min.css")),format.raw/*16.103*/("""" rel="stylesheet" media="all">
    <link href=""""),_display_(/*17.18*/routes/*17.24*/.Assets.versioned("template/vendor/mdi-font/css/material-design-iconic-font.min.css")),format.raw/*17.109*/("""" rel="stylesheet" media="all">

    <!-- Bootstrap CSS-->
    <link href=""""),_display_(/*20.18*/routes/*20.24*/.Assets.versioned("template/vendor/bootstrap-4.1/bootstrap.min.css")),format.raw/*20.92*/("""" rel="stylesheet" media="all">

    <!-- Vendor CSS-->
    <link href=""""),_display_(/*23.18*/routes/*23.24*/.Assets.versioned("template/vendor/animsition/animsition.min.css")),format.raw/*23.90*/("""" rel="stylesheet" media="all">
    <link href=""""),_display_(/*24.18*/routes/*24.24*/.Assets.versioned("template/vendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css")),format.raw/*24.118*/("""" rel="stylesheet" media="all">
    <link href=""""),_display_(/*25.18*/routes/*25.24*/.Assets.versioned("template/vendor/wow/animate.css")),format.raw/*25.76*/("""" rel="stylesheet" media="all">
    <link href=""""),_display_(/*26.18*/routes/*26.24*/.Assets.versioned("template/vendor/css-hamburgers/hamburgers.min.css")),format.raw/*26.94*/("""" rel="stylesheet" media="all">
    <link href=""""),_display_(/*27.18*/routes/*27.24*/.Assets.versioned("template/vendor/slick/slick.css")),format.raw/*27.76*/("""" rel="stylesheet" media="all">
    <link href=""""),_display_(/*28.18*/routes/*28.24*/.Assets.versioned("template/vendor/select2/select2.min.css")),format.raw/*28.84*/("""" rel="stylesheet" media="all">
    <link href=""""),_display_(/*29.18*/routes/*29.24*/.Assets.versioned("template/vendor/perfect-scrollbar/perfect-scrollbar.css")),format.raw/*29.100*/("""" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href=""""),_display_(/*32.18*/routes/*32.24*/.Assets.versioned("template/css/theme.css")),format.raw/*32.67*/("""" rel="stylesheet" media="all">

</head>

<body class="animsition">
    <div class="page-wrapper">
        <div class="page-content--bge5">
            <div class="container">
                <div class="login-wrap">
                    <div class="login-content">
                        <div class="login-logo">
                            <a href=""""),_display_(/*43.39*/routes/*43.45*/.HomeController.index()),format.raw/*43.68*/("""">
                                <img src=""""),_display_(/*44.44*/routes/*44.50*/.Assets.versioned("images/logo_dashboard-03.png")),format.raw/*44.99*/("""" alt="ConnectEad">
                            </a>
                        </div>
                        <div class="login-form">
                            <form action="" method="post">
                                <div class="form-group">
                                    <label>Email  <small>(Use suas credenciais dos serviços integrados da UFRPE)</small></label>
                                    <input class="au-input au-input--full" type="email" name="email" placeholder="Email">
                                </div>
                                <div class="form-group">
                                    <label>Senha</label>
                                    <input class="au-input au-input--full" type="password" name="password" placeholder="Senha">
                                </div>
                                <div class="login-checkbox">
                                    <label>
                                        <input type="checkbox" name="remember">Lembrar-me
                                    </label>
                                    <label>
                                        <a href="#">Esqueceu a senha?</a>
                                    </label>
                                </div>
<!--                                 <button class="au-btn au-btn--block au-btn--green m-b-20" type="button">sign in</button> -->
                                <a id="sign_in" class="au-btn au-btn--block au-btn--green m-b-20" href=""""),_display_(/*66.106*/routes/*66.112*/.HomeController.dashboard()),format.raw/*66.139*/("""" role="button">Entrar</a>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Jquery JS-->
    <script src=""""),_display_(/*76.19*/routes/*76.25*/.Assets.versioned("template/vendor/jquery-3.2.1.min.js")),format.raw/*76.81*/(""""></script>
    <!-- Bootstrap JS-->
    <script src=""""),_display_(/*78.19*/routes/*78.25*/.Assets.versioned("template/vendor/bootstrap-4.1/popper.min.js")),format.raw/*78.89*/(""""></script>
    <script src=""""),_display_(/*79.19*/routes/*79.25*/.Assets.versioned("template/vendor/bootstrap-4.1/bootstrap.min.js")),format.raw/*79.92*/(""""></script>
    <!-- Vendor JS       -->
    <script src=""""),_display_(/*81.19*/routes/*81.25*/.Assets.versioned("template/vendor/slick/slick.min.js")),format.raw/*81.80*/("""">
    </script>
    <script src=""""),_display_(/*83.19*/routes/*83.25*/.Assets.versioned("template/vendor/wow/wow.min.js")),format.raw/*83.76*/(""""></script>
    <script src=""""),_display_(/*84.19*/routes/*84.25*/.Assets.versioned("template/vendor/animsition/animsition.min.js")),format.raw/*84.90*/(""""></script>
    <script src=""""),_display_(/*85.19*/routes/*85.25*/.Assets.versioned("template/vendor/bootstrap-progressbar/bootstrap-progressbar.min.js")),format.raw/*85.112*/("""">
    </script>
    <script src=""""),_display_(/*87.19*/routes/*87.25*/.Assets.versioned("template/vendor/counter-up/jquery.waypoints.min.js")),format.raw/*87.96*/(""""></script>
    <script src=""""),_display_(/*88.19*/routes/*88.25*/.Assets.versioned("template/vendor/counter-up/jquery.counterup.min.js")),format.raw/*88.96*/("""">
    </script>
    <script src=""""),_display_(/*90.19*/routes/*90.25*/.Assets.versioned("template/vendor/circle-progress/circle-progress.min.js")),format.raw/*90.100*/(""""></script>
    <script src=""""),_display_(/*91.19*/routes/*91.25*/.Assets.versioned("template/vendor/perfect-scrollbar/perfect-scrollbar.js")),format.raw/*91.100*/(""""></script>
    <script src=""""),_display_(/*92.19*/routes/*92.25*/.Assets.versioned("template/vendor/chartjs/Chart.bundle.min.js")),format.raw/*92.89*/(""""></script>
    <script src=""""),_display_(/*93.19*/routes/*93.25*/.Assets.versioned("template/vendor/select2/select2.min.js")),format.raw/*93.84*/("""">
    </script>

    <!-- Main JS-->
    <script src=""""),_display_(/*97.19*/routes/*97.25*/.Assets.versioned("template/js/main.js")),format.raw/*97.65*/(""""></script>

</body>

</html>
<!-- end document-->"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Nov 24 15:02:25 BRST 2018
                  SOURCE: C:/Users/natha/Documents/play/app/views/login.scala.html
                  HASH: 40ce105637243230635d177359ee3936d3d4e6a0
                  MATRIX: 1030->0|1340->284|1354->290|1417->333|1544->433|1559->439|1627->486|1704->536|1719->542|1819->620|1896->670|1911->676|2012->755|2089->805|2104->811|2211->896|2317->975|2332->981|2421->1049|2524->1125|2539->1131|2626->1197|2703->1247|2718->1253|2834->1347|2911->1397|2926->1403|2999->1455|3076->1505|3091->1511|3182->1581|3259->1631|3274->1637|3347->1689|3424->1739|3439->1745|3520->1805|3597->1855|3612->1861|3710->1937|3811->2011|3826->2017|3890->2060|4280->2423|4295->2429|4339->2452|4413->2499|4428->2505|4498->2554|6045->4073|6061->4079|6110->4106|6377->4346|6392->4352|6469->4408|6553->4465|6568->4471|6653->4535|6711->4566|6726->4572|6814->4639|6902->4700|6917->4706|6993->4761|7057->4798|7072->4804|7144->4855|7202->4886|7217->4892|7303->4957|7361->4988|7376->4994|7485->5081|7549->5118|7564->5124|7656->5195|7714->5226|7729->5232|7821->5303|7885->5340|7900->5346|7997->5421|8055->5452|8070->5458|8167->5533|8225->5564|8240->5570|8325->5634|8383->5665|8398->5671|8478->5730|8565->5790|8580->5796|8641->5836
                  LINES: 33->1|41->9|41->9|41->9|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|52->20|52->20|52->20|55->23|55->23|55->23|56->24|56->24|56->24|57->25|57->25|57->25|58->26|58->26|58->26|59->27|59->27|59->27|60->28|60->28|60->28|61->29|61->29|61->29|64->32|64->32|64->32|75->43|75->43|75->43|76->44|76->44|76->44|98->66|98->66|98->66|108->76|108->76|108->76|110->78|110->78|110->78|111->79|111->79|111->79|113->81|113->81|113->81|115->83|115->83|115->83|116->84|116->84|116->84|117->85|117->85|117->85|119->87|119->87|119->87|120->88|120->88|120->88|122->90|122->90|122->90|123->91|123->91|123->91|124->92|124->92|124->92|125->93|125->93|125->93|129->97|129->97|129->97
                  -- GENERATED --
              */
          