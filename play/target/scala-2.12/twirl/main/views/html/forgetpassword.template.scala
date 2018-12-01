
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

object forgetpassword extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
    <title>Recuperar Senha</title>

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
                                    <label>E-mail</label>
                                    <input class="au-input au-input--full" type="email" name="email" placeholder="email&commat;example.com">
                                </div>                                                                
<!--                                 <button class="au-btn au-btn--block au-btn--green m-b-20" type="button">sign in</button> -->
                                <a id="sign_in" class="au-btn au-btn--block au-btn--green m-b-20" href=""""),_display_(/*54.106*/routes/*54.112*/.HomeController.login()),format.raw/*54.135*/("""" role="button">Enviar</a>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Jquery JS-->
    <script src=""""),_display_(/*64.19*/routes/*64.25*/.Assets.versioned("template/vendor/jquery-3.2.1.min.js")),format.raw/*64.81*/(""""></script>
    <!-- Bootstrap JS-->
    <script src=""""),_display_(/*66.19*/routes/*66.25*/.Assets.versioned("template/vendor/bootstrap-4.1/popper.min.js")),format.raw/*66.89*/(""""></script>
    <script src=""""),_display_(/*67.19*/routes/*67.25*/.Assets.versioned("template/vendor/bootstrap-4.1/bootstrap.min.js")),format.raw/*67.92*/(""""></script>
    <!-- Vendor JS       -->
    <script src=""""),_display_(/*69.19*/routes/*69.25*/.Assets.versioned("template/vendor/slick/slick.min.js")),format.raw/*69.80*/("""">
    </script>
    <script src=""""),_display_(/*71.19*/routes/*71.25*/.Assets.versioned("template/vendor/wow/wow.min.js")),format.raw/*71.76*/(""""></script>
    <script src=""""),_display_(/*72.19*/routes/*72.25*/.Assets.versioned("template/vendor/animsition/animsition.min.js")),format.raw/*72.90*/(""""></script>
    <script src=""""),_display_(/*73.19*/routes/*73.25*/.Assets.versioned("template/vendor/bootstrap-progressbar/bootstrap-progressbar.min.js")),format.raw/*73.112*/("""">
    </script>
    <script src=""""),_display_(/*75.19*/routes/*75.25*/.Assets.versioned("template/vendor/counter-up/jquery.waypoints.min.js")),format.raw/*75.96*/(""""></script>
    <script src=""""),_display_(/*76.19*/routes/*76.25*/.Assets.versioned("template/vendor/counter-up/jquery.counterup.min.js")),format.raw/*76.96*/("""">
    </script>
    <script src=""""),_display_(/*78.19*/routes/*78.25*/.Assets.versioned("template/vendor/circle-progress/circle-progress.min.js")),format.raw/*78.100*/(""""></script>
    <script src=""""),_display_(/*79.19*/routes/*79.25*/.Assets.versioned("template/vendor/perfect-scrollbar/perfect-scrollbar.js")),format.raw/*79.100*/(""""></script>
    <script src=""""),_display_(/*80.19*/routes/*80.25*/.Assets.versioned("template/vendor/chartjs/Chart.bundle.min.js")),format.raw/*80.89*/(""""></script>
    <script src=""""),_display_(/*81.19*/routes/*81.25*/.Assets.versioned("template/vendor/select2/select2.min.js")),format.raw/*81.84*/("""">
    </script>

    <!-- Main JS-->
    <script src=""""),_display_(/*85.19*/routes/*85.25*/.Assets.versioned("template/js/main.js")),format.raw/*85.65*/(""""></script>

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
                  DATE: Fri Nov 30 22:10:57 BRST 2018
                  SOURCE: C:/Users/natha/Documents/play/app/views/forgetpassword.scala.html
                  HASH: 76d011e9a5465ac2091ee3c2776e1536edd01c24
                  MATRIX: 1039->0|1349->284|1363->290|1426->333|1563->443|1578->449|1646->496|1723->546|1738->552|1838->630|1915->680|1930->686|2031->765|2108->815|2123->821|2230->906|2336->985|2351->991|2440->1059|2543->1135|2558->1141|2645->1207|2722->1257|2737->1263|2853->1357|2930->1407|2945->1413|3018->1465|3095->1515|3110->1521|3201->1591|3278->1641|3293->1647|3366->1699|3443->1749|3458->1755|3539->1815|3616->1865|3631->1871|3729->1947|3830->2021|3845->2027|3909->2070|4299->2433|4314->2439|4358->2462|4432->2509|4447->2515|4521->2567|5345->3363|5361->3369|5406->3392|5673->3632|5688->3638|5765->3694|5849->3751|5864->3757|5949->3821|6007->3852|6022->3858|6110->3925|6198->3986|6213->3992|6289->4047|6353->4084|6368->4090|6440->4141|6498->4172|6513->4178|6599->4243|6657->4274|6672->4280|6781->4367|6845->4404|6860->4410|6952->4481|7010->4512|7025->4518|7117->4589|7181->4626|7196->4632|7293->4707|7351->4738|7366->4744|7463->4819|7521->4850|7536->4856|7621->4920|7679->4951|7694->4957|7774->5016|7861->5076|7876->5082|7937->5122
                  LINES: 33->1|41->9|41->9|41->9|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|52->20|52->20|52->20|55->23|55->23|55->23|56->24|56->24|56->24|57->25|57->25|57->25|58->26|58->26|58->26|59->27|59->27|59->27|60->28|60->28|60->28|61->29|61->29|61->29|64->32|64->32|64->32|75->43|75->43|75->43|76->44|76->44|76->44|86->54|86->54|86->54|96->64|96->64|96->64|98->66|98->66|98->66|99->67|99->67|99->67|101->69|101->69|101->69|103->71|103->71|103->71|104->72|104->72|104->72|105->73|105->73|105->73|107->75|107->75|107->75|108->76|108->76|108->76|110->78|110->78|110->78|111->79|111->79|111->79|112->80|112->80|112->80|113->81|113->81|113->81|117->85|117->85|117->85
                  -- GENERATED --
              */
          