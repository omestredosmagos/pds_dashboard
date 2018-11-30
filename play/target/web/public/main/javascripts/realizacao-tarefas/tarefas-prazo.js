
Highcharts.chart('tarefas_prazo_container', {
    chart: {
      type: 'areaspline'
    },
    title: {
      text: ''
    },
    legend: {
      layout: 'vertical',
      align: 'left',
      verticalAlign: 'top',
      x: 150,
      y: 100,
      floating: true,
      borderWidth: 1,
      backgroundColor: (Highcharts.theme && Highcharts.theme.legendBackgroundColor) || '#FFFFFF'
    },
    xAxis: {
      categories: [
        'Jan',
        'Fev',
        'Abril',
        'Março',
        'Maio',
        'Junho',
        'Julho',
        'Agosto',
        'Setembro',
        'Outubro',
        'Novembro'
      ],
      plotBands: [{ // visualize the weekend
        from: 4.5,
        to: 6.5,
        color: 'rgba(68, 170, 213, .2)'
      }]
    },
    yAxis: {
      title: {
        text: 'Realização de atividades'
      }
    },
    tooltip: {
      shared: true,
      valueSuffix: ' nª de logins'
    },
    credits: {
      enabled: false
    },
    plotOptions: {
      areaspline: {
        fillOpacity: 0.5
      }
    },
    series: [{
      name: 'Entregas feitas no prazo',
      data: [5, 10, 15, 5, 4, 10, 12,25,32, 33, 36],
    }, {
      name: 'Entregas atrasadas',
      data: [5, 8, 7, 15, 18, 14, 25, 4,5, 8, 9]
    }, {
      name: 'Entregas feitas fora do prazo',
      data: [14, 5, 4, 3, 3, 5, 40, 8,15, 17, 15]
    }]
  });