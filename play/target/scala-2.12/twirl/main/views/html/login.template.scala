
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
                                <img src=""""),_display_(/*44.44*/routes/*44.50*/.Assets.versioned("images/logo_dashboard-05-05.png")),format.raw/*44.102*/("""" alt="ConnectEad">
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
                  DATE: Fri Nov 30 13:19:58 BRST 2018
                  SOURCE: C:/Users/natha/Documents/play/app/views/login.scala.html
                  HASH: 8e22b479e912b84b5248e14382aaa619e502f222
                  MATRIX: 1030->0|1332->276|1346->282|1409->325|1531->420|1546->426|1614->473|1690->522|1705->528|1805->606|1881->655|1896->661|1997->740|2073->789|2088->795|2195->880|2298->956|2313->962|2402->1030|2502->1103|2517->1109|2604->1175|2680->1224|2695->1230|2811->1324|2887->1373|2902->1379|2975->1431|3051->1480|3066->1486|3157->1556|3233->1605|3248->1611|3321->1663|3397->1712|3412->1718|3493->1778|3569->1827|3584->1833|3682->1909|3780->1980|3795->1986|3859->2029|4238->2381|4253->2387|4297->2410|4370->2456|4385->2462|4459->2514|5984->4011|6000->4017|6049->4044|6306->4274|6321->4280|6398->4336|6480->4391|6495->4397|6580->4461|6637->4491|6652->4497|6740->4564|6826->4623|6841->4629|6917->4684|6979->4719|6994->4725|7066->4776|7123->4806|7138->4812|7224->4877|7281->4907|7296->4913|7405->5000|7467->5035|7482->5041|7574->5112|7631->5142|7646->5148|7738->5219|7800->5254|7815->5260|7912->5335|7969->5365|7984->5371|8081->5446|8138->5476|8153->5482|8238->5546|8295->5576|8310->5582|8390->5641|8473->5697|8488->5703|8549->5743
                  LINES: 33->1|41->9|41->9|41->9|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|52->20|52->20|52->20|55->23|55->23|55->23|56->24|56->24|56->24|57->25|57->25|57->25|58->26|58->26|58->26|59->27|59->27|59->27|60->28|60->28|60->28|61->29|61->29|61->29|64->32|64->32|64->32|75->43|75->43|75->43|76->44|76->44|76->44|98->66|98->66|98->66|108->76|108->76|108->76|110->78|110->78|110->78|111->79|111->79|111->79|113->81|113->81|113->81|115->83|115->83|115->83|116->84|116->84|116->84|117->85|117->85|117->85|119->87|119->87|119->87|120->88|120->88|120->88|122->90|122->90|122->90|123->91|123->91|123->91|124->92|124->92|124->92|125->93|125->93|125->93|129->97|129->97|129->97
                  -- GENERATED --
              */
          