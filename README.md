# BridgeChallenge

# Diretrizes
Clonar o repositório para alguma pasta de sua preferência, através do comando 'git clone https://github.com/ThiagoMiklan/BridgeChallenge.git' 
##  Lado servidor
Após clonar o repositório, abra um prompt de comando no diretório backend
Para executar o lado servidor da aplicação:
- mvn spring-boot:run
Para executar os testes do fatorial:
- mvn test
## Lado cliente
Após clonar o repositório, abra um prompt de comando no diretório frontend
1º instale os pacotes através de npm instale
2º npm start  Para executar o front
O start do front utiliza webpack-dev-server para ficar reiniciando conforme alteração no código.
# Linguagens 
As linguanges utilizadas ao todo foram JavaScript, HTML, CSS e Java
# Tecnologias usadas
## Spring Boot
Pelo que pesquisei para resolver o desafio é uma tecnologia que ajuda na configuração dos projetos,diminuindo o tempo
gasto em controlar pacotes, jars,bibliotecas e etc. Como eu nunca havia mexido, precisei pesquisar em artigos online 
o básico sobre seu uso. No presente desafio, utilizo ele para construir um servidor Rest, para que eu possa integrar
com meu frontend construído em Node

## Node JS
Interpretador que permite utilizar JavaScript no lado servidor, com ele é possível criar uma aplicação web fullstack com JavaScript.
## React
Biblioteca JavaScript baseada em componentes que auxilia na construção de interfaces gráficas onde cada componente React é uma parte
isolada da interface gráfica e pode possuir seu estado próprio. Alguns pontos essenciais do React são as props e state, onde as props 
é a forma como um componente "conversa" com seu pai (permite também que o componente se isole e possa ter "muitos pais", e o state que
possibilita o dinamismo do React, as alterações, re-render e etc.
## Bulma
Framework CSS que permite uma fácil estilização, pois oferece um arquivo CSS com diversos seletores possíveis para uma interface web. O
Bulma também é um framework flexbox, ou seja, apresenta responsividade caso se use suas cláusulas corretas (Columns e Column permitem 
a aplicação do FlexBox nas interfaces).
## Webpack
Module Bundler usado, a nível bem básico no desafio.
## Assemble-React-Bulma
Utilizei para construir a interface gráfica a minha biblioteca, que criei para o TCC. Ela predefine uma série de componentes inspirados
no Bulma que podem ser utilizados para montar interfaces dos mais diversos tipos, para isso utiliza de componentes gráficos simples e complexos disponibilizados via NPM.
## JUnit
A biblioteca usada para criar os testes (os testes encontram-se em backend -> src -> tests -> FatorialTests.java). Utilizei pela primeira vez para fazer o trabalho, assim como o Spring Boot.
## Docker
Não consegui utilizar o Docker por uma limitação de equipamento. Eu nunca utilizei profissionalmente a tecnologia, mas já tentei utilizá-la diversas vezes no meu notebook e por ele ser muito ruim e velho, acabam ocorrendo problemas de memória RAM e nunca consigo utilizar o Docker decentemente.
## Maven
Usei uma vez com Java Desktop de uma maneira bem básica, sei que ele é uma espécie de package.json do Node, só que para Java, onde no pom.xml você informa uma lib presente no repositório maven ou no repositório local e então o maven automaticamente checa suas dependências e importa se necessário.
# Sobre a implementação
Optei pelo Spring Boot por usar Java e por ser aparentemente o meio mais tranquilo de integrar com o front end. Descobri como implementar um servidor Rest e então parti para o frond-end.

No Front-end utilizei primeiramente o CRA para acelerar as coisas e ver se tudo ia funcionar, após estabilizado troquei para o webpack como inicializador da aplicação. Optei pelo front-end em Node por ter maior experiência e o uso do React e da minha biblioteca para facilitar a criação e organização da interface e também por gostar bastante da opção reativa fornecida pelo React
Optei também por usar a separação entre front-end e back-end, simulando um cliente-servidor, ao invés de utilizar tudo em um jar apenas.
