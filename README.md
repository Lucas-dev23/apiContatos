# API de Contatos

A **API de Contatos** é uma aplicação em Spring Boot que disponibiliza funcionalidades para criar novos contatos e consultar os contatos cadastrados. Além disso, ela integra um serviço de mensageria utilizando RabbitMQ para processamento assíncrono e oferece a capacidade de envio de emails. Esta aplicação é suportada por um banco de dados MongoDB (NoSQL), proporcionando uma solução completa para gerenciamento de contatos.

## Pré-requisitos

Antes de iniciar, certifique-se de ter os seguintes requisitos instalados:

- Java JDK 17
- Maven
- Spring Boot
- MongoDB
- Certifique-se também de ter o Lombok configurado corretamente na sua IDE.

### Configuração do Lombok na IDE

Certifique-se de que o Lombok esteja configurado corretamente na sua IDE. O Lombok é uma ferramenta de produtividade que reduz a verbosidade do código Java, permitindo a criação de classes Java com menos código boilerplate.

Para configurar o Lombok na sua IDE:

1. Faça o download do Lombok JAR a partir do [site oficial do Lombok](https://projectlombok.org/download).
2. Execute o JAR baixado (`lombok.jar`), selecionando a IDE que você está utilizando.
3. Siga as instruções fornecidas para completar a instalação e configuração do Lombok na sua IDE.

## Configuração do Banco de Dados

**Criação do Banco de Dados:** Crie um banco de dados no MongoDB para ser utilizado pelo projeto. Você pode nomeá-lo como preferir, mas recomenda-se utilizar um nome significativo, como `bdcontatos`.

**Gerando a Tabela no Banco de Dados:** Esta aplicação irá gerar as tabelas necessárias no banco de dados automaticamente assim que você rodar o projeto graças ao Hibernate.

## Application Properties

No `application.properties` você encontrará as configurações: do banco de dados, do Serviço de mensageria RabbitMQ, e do email que está sendo utilizado para envio. Fique à vontade para configurar da forma que preferir.

## Teste e Documentação da API

Esta API utiliza o Swagger para facilitar o teste e a documentação dos endpoints. Com o Swagger, você pode:

- **Documentação Automática:** Todos os endpoints da API estão documentados automaticamente usando a especificação OpenAPI (anteriormente conhecida como Swagger Specification).
  
- **Interface Interativa (Swagger UI):** Explore e teste os endpoints da API diretamente no seu navegador usando a interface interativa gerada pelo Swagger UI.
  
- **Teste de Funcionalidades:** Além da documentação, você pode testar todas as funcionalidades da API de forma interativa e fácil de usar.

Para acessar a documentação e o Swagger UI, inicie a aplicação e navegue até o seguinte endpoint no seu navegador: [http://localhost:8086/swagger-ui/index.html](http://localhost:8086/swagger-ui/index.html).
