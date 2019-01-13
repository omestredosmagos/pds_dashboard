# pds_dashboard
Repositório do trabalho da disciplina de Projeto de Desenvolvimento de Software 2018.2 da UFRPE

# ConnectEad

ConnectEad é um sistema online Java de visualização de dados estudantis, utilizando o Play! Framework.

## Instalando o Play! 2.1.x

Para instalar o [Play](https://www.playframework.com/documentation/2.1.x/JavaHome#play-for-java-developers), é preciso baixar o binary package e setar a pasta no path do sistema operacional.
Salve o [pacote](https://drive.google.com/open?id=1l0WZdgj9wQ1ObZE9Ng7tVh7U6ta39ZJK) e adicione o local salvo no path. É recomendado utilizar o Java Development Kit  7 ao utilizar o Play! 2.1.x 


## Configurações

Antes de começar a usar aplicação, primeiro é preciso configurar o banco de dados e as dependências. No arquivo application.conf, podemos configurar o banco de dados. 

1. Acessar o projeto e ir na pasta > conf/application.conf
2. Abrir o application.conf em algum editor e configurar o banco de dados, hibernate etc
3. Mais detalhes [aqui](https://www.playframework.com/documentation/2.1.x/JavaDatabase)


```python
# Database configuration
# ~~~~~ 
# You can declare as many datasources as you want.
# By convention, the default datasource is named `default`
#
MQSQL
 db.default.driver=com.mysql.jdbc.Driver
 db.default.url="jdbc:mysql://127.0.0.1:3306/meu_banco_de_dados"
 db.default.user=root
 db.default.password=""


H2
db.default.driver=org.h2.Driver
db.default.url="jdbc:h2:mem:play"


Múltiplos Banco de dados
# Orders database
db.orders.driver=org.h2.Driver
db.orders.url="jdbc:h2:mem:orders"

# Customers database
db.customers.driver=org.h2.Driver
db.customers.url="jdbc:h2:mem:customers"
```
4. Já as dependências são feitas no arquivo Build.scala, encontrado em: project/Build.scala. O play! utiliza com buil tool o [sbt](https://www.scala-sbt.org/0.13/docs/index.html)

```sbt
val appDependencies = Seq(
     // Add your project dependencies here,
     ...
     "mysql" % "mysql-connector-java" % "5.1.18"
     ...
)
```

## Executando a aplicação

Para começar o Play!, basta usar o console e navegar até a pasta onde está o projeto, depois utilizar o comando play:

 ```sbt
C:\...\App> play
```

Depois disso, será possível utilizar os comandos do Play! e o curso será modificado. Você pode utilizar o comando play help e ver os outros comandos

```sbt
[App] $ play help
```
## IDE
O Play! funciona em várias IDEs. Para utilizar no eclipse, basta invocar o comando: eclipse. Caso queira usar outra IDE, basta verificar a documentação [aqui](https://www.playframework.com/documentation/2.1.x/IDE)

```sbt
[App] $ eclipse
```
## Start

Para começar a utilizar a aplicação, basta usar o comando run
```sbt
[App] $ play run
```

Vai ser possível ver a aplicação rodando no localhost:9000. O Play! já vem com um servidor local próprio
## License
[MIT](https://choosealicense.com/licenses/mit/)
