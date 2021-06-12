# Informações do Projeto

## *Para o funcionamento do projeto é necessário primeiro subir o ambiente **[KeyCloak Server e Redis](https://github.com/jeffersoncleyson/env_dev)** e em seguida realizar a configuração do KeyCloak seguindo os passos deste **[LINK](https://medium.com/devops-dudes/securing-spring-boot-rest-apis-with-keycloak-1d760b2004e)***

#
## Introdução
#

Este projeto é uma prova de conceito da utilização do KeyCloak como serviço de autenticação de usuários e o Redis como serviço para realizar o cache de informações.<br>
A utilização de uma API Rest foi para facilitar a prova de conceito e demonstrar os procedimentos de salvar, atualizar, buscar e deletar entidades do banco de dados.


#
## Técnologias utilizadas neste projeto
#

#
### Spring Boot </br></br>

O Spring Boot é um projeto da Spring que veio para facilitar o processo de configuração e publicação de nossas aplicações. A intenção é ter o seu projeto rodando o mais rápido possível e sem complicação. </br>
Ele consegue isso favorecendo a convenção sobre a configuração. Basta que você diga pra ele quais módulos deseja utilizar (WEB, Template, Persistência, Segurança, etc.) que ele vai reconhecer e configurar. </br></br>
Inicializador de projetos spring: *[Spring Initializr](https://start.spring.io/)*

#### **Material para consulta e entendimento:**
* [O que é Spring Boot?](https://blog.algaworks.com/spring-boot/)
* [Spring Boot: simplificando o Spring](https://www.devmedia.com.br/spring-boot-simplificando-o-spring/31979)
* [Criando uma API REST com o Spring Boot](https://www.treinaweb.com.br/blog/criando-uma-api-rest-com-o-spring-boot)

#
### KeyCloak </br></br>

#### O que é Keycloak? </br></br>
Patrocinado pela Red Hat, o [Keycloak é um software open source](https://github.com/keycloak/keycloak) de um servidor JBoss feito para trabalhar em conjunto com sua aplicação em implementações mais comuns de autenticação e autorização. Caso as configurações padrão não te atendam, existem várias configurações e customizações que podem ser feitas para adequar o funcionamento ao seu sistema.


#### O que ele me oferece? </br></br>

São oferecidas pelo Keycloak funcionalidades como:

* Criação de usuário (podendo ser criados pelo administrador do sistema, e habilitado ou não para o próprio usuário se cadastrar);
* Login, “esqueci minha senha”, login com plataformas externas como redes sociais;
* Integração dos usuários com Active Directory;
* Ativação de usuários por confirmação de e-mail;
* Obrigar aceitação de termos de uso antes de logar;
* Customização das páginas que o usuário acessa (como a própria tela de login);
* Serviços para que outras aplicações busquem dados de usuários;
* Criação de permissões que seu sistema vai usar;
* Criação de grupos de usuário;
* i18n (internationalization);
* Entre outras várias configurações e customizações mais avançadas.

#### **Para utilizar o server do KeyCloak em conjunto com esta aplicação consultar o material disponível **[AQUI (Env-DEV)](https://github.com/jeffersoncleyson/env_dev)****.

#### **Material de apoio para consulta e entendimento:**

* [Securing Spring Boot REST APIs with Keycloak](https://medium.com/devops-dudes/securing-spring-boot-rest-apis-with-keycloak-1d760b2004e)
* [Keycloak, not returning access token if update password action selected](https://stackoverflow.com/questions/42524153/keycloak-not-returning-access-token-if-update-password-action-selected)
* [O que é Keycloak?](https://blog.db1group.com/o-que-e-keycloak/)
* [KeyCloak - Open Source Identity and Access Management](https://www.keycloak.org/)

#
### Redis </br></br>

#### O que é o Redis? </br></br>

O Redis é um armazenamento de estrutura de dados de chave-valor de código aberto e na memória. O Redis oferece um conjunto de estruturas versáteis de dados na memória que permite a fácil criação de várias aplicações personalizadas. Os principais casos de uso do Redis incluem cache, gerenciamento de sessões, PUB/SUB e classificações.

#### **Material de apoio e resolução de erros durante o aprendizado para consulta e entendimento:**
* [O que é o Redis?](https://aws.amazon.com/pt/elasticache/what-is-redis/)
* [Spring Data Redis Example 1](https://github.com/michaelcgood/spring-data-redis-example)
* [Spring Data Redis Example 2](https://github.com/Java-Techie-jt/spring-data-redis)
* [Spring Data Redis Example 3](https://github.com/eugenp/tutorials/tree/master/persistence-modules/spring-data-redis)
* [Spring Data Redis CRUD Operations example with Spring Boot](https://grokonez.com/spring-framework/spring-data/spring-data-redis-example-spring-boot-redis-example)
* [Error NoClassDefFoundError GenericObjectPoolConfig](https://www.netsurfingzone.com/java-lang-noclassdeffounderror-org-apache-commons-pool2-impl-genericobjectpoolconfig/)
* [Error DefaultSerializer requires a Serializable payload but received an object](https://www.programmersought.com/article/4497240555/)
* [Error NOAUTH Authentication required](https://www.programmersought.com/article/19371803022/)

#### **Para utilizar o server do Redis em conjunto com esta aplicação consultar o material disponível **[AQUI (Env-DEV)](https://github.com/jeffersoncleyson/env_dev)**** 

#
### Lombok </br></br>

O Lombok é um framework para Java que permite escrever código eliminando a verbosidade, o que permite ganhar tempo de desenvolvimento para o que realmente é importante. Seu uso permite gerar em tempo de compilação os métodos getters e setters, métodos construtores, padrão builder e muito mais.

#### **Material para consulta e entendimento:**
* [Lombok](https://projectlombok.org/)
* [Como usar o Lombok em projetos Java](https://digitalinnovation.one/artigos/como-usar-o-lombok-em-projetos-java)
* [Introduction to Project Lombok](https://www.baeldung.com/intro-to-project-lombok)

#
### OpenAPI </br></br>

A Especificação OpenAPI , originalmente conhecida como Especificação Swagger , é uma especificação para arquivos de interface legíveis por máquina para descrever, produzir, consumir e visualizar serviços da Web RESTful . Originalmente parte da estrutura Swagger , tornou-se um projeto separado em 2016, supervisionado pela OpenAPI Initiative, um projeto de colaboração de código aberto da Linux Foundation. Swagger e algumas outras ferramentas podem gerar código, documentação e casos de teste a partir de um arquivo de interface.

#### **Material para consulta e entendimento:**
* [Usando a OpenAPI para criar APIs inteligentes que ajudam os desenvolvedores](https://www.infoq.com/br/articles/apache-kafka-licoes/)
* [Open APO Initiative](https://www.openapis.org/)
* [Documenting a Spring REST API Using OpenAPI 3.0](https://www.baeldung.com/spring-rest-openapi-documentation)
* [springdoc-openapi v1.5.9](https://springdoc.org/)
* [OpenAPI 3 Documentation With Spring Boot](https://dzone.com/articles/openapi-3-documentation-with-spring-boot)
* [OpenAPI Specification - wikipedia](https://en.wikipedia.org/wiki/OpenAPI_Specification)

#
### Postman </br></br>

Os testes da API podem ser feitos utilizando a documentação especificada no tópico abaixo ou utilizando o software *Postman*. Junto ao projeto foi disponibilizado uma *collection* para ser importado no software e assim poder realizar os testes com os endpoints especificiados.

Para importar seguir os seguintes passos:

0) Fazer o [download](https://www.postman.com/downloads/) e instalar o Postman
1) Abrir o Postman
2) Clicar em *file*
3) Clicar em *import*
4) Arrastar e soltar o arquivo presenta na pasta *"Postman/KeyCloak.postman_collection.json"*
4) Arrastar e soltar o arquivo presenta na pasta *"Postman/Security API.postman_collection.json.json"*

**Para realizar os testes é necessário iniciar a aplicação keyCloak presente no material do tópico do KeyCloak e acessar a coleção do Postman para realizar o POST para salvar o token na variável global do postman. Após realizar os passos anteriores os demais endpoints irão utilizar desta variável global automáticamente**

#
## Documentação da API
#

Para visualizar a documentação da API rodar o código e acessar no navegador o link abaixo:

```
http://localhost:9001/security/v1/swagger-ui.html
```

#
## Bibliotecas utilizadas
#

* Mapear as entidades e Conectar ao banco de dados MongoDB - NoSQL.
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-mongodb</artifactId>
</dependency>
```
* Lombok cria os construtores , getteer e setters de forma automática.

```
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.20</version>
    <scope>provided</scope>
</dependency>
```
* Para montar a API Rest
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

* Para documentar a API Rest
```
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-ui</artifactId>
    <version>1.5.2</version>
</dependency>
```

* Redis Cache

```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-redis</artifactId>
    <version>2.5.1</version>
</dependency>
```

* Dependências do Data Redis
```
<dependency>
    <groupId>redis.clients</groupId>
    <artifactId>jedis</artifactId>
    <version>3.6.0</version>
</dependency>
```
```
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-pool2</artifactId>
    <version>2.10.0</version>
</dependency>
```




#
### Referências utilizadas para produzir este projeto
#

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [O que é MongoDB?](https://www.treinaweb.com.br/blog/o-que-e-mongodb)
* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)
* [Build a CRUD App with Spring Boot and MongoDB](https://www.split.io/blog/crud-spring-boot-mongodb/)
* [Documenting Spring Boot REST API with SpringDoc + OpenAPI 3](https://www.dariawan.com/tutorials/spring/documenting-spring-boot-rest-api-springdoc-openapi-3/)
* [OpenAPI Specification](https://swagger.io/specification/)
* [OpenAPI 3 & Spring Boot](https://springdoc.org/)

