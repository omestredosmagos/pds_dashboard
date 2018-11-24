
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

object dashboard2 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*1.2*/title/*1.7*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*1.11*/("""
    """),format.raw/*2.5*/("""Dashboard
""")))};def /*5.2*/content/*5.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.13*/("""
    """),format.raw/*6.5*/("""<div class="main-content">
        <div class="section__content section__content--p30">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-12">
                        <div class="overview-wrap">
                            <h2 class="title-1">Visão Geral</h2>
                            <button class="au-btn au-btn-icon au-btn--blue">
                                <i class="zmdi zmdi-plus"></i>Adicionar Gráfico</button>
                        </div>
                    </div>
                </div>
                <div class="row m-t-25">
                    <div class="col-sm-6 col-lg-3">
                        <div class="overview-item overview-item--c1">
                            <div class="overview__inner">
                                <div class="overview-box clearfix">
                                    <div class="icon">
                                        <i class="zmdi zmdi-trending-up"></i>
                                    </div>
                                    <div class="text">
                                        <h2>60%</h2>
                                        <span>Desempenho Satistatório</span>
                                    </div>
                                </div>
                                <div class="overview-chart">
                                    <canvas id="widgetChart2"></canvas>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-lg-3">
                        <div class="overview-item overview-item--c2">
                            <div class="overview__inner">
                                <div class="overview-box clearfix">
                                    <div class="icon">
                                        <i class="zmdi zmdi-trending-down"></i>
                                    </div>
                                    <div class="text">
                                        <h2>40%</h2>
                                        <span>Desempenho Insatisfatório</span>
                                    </div>
                                </div>
                                <div class="overview-chart">
                                    <canvas id="widgetChart2.1"></canvas>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="au-card">
                            <h3 class="title-2">Filtro</h3>
                            <div class="dropdown-filtro">
                                <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                  Curso
                                </button>
                                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                                  <a class="dropdown-item" href="#" value="1">Administração</a>
                                  <a class="dropdown-item" href="#" value="2">Biologia</a>
                                  <a class="dropdown-item" href="#" value="3">Letras</a>
                                  <a class="dropdown-item" href="#" value="4">Pedagogia</a>
                                </div>
                              </div>
                              <div class="dropdown-filtro">
                                <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                  Período
                                </button>
                                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                                  <a class="dropdown-item" href="#" value="1">2017.1</a>
                                  <a class="dropdown-item" href="#" value="2">2017.2</a>
                                  <a class="dropdown-item" href="#" value="3">2018.1</a>
                                  <a class="dropdown-item" href="#" value="4">2018.2</a>
                                </div>
                              </div>
                              <div class="dropdown-filtro">
                                <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                  Disciplina
                                </button>
                                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                                  <a class="dropdown-item" href="#" value="1">Disciplina 1</a>
                                  <a class="dropdown-item" href="#" value="2">Disciplina 2</a>
                                  <a class="dropdown-item" href="#" value="3">Disciplina 3</a>
                                  <a class="dropdown-item" href="#" value="4">Disciplina 4</a>
                                </div>
                              </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-6">
                        <div class="au-card recent-report">
                            <div class="au-card-inner">
                                <h3 class="title-2">Notas</h3>
                                <div class="chart-info">
                                    <div class="chart-info__left">
                                        <div class="chart-note">
                                            <span class="dot dot--green"></span>
                                            <span>Satistatório</span>
                                        </div>
                                        <div class="chart-note mr-0">
                                            <span class="dot dot--red"></span>
                                            <span>Insatisfatório</span>
                                        </div>
                                    </div>
                                    <div class="chart-info__right">
                                        <div class="chart-statis">
                                            <span class="index incre">
                                                <i class="zmdi zmdi-long-arrow-up"></i>25%</span>
                                            <span class="label">Acima da Média</span>
                                        </div>
                                        <div class="chart-statis mr-0">
                                            <span class="index decre">
                                                <i class="zmdi zmdi-long-arrow-down"></i>10%</span>
                                            <span class="label">Abaixo da Média</span>
                                        </div>
                                    </div>
                                </div>
                                <div class="recent-report__chart">
                                    <canvas id="recent-rep-chart"></canvas>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <div class="au-card chart-percent-card">
                            <div class="au-card-inner">
                                <h3 class="title-2 tm-b-5">Acesso por Turno</h3>
                                <div class="row no-gutters">
                                    <div class="col-xl-6">
                                        <div class="chart-note-wrap">
                                            <div class="chart-note mr-0 d-block">
                                                <span class="dot dot--color1"></span>
                                                <span>Manhã</span>
                                            </div>
                                            <div class="chart-note mr-0 d-block">
                                                <span class="dot dot--color2"></span>
                                                <span>Tarde</span>
                                            </div>
                                            <div class="chart-note mr-0 d-block">
                                                <span class="dot dot--color3"></span>
                                                <span>Noite</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-xl-6">
                                        <div class="percent-chart">
                                            <canvas id="percent-chart"></canvas>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-6">
                        <div class="au-card au-card--no-shadow au-card--no-pad m-b-40">
                            <div class="au-card-title">
                                <div class="bg-overlay bg-overlay--blue"></div>
                                <h3>
                                    <i class="zmdi zmdi-account-calendar"></i>23 Novembro, 2018</h3>
                                <button class="au-btn-plus">
                                    <i class="zmdi zmdi-plus"></i>
                                </button>
                            </div>
                            <div class="au-task js-list-load">
                                <div class="au-task__title">
                                    <p>Lista de Tarefas</p>
                                </div>
                                <div class="au-task-list js-scrollbar3">
                                    <div class="au-task__item au-task__item--danger">
                                        <div class="au-task__item-inner">
                                            <h5 class="task">
                                                <a href="#">Meeting about plan for Admin Template 2018</a>
                                            </h5>
                                            <span class="time">10:00 AM</span>
                                        </div>
                                    </div>
                                    <div class="au-task__item au-task__item--warning">
                                        <div class="au-task__item-inner">
                                            <h5 class="task">
                                                <a href="#">Create new task for Dashboard</a>
                                            </h5>
                                            <span class="time">11:00 AM</span>
                                        </div>
                                    </div>
                                    <div class="au-task__item au-task__item--primary">
                                        <div class="au-task__item-inner">
                                            <h5 class="task">
                                                <a href="#">Meeting about plan for Admin Template 2018</a>
                                            </h5>
                                            <span class="time">02:00 PM</span>
                                        </div>
                                    </div>
                                    <div class="au-task__item au-task__item--success">
                                        <div class="au-task__item-inner">
                                            <h5 class="task">
                                                <a href="#">Create new task for Dashboard</a>
                                            </h5>
                                            <span class="time">03:30 PM</span>
                                        </div>
                                    </div>
                                    <div class="au-task__item au-task__item--danger js-load-item">
                                        <div class="au-task__item-inner">
                                            <h5 class="task">
                                                <a href="#">Meeting about plan for Admin Template 2018</a>
                                            </h5>
                                            <span class="time">10:00 AM</span>
                                        </div>
                                    </div>
                                    <div class="au-task__item au-task__item--warning js-load-item">
                                        <div class="au-task__item-inner">
                                            <h5 class="task">
                                                <a href="#">Create new task for Dashboard</a>
                                            </h5>
                                            <span class="time">11:00 AM</span>
                                        </div>
                                    </div>
                                </div>
                                <div class="au-task__footer">
                                    <button class="au-btn au-btn-load js-load-btn">Mostrar Mais</button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <div class="au-card au-card--no-shadow au-card--no-pad m-b-40">
                            <div class="au-card-title">
                                <div class="bg-overlay bg-overlay--blue"></div>
                                <h3>
                                    <i class="zmdi zmdi-comment-text"></i>Mensagens</h3>
                                <button class="au-btn-plus">
                                    <i class="zmdi zmdi-plus"></i>
                                </button>
                            </div>
                            <div class="au-inbox-wrap js-inbox-wrap">
                                <div class="au-message js-list-load">
                                    <div class="au-message__noti">
                                        <p>Você tem
                                            <span>2</span>

                                            novas mensagens
                                        </p>
                                    </div>
                                    <div class="au-message-list">
                                        <div class="au-message__item unread">
                                            <div class="au-message__item-inner">
                                                <div class="au-message__item-text">
                                                    <div class="avatar-wrap">
                                                        <div class="avatar">
                                                            <img src=""""),_display_(/*256.72*/routes/*256.78*/.Assets.versioned("template/images/icon/avatar-02.jpg")),format.raw/*256.133*/("""" alt="John Smith">
                                                        </div>
                                                    </div>
                                                    <div class="text">
                                                        <h5 class="name">John Smith</h5>
                                                        <p>Have sent a photo</p>
                                                    </div>
                                                </div>
                                                <div class="au-message__item-time">
                                                    <span>12 Min ago</span>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="au-message__item unread">
                                            <div class="au-message__item-inner">
                                                <div class="au-message__item-text">
                                                    <div class="avatar-wrap online">
                                                        <div class="avatar">
                                                            <img src=""""),_display_(/*274.72*/routes/*274.78*/.Assets.versioned("template/images/icon/avatar-03.jpg")),format.raw/*274.133*/("""" alt="Nicholas Martinez">
                                                        </div>
                                                    </div>
                                                    <div class="text">
                                                        <h5 class="name">Nicholas Martinez</h5>
                                                        <p>You are now connected on message</p>
                                                    </div>
                                                </div>
                                                <div class="au-message__item-time">
                                                    <span>11:00 PM</span>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="au-message__item">
                                            <div class="au-message__item-inner">
                                                <div class="au-message__item-text">
                                                    <div class="avatar-wrap online">
                                                        <div class="avatar">
                                                            <img src=""""),_display_(/*292.72*/routes/*292.78*/.Assets.versioned("template/images/icon/avatar-04.jpg")),format.raw/*292.133*/("""" alt="Michelle Sims">
                                                        </div>
                                                    </div>
                                                    <div class="text">
                                                        <h5 class="name">Michelle Sims</h5>
                                                        <p>Lorem ipsum dolor sit amet</p>
                                                    </div>
                                                </div>
                                                <div class="au-message__item-time">
                                                    <span>Yesterday</span>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="au-message__item">
                                            <div class="au-message__item-inner">
                                                <div class="au-message__item-text">
                                                    <div class="avatar-wrap">
                                                        <div class="avatar">
                                                            <img src=""""),_display_(/*310.72*/routes/*310.78*/.Assets.versioned("template/images/icon/avatar-05.jpg")),format.raw/*310.133*/("""" alt="Michelle Sims">
                                                        </div>
                                                    </div>
                                                    <div class="text">
                                                        <h5 class="name">Michelle Sims</h5>
                                                        <p>Purus feugiat finibus</p>
                                                    </div>
                                                </div>
                                                <div class="au-message__item-time">
                                                    <span>Sunday</span>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="au-message__item js-load-item">
                                            <div class="au-message__item-inner">
                                                <div class="au-message__item-text">
                                                    <div class="avatar-wrap online">
                                                        <div class="avatar">
                                                            <img src=""""),_display_(/*328.72*/routes/*328.78*/.Assets.versioned("template/images/icon/avatar-04.jpg")),format.raw/*328.133*/("""" alt="Michelle Sims">
                                                        </div>
                                                    </div>
                                                    <div class="text">
                                                        <h5 class="name">Michelle Sims</h5>
                                                        <p>Lorem ipsum dolor sit amet</p>
                                                    </div>
                                                </div>
                                                <div class="au-message__item-time">
                                                    <span>Yesterday</span>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="au-message__item js-load-item">
                                            <div class="au-message__item-inner">
                                                <div class="au-message__item-text">
                                                    <div class="avatar-wrap">
                                                        <div class="avatar">
                                                            <img src=""""),_display_(/*346.72*/routes/*346.78*/.Assets.versioned("template/images/icon/avatar-05.jpg")),format.raw/*346.133*/("""" alt="Michelle Sims">
                                                        </div>
                                                    </div>
                                                    <div class="text">
                                                        <h5 class="name">Michelle Sims</h5>
                                                        <p>Purus feugiat finibus</p>
                                                    </div>
                                                </div>
                                                <div class="au-message__item-time">
                                                    <span>Sunday</span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="au-message__footer">
                                        <button class="au-btn au-btn-load js-load-btn">Mostrar Mais</button>
                                    </div>
                                </div>
                                <div class="au-chat">
                                    <div class="au-chat__title">
                                        <div class="au-chat-info">
                                            <div class="avatar-wrap online">
                                                <div class="avatar avatar--small">
                                                    <img src=""""),_display_(/*369.64*/routes/*369.70*/.Assets.versioned("template/images/icon/avatar-02.jpg")),format.raw/*369.125*/("""" alt="John Smith">
                                                </div>
                                            </div>
                                            <span class="nick">
                                                <a href="#">John Smith</a>
                                            </span>
                                        </div>
                                    </div>
                                    <div class="au-chat__content">
                                        <div class="recei-mess-wrap">
                                            <span class="mess-time">12 Min ago</span>
                                            <div class="recei-mess__inner">
                                                <div class="avatar avatar--tiny">
                                                    <img src=""""),_display_(/*382.64*/routes/*382.70*/.Assets.versioned("template/images/icon/avatar-02.jpg")),format.raw/*382.125*/("""" alt="John Smith">
                                                </div>
                                                <div class="recei-mess-list">
                                                    <div class="recei-mess">Lorem ipsum dolor sit amet, consectetur adipiscing elit non iaculis</div>
                                                    <div class="recei-mess">Donec tempor, sapien ac viverra</div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="send-mess-wrap">
                                            <span class="mess-time">30 Sec ago</span>
                                            <div class="send-mess__inner">
                                                <div class="send-mess-list">
                                                    <div class="send-mess">Lorem ipsum dolor sit amet, consectetur adipiscing elit non iaculis</div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="au-chat-textfield">
                                        <form class="au-form-icon">
                                            <input class="au-input au-input--full au-input--h65" type="text" placeholder="Type a message">
                                            <button class="au-input-icon">
                                                <i class="zmdi zmdi-camera"></i>
                                            </button>
                                        </form>
                                    </div>
                                </div>
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
""")))};
Seq[Any](format.raw/*3.2*/("""

"""),format.raw/*422.2*/("""
"""),_display_(/*423.2*/dashboard(title)/*423.18*/(content)))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Nov 24 15:02:24 BRST 2018
                  SOURCE: C:/Users/natha/Documents/play/app/views/dashboard2.scala.html
                  HASH: 1a3b0926eede0b01ed8b9f19f49a8eecfb6f1fa6
                  MATRIX: 1019->1|1031->6|1111->10|1143->16|1177->33|1191->40|1271->44|1303->50|17075->15794|17091->15800|17169->15855|18501->17159|18517->17165|18595->17220|19947->18544|19963->18550|20041->18605|21373->19909|21389->19915|21467->19970|22811->21286|22827->21292|22905->21347|24250->22664|24266->22670|24344->22725|25923->24276|25939->24282|26017->24337|26909->25201|26925->25207|27003->25262|29425->28|29457->27646|29487->27649|29513->27665
                  LINES: 32->1|32->1|34->1|35->2|36->5|36->5|38->5|39->6|289->256|289->256|289->256|307->274|307->274|307->274|325->292|325->292|325->292|343->310|343->310|343->310|361->328|361->328|361->328|379->346|379->346|379->346|402->369|402->369|402->369|415->382|415->382|415->382|456->3|458->422|459->423|459->423
                  -- GENERATED --
              */
          