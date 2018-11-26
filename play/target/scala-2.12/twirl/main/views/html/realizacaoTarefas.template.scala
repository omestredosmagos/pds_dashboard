
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

object realizacaoTarefas extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*1.2*/title/*1.7*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*1.11*/("""
    """),format.raw/*2.5*/("""Realização de Tarefas
""")))};def /*5.2*/content/*5.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.13*/("""
    
        
    """),format.raw/*8.5*/("""<div class="main-content">
        <div class="section__content section__content--p30">
            <div class="container-fluid">
                <div class="row m-t-25">
                    <div class="col-md-12">
                        <div class="overview-wrap">
                            <h2 class="title-1">Realização de Tarefas</h2>
                            <button class="au-btn au-btn-icon au-btn--blue">
                                <i class="zmdi zmdi-plus"></i>Adicionar Gráfico</button>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-12">
                        <div class="au-card">
                            <div class="au-card-inner">
                                <h3 class="title-2">Atividades Entregues</h3>
                                """),format.raw/*25.127*/("""
                            """),format.raw/*26.29*/("""</div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                            Teste
                    </div>
                </div>
            
                <div class="row">
                    <div class="col-lg-12">
                            <div id="container" style="min-width: 310px; height: 400px; margin: 0 auto"></div>
                    </div>
                </div>
            </div>

        </div>
    </div>

    <script src=""""),_display_(/*49.19*/routes/*49.25*/.Assets.versioned("javascripts/highcharts.js")),format.raw/*49.71*/(""""></script>
    <script src=""""),_display_(/*50.19*/routes/*50.25*/.Assets.versioned("javascripts/modules/exporting.js")),format.raw/*50.78*/(""""></script>
    <script src=""""),_display_(/*51.19*/routes/*51.25*/.Assets.versioned("javascripts/modules/series-label.js")),format.raw/*51.81*/(""""></script>
    <script src=""""),_display_(/*52.19*/routes/*52.25*/.Assets.versioned("javascripts/modules/exporting.js")),format.raw/*52.78*/(""""></script>
    <script src=""""),_display_(/*53.19*/routes/*53.25*/.Assets.versioned("javascripts/modules/export-data.js")),format.raw/*53.80*/(""""></script>

    <script type="text/javascript"> 

        Highcharts.chart('container', """),format.raw/*57.39*/("""{"""),format.raw/*57.40*/("""
            """),format.raw/*58.13*/("""chart: """),format.raw/*58.20*/("""{"""),format.raw/*58.21*/("""
                """),format.raw/*59.17*/("""type: 'spline'
            """),format.raw/*60.13*/("""}"""),format.raw/*60.14*/(""",
            title: """),format.raw/*61.20*/("""{"""),format.raw/*61.21*/("""
                """),format.raw/*62.17*/("""text: 'Monthly Average Temperature'
            """),format.raw/*63.13*/("""}"""),format.raw/*63.14*/(""",
            subtitle: """),format.raw/*64.23*/("""{"""),format.raw/*64.24*/("""
                """),format.raw/*65.17*/("""text: 'Source: WorldClimate.com'
            """),format.raw/*66.13*/("""}"""),format.raw/*66.14*/(""",
            xAxis: """),format.raw/*67.20*/("""{"""),format.raw/*67.21*/("""
                """),format.raw/*68.17*/("""categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun',
                    'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
            """),format.raw/*70.13*/("""}"""),format.raw/*70.14*/(""",
            yAxis: """),format.raw/*71.20*/("""{"""),format.raw/*71.21*/("""
                """),format.raw/*72.17*/("""title: """),format.raw/*72.24*/("""{"""),format.raw/*72.25*/("""
                    """),format.raw/*73.21*/("""text: 'Temperature'
                """),format.raw/*74.17*/("""}"""),format.raw/*74.18*/(""",
                labels: """),format.raw/*75.25*/("""{"""),format.raw/*75.26*/("""
                    """),format.raw/*76.21*/("""formatter: function () """),format.raw/*76.44*/("""{"""),format.raw/*76.45*/("""
                        """),format.raw/*77.25*/("""return this.value + '°';
                    """),format.raw/*78.21*/("""}"""),format.raw/*78.22*/("""
                """),format.raw/*79.17*/("""}"""),format.raw/*79.18*/("""
            """),format.raw/*80.13*/("""}"""),format.raw/*80.14*/(""",
            tooltip: """),format.raw/*81.22*/("""{"""),format.raw/*81.23*/("""
                """),format.raw/*82.17*/("""crosshairs: true,
                shared: true
            """),format.raw/*84.13*/("""}"""),format.raw/*84.14*/(""",
            plotOptions: """),format.raw/*85.26*/("""{"""),format.raw/*85.27*/("""
                """),format.raw/*86.17*/("""spline: """),format.raw/*86.25*/("""{"""),format.raw/*86.26*/("""
                    """),format.raw/*87.21*/("""marker: """),format.raw/*87.29*/("""{"""),format.raw/*87.30*/("""
                        """),format.raw/*88.25*/("""radius: 4,
                        lineColor: '#666666',
                        lineWidth: 1
                    """),format.raw/*91.21*/("""}"""),format.raw/*91.22*/("""
                """),format.raw/*92.17*/("""}"""),format.raw/*92.18*/("""
            """),format.raw/*93.13*/("""}"""),format.raw/*93.14*/(""",
            series: ["""),format.raw/*94.22*/("""{"""),format.raw/*94.23*/("""
                """),format.raw/*95.17*/("""name: 'Tokyo',
                marker: """),format.raw/*96.25*/("""{"""),format.raw/*96.26*/("""
                    """),format.raw/*97.21*/("""symbol: 'square'
                """),format.raw/*98.17*/("""}"""),format.raw/*98.18*/(""",
                data: [7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, """),format.raw/*99.63*/("""{"""),format.raw/*99.64*/("""
                    """),format.raw/*100.21*/("""y: 26.5,
                    marker: """),format.raw/*101.29*/("""{"""),format.raw/*101.30*/("""
                        """),format.raw/*102.25*/("""symbol: 'url(https://www.highcharts.com/samples/graphics/sun.png)'
                    """),format.raw/*103.21*/("""}"""),format.raw/*103.22*/("""
                """),format.raw/*104.17*/("""}"""),format.raw/*104.18*/(""", 23.3, 18.3, 13.9, 9.6]

            """),format.raw/*106.13*/("""}"""),format.raw/*106.14*/(""", """),format.raw/*106.16*/("""{"""),format.raw/*106.17*/("""
                """),format.raw/*107.17*/("""name: 'London',
                marker: """),format.raw/*108.25*/("""{"""),format.raw/*108.26*/("""
                    """),format.raw/*109.21*/("""symbol: 'diamond'
                """),format.raw/*110.17*/("""}"""),format.raw/*110.18*/(""",
                data: ["""),format.raw/*111.24*/("""{"""),format.raw/*111.25*/("""
                    """),format.raw/*112.21*/("""y: 3.9,
                    marker: """),format.raw/*113.29*/("""{"""),format.raw/*113.30*/("""
                        """),format.raw/*114.25*/("""symbol: 'url(https://www.highcharts.com/samples/graphics/snow.png)'
                    """),format.raw/*115.21*/("""}"""),format.raw/*115.22*/("""
                """),format.raw/*116.17*/("""}"""),format.raw/*116.18*/(""", 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8]
            """),format.raw/*117.13*/("""}"""),format.raw/*117.14*/("""]
        """),format.raw/*118.9*/("""}"""),format.raw/*118.10*/(""");

    </script>

    """),format.raw/*122.83*/("""
""")))};
Seq[Any](format.raw/*3.2*/("""

"""),format.raw/*123.2*/("""
"""),_display_(/*124.2*/dashboard(title)/*124.18*/(content)))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Nov 26 21:06:18 BRST 2018
                  SOURCE: C:/Users/natha/Documents/play/app/views/realizacaoTarefas.scala.html
                  HASH: 3d48ccf52a43a6ae796b05e095e24ef79e063476
                  MATRIX: 1026->1|1038->6|1118->10|1150->16|1196->45|1210->52|1290->56|1338->78|2263->1068|2321->1098|2994->1744|3009->1750|3076->1796|3134->1827|3149->1833|3223->1886|3281->1917|3296->1923|3373->1979|3431->2010|3446->2016|3520->2069|3578->2100|3593->2106|3669->2161|3790->2254|3819->2255|3861->2269|3896->2276|3925->2277|3971->2295|4027->2323|4056->2324|4106->2346|4135->2347|4181->2365|4258->2414|4287->2415|4340->2440|4369->2441|4415->2459|4489->2505|4518->2506|4568->2528|4597->2529|4643->2547|4802->2678|4831->2679|4881->2701|4910->2702|4956->2720|4991->2727|5020->2728|5070->2750|5135->2787|5164->2788|5219->2815|5248->2816|5298->2838|5349->2861|5378->2862|5432->2888|5506->2934|5535->2935|5581->2953|5610->2954|5652->2968|5681->2969|5733->2993|5762->2994|5808->3012|5897->3073|5926->3074|5982->3102|6011->3103|6057->3121|6093->3129|6122->3130|6172->3152|6208->3160|6237->3161|6291->3187|6436->3304|6465->3305|6511->3323|6540->3324|6582->3338|6611->3339|6663->3363|6692->3364|6738->3382|6806->3422|6835->3423|6885->3445|6947->3479|6976->3480|7069->3545|7098->3546|7149->3568|7216->3606|7246->3607|7301->3633|7418->3721|7448->3722|7495->3740|7525->3741|7594->3781|7624->3782|7655->3784|7685->3785|7732->3803|7802->3844|7832->3845|7883->3867|7947->3902|7977->3903|8032->3929|8062->3930|8113->3952|8179->3989|8209->3990|8264->4016|8382->4105|8412->4106|8459->4124|8489->4125|8594->4201|8624->4202|8663->4213|8693->4214|8749->4319|8790->40|8822->4322|8852->4325|8878->4341
                  LINES: 32->1|32->1|34->1|35->2|36->5|36->5|38->5|41->8|58->25|59->26|82->49|82->49|82->49|83->50|83->50|83->50|84->51|84->51|84->51|85->52|85->52|85->52|86->53|86->53|86->53|90->57|90->57|91->58|91->58|91->58|92->59|93->60|93->60|94->61|94->61|95->62|96->63|96->63|97->64|97->64|98->65|99->66|99->66|100->67|100->67|101->68|103->70|103->70|104->71|104->71|105->72|105->72|105->72|106->73|107->74|107->74|108->75|108->75|109->76|109->76|109->76|110->77|111->78|111->78|112->79|112->79|113->80|113->80|114->81|114->81|115->82|117->84|117->84|118->85|118->85|119->86|119->86|119->86|120->87|120->87|120->87|121->88|124->91|124->91|125->92|125->92|126->93|126->93|127->94|127->94|128->95|129->96|129->96|130->97|131->98|131->98|132->99|132->99|133->100|134->101|134->101|135->102|136->103|136->103|137->104|137->104|139->106|139->106|139->106|139->106|140->107|141->108|141->108|142->109|143->110|143->110|144->111|144->111|145->112|146->113|146->113|147->114|148->115|148->115|149->116|149->116|150->117|150->117|151->118|151->118|155->122|157->3|159->123|160->124|160->124
                  -- GENERATED --
              */
          