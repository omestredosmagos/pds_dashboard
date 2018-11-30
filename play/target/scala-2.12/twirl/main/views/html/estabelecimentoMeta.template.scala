
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

object estabelecimentoMeta extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*1.2*/title/*1.7*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*1.11*/("""
    """),format.raw/*2.5*/("""Estabelecimento de Metas
""")))};def /*5.2*/content/*5.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.13*/("""  
    """),format.raw/*6.5*/("""<div class="main-content">
        <div class="section__content section__content--p30">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-12">
                        <div class="overview-wrap">
                            <h2 class="title-1">Estabelecimento de Metas</h2>
                            <button class="au-btn au-btn-icon au-btn--blue">
                                <i class="zmdi zmdi-plus"></i>Adicionar Gráfico</button>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-12">
                        <div class="au-card visualization1">
                            <div class="au-card-inner">
                                <h3 class="title-2">Entregas de Atividades</h3>
                                <div id="tarefas_prazo_container" style="min-width: 310px; height: 370px; margin: 0 auto"></div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-12">
                        <div class="au-card visualization2">
                            <div class="au-card-inner">
                                <h3 class="title-2">Leituras feitas ao Fórum</h3>
                                <div id="leitura_forum_container" style="min-width: 310px; height: 370px; margin: 0 auto"></div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <div class="copyright">
                            <p>Copyright 2018 Colorlib. All rights reserved. Template by <a href="https://colorlib.com">Colorlib</a>.</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
        
    <script src=""""),_display_(/*49.19*/routes/*49.25*/.Assets.versioned("javascripts/highcharts.js")),format.raw/*49.71*/(""""></script>
    <script src=""""),_display_(/*50.19*/routes/*50.25*/.Assets.versioned("javascripts/modules/exporting.js")),format.raw/*50.78*/(""""></script>
    <script src=""""),_display_(/*51.19*/routes/*51.25*/.Assets.versioned("javascripts/modules/series-label.js")),format.raw/*51.81*/(""""></script>
    <script src=""""),_display_(/*52.19*/routes/*52.25*/.Assets.versioned("javascripts/modules/export-data.js")),format.raw/*52.80*/(""""></script>
    <script src=""""),_display_(/*53.19*/routes/*53.25*/.Assets.versioned("javascripts/realizacao-tarefas/tarefas-prazo.js")),format.raw/*53.93*/(""""></script>
    <script src=""""),_display_(/*54.19*/routes/*54.25*/.Assets.versioned("javascripts/realizacao-tarefas/leitura-forum.js")),format.raw/*54.93*/(""""></script>
""")))};
Seq[Any](format.raw/*3.2*/("""

"""),format.raw/*55.2*/("""
"""),_display_(/*56.2*/dashboard(title)/*56.18*/(content)))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 30 21:26:43 BRST 2018
                  SOURCE: C:/Users/natha/Documents/play/app/views/estabelecimentoMeta.scala.html
                  HASH: 46c2b0c3369942c1cebe2fde8889ae6dcb167889
                  MATRIX: 1028->1|1040->6|1120->10|1152->16|1201->48|1215->55|1295->59|1329->67|3443->2154|3458->2160|3525->2206|3583->2237|3598->2243|3672->2296|3730->2327|3745->2333|3822->2389|3880->2420|3895->2426|3971->2481|4029->2512|4044->2518|4133->2586|4191->2617|4206->2623|4295->2691|4347->43|4378->2705|4407->2708|4432->2724
                  LINES: 32->1|32->1|34->1|35->2|36->5|36->5|38->5|39->6|82->49|82->49|82->49|83->50|83->50|83->50|84->51|84->51|84->51|85->52|85->52|85->52|86->53|86->53|86->53|87->54|87->54|87->54|89->3|91->55|92->56|92->56
                  -- GENERATED --
              */
          