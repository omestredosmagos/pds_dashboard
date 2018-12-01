
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

object signup extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
    <title>Sign Up</title>

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
                                <img src=""""),_display_(/*44.44*/routes/*44.50*/.Assets.versioned("images/logo_dashboard-05-05.png")),format.raw/*44.102*/("""" alt="ConnectEad">
                            </a>
                        </div>
                        <div class="login-form">
                            <form action="" method="post">
                                <div class="form-group">
                                    <label>Usuário</label>
                                    <input class="au-input au-input--full" type="text" name="username" placeholder="usuario">
                                </div>
                                <div class="form-group">
                                    <label>E-mail</label>
                                    <input class="au-input au-input--full" type="email" name="email" placeholder="email&commat;example.com">
                                </div>
                                <div class="form-group">
                                    <label>Senha</label>
                                    <input class="au-input au-input--full" type="password" name="password" placeholder="senha">
                                </div>
                                <div class="login-checkbox">
                                    <label>
                                        <input type="checkbox" name="agree">Concordar com os termos e política
                                    </label>
                                </div>
<!--                                 <button class="au-btn au-btn--block au-btn--green m-b-20" type="button">sign in</button> -->
                                <a id="sign_in" class="au-btn au-btn--block au-btn--green m-b-20" href=""""),_display_(/*67.106*/routes/*67.112*/.HomeController.login()),format.raw/*67.135*/("""" role="button">Registrar</a>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Jquery JS-->
    <script src=""""),_display_(/*77.19*/routes/*77.25*/.Assets.versioned("template/vendor/jquery-3.2.1.min.js")),format.raw/*77.81*/(""""></script>
    <!-- Bootstrap JS-->
    <script src=""""),_display_(/*79.19*/routes/*79.25*/.Assets.versioned("template/vendor/bootstrap-4.1/popper.min.js")),format.raw/*79.89*/(""""></script>
    <script src=""""),_display_(/*80.19*/routes/*80.25*/.Assets.versioned("template/vendor/bootstrap-4.1/bootstrap.min.js")),format.raw/*80.92*/(""""></script>
    <!-- Vendor JS       -->
    <script src=""""),_display_(/*82.19*/routes/*82.25*/.Assets.versioned("template/vendor/slick/slick.min.js")),format.raw/*82.80*/("""">
    </script>
    <script src=""""),_display_(/*84.19*/routes/*84.25*/.Assets.versioned("template/vendor/wow/wow.min.js")),format.raw/*84.76*/(""""></script>
    <script src=""""),_display_(/*85.19*/routes/*85.25*/.Assets.versioned("template/vendor/animsition/animsition.min.js")),format.raw/*85.90*/(""""></script>
    <script src=""""),_display_(/*86.19*/routes/*86.25*/.Assets.versioned("template/vendor/bootstrap-progressbar/bootstrap-progressbar.min.js")),format.raw/*86.112*/("""">
    </script>
    <script src=""""),_display_(/*88.19*/routes/*88.25*/.Assets.versioned("template/vendor/counter-up/jquery.waypoints.min.js")),format.raw/*88.96*/(""""></script>
    <script src=""""),_display_(/*89.19*/routes/*89.25*/.Assets.versioned("template/vendor/counter-up/jquery.counterup.min.js")),format.raw/*89.96*/("""">
    </script>
    <script src=""""),_display_(/*91.19*/routes/*91.25*/.Assets.versioned("template/vendor/circle-progress/circle-progress.min.js")),format.raw/*91.100*/(""""></script>
    <script src=""""),_display_(/*92.19*/routes/*92.25*/.Assets.versioned("template/vendor/perfect-scrollbar/perfect-scrollbar.js")),format.raw/*92.100*/(""""></script>
    <script src=""""),_display_(/*93.19*/routes/*93.25*/.Assets.versioned("template/vendor/chartjs/Chart.bundle.min.js")),format.raw/*93.89*/(""""></script>
    <script src=""""),_display_(/*94.19*/routes/*94.25*/.Assets.versioned("template/vendor/select2/select2.min.js")),format.raw/*94.84*/("""">
    </script>

    <!-- Main JS-->
    <script src=""""),_display_(/*98.19*/routes/*98.25*/.Assets.versioned("template/js/main.js")),format.raw/*98.65*/(""""></script>

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
                  DATE: Fri Nov 30 22:17:32 BRST 2018
                  SOURCE: C:/Users/natha/Documents/play/app/views/signup.scala.html
                  HASH: ec894e206ca66d4c1833900b36a13d50de18211b
                  MATRIX: 1031->0|1341->284|1355->290|1418->333|1547->435|1562->441|1630->488|1707->538|1722->544|1822->622|1899->672|1914->678|2015->757|2092->807|2107->813|2214->898|2320->977|2335->983|2424->1051|2527->1127|2542->1133|2629->1199|2706->1249|2721->1255|2837->1349|2914->1399|2929->1405|3002->1457|3079->1507|3094->1513|3185->1583|3262->1633|3277->1639|3350->1691|3427->1741|3442->1747|3523->1807|3600->1857|3615->1863|3713->1939|3814->2013|3829->2019|3893->2062|4283->2425|4298->2431|4342->2454|4416->2501|4431->2507|4505->2559|6140->4166|6156->4172|6201->4195|6471->4438|6486->4444|6563->4500|6647->4557|6662->4563|6747->4627|6805->4658|6820->4664|6908->4731|6996->4792|7011->4798|7087->4853|7151->4890|7166->4896|7238->4947|7296->4978|7311->4984|7397->5049|7455->5080|7470->5086|7579->5173|7643->5210|7658->5216|7750->5287|7808->5318|7823->5324|7915->5395|7979->5432|7994->5438|8091->5513|8149->5544|8164->5550|8261->5625|8319->5656|8334->5662|8419->5726|8477->5757|8492->5763|8572->5822|8659->5882|8674->5888|8735->5928
                  LINES: 33->1|41->9|41->9|41->9|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|52->20|52->20|52->20|55->23|55->23|55->23|56->24|56->24|56->24|57->25|57->25|57->25|58->26|58->26|58->26|59->27|59->27|59->27|60->28|60->28|60->28|61->29|61->29|61->29|64->32|64->32|64->32|75->43|75->43|75->43|76->44|76->44|76->44|99->67|99->67|99->67|109->77|109->77|109->77|111->79|111->79|111->79|112->80|112->80|112->80|114->82|114->82|114->82|116->84|116->84|116->84|117->85|117->85|117->85|118->86|118->86|118->86|120->88|120->88|120->88|121->89|121->89|121->89|123->91|123->91|123->91|124->92|124->92|124->92|125->93|125->93|125->93|126->94|126->94|126->94|130->98|130->98|130->98
                  -- GENERATED --
              */
          