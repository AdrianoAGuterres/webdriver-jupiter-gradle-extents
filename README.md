# webdriver-jupiter-gradle-extents
>Resumo:
>Implementação de Testes Automatizados de Interfaces Gráficas com o uso das tecnologias Java 11, Selenium Webdriver, Gradle, Junit 5 e Extents Report;

#### Página testada:
> http://www.automationpractice.com/

#### Pré requisitos:
| requisito | página de download |
| ------    | ------ |
| Java 8    | https://www.oracle.com/br/java/technologies/javase-jdk8-downloads.html |
| Gradle    | https://gradle.org/install/ |
```sh
Ps: é necessário tanto a instalação quanto a configuração das variáveis de ambiente tanto do Java, a quanto do Gradle.
```

### Dependências:
| Tecnologia usada | página oficial |
| ------ | ------ |
| JUnit Jupiter | https://junit.org/junit5/ |
| Selenium Webdriver | https://www.selenium.dev/ |
| WebDriverManager | https://github.com/bonigarcia/webdrivermanager/ |
| ExtentReports | https://www.extentreports.com/ |
| JFairy | https://devskiller.github.io/jfairy/ |

#### Arquitetura usada:
O projeto usa a arquitetura AppObject e esta organizada da seguinte maneira:

![alt text](https://user-images.githubusercontent.com/80764831/112851148-14424380-9081-11eb-8083-b3cfe9282957.png)

#### configurations.properties:
Esse arquivo define as principais configurações do projeto:
| Nome da constante | valor padrão | página oficial |
| ----------------  | ------------ | -------------- |
| DEFAULT_TIMEOUT   | 15           | Define um timeout padrão para a busca dos elementos na página em segundos|
| DEFAULT_PAGE_LOAD | 15           | Define um timeout padrão para o carregamento das páginas em segundos|
| DEFAULT_WAIT      | 15           | Define um tempo de espera padrão em segundos|
| DEFAULT_URL       | http://automationpractice.com/index.php| Define a url principal da pagina a ser testada|
| HEADLESS_TYPE     | false        | Define se o navegador irá rodar no modo headless |
| DEFAULT_BROWSER   | chrome       | Define o navegador a ser usado |
| REPORT_PATH       | ./reports/   | Define o caminho e a pasta para a geração do report |

#### Como executar o teste:
Atualmente existe apenas o arquivo "ComprarTestCase.java" no pacote "testCases" que se refere ao teste de "comprar" no [site](http://www.automationpractice.com/). O teste de comprar deve conter cenários específicos como "Comprar um item com sucesso", porém para o propósito desse projeto foi implementando apenas o cenário "Escolher um item, adicionar no carrinho, efetuar cadastro e finalizar a compra" no método "adicionarUmItemNoCarrinhoCadastrarUsuarioFinalizarCompraComSucesso" que contem a anotação "@ReapeatedTest(5)" que irá fazer com que esse teste rode 5 vezes. Tal artifício foi usado para poder gerar facilmente dois tipos de reports sem a necessidade de implementação de outros cenários. Um report com estrutura de suíte que agrupará todos os resultados das execuções do cenário em um único arquivo HTML ou a estrutura de reports individuais onde que, para cada execução do teste irá ser gerado um arquivo HTML com o resultado da mesma, assim podendo simular ambos os tipos de estrutura de report de maneira fácil bastando comentar a anotação "@BeforeAll".
Escolhido a estrutura de report a ser gerada, o padrão atual é a de suíte, o teste pode ser rodado através da task "Test" do Gradle ou diretamente como um arquivo JUnit.
O resultado da execução irá ser armazenado na pasta reports.




