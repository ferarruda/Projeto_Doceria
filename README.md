# Projeto Doceria

Sistema web para gerenciamento de uma doceria, desenvolvido com Java e Spring Boot, permitindo o controle de produtos, categorias, usuários e contatos por meio de uma interface intuitiva e integrada ao banco de dados.

## Tecnologias Utilizadas

### Backend

* Java 17
* Spring Boot 3
* Spring Web
* Spring Data JPA
* Spring Validation

### Frontend

* Thymeleaf
* HTML5
* CSS3
* Bootstrap

### Banco de Dados

* MySQL
* H2 Database (ambiente de desenvolvimento)

### Ferramentas

* Maven
* Git
* GitHub

---

## 📋 Funcionalidades

* Cadastro de produtos
* Edição de produtos
* Exclusão de produtos
* Listagem de produtos
* Gerenciamento de categorias
* Gerenciamento de usuários
* Cadastro de contatos
* Validação de formulários
* Persistência de dados com JPA/Hibernate
* Interface responsiva com Bootstrap

---

## Arquitetura

O projeto segue o padrão MVC (Model-View-Controller), promovendo melhor organização do código e separação de responsabilidades.

src/
├── controller/
├── model/
├── repository/
├── service/
├── templates/
└── static/

---

## ⚙️ Como Executar

### Pré-requisitos

* Java 17 ou superior
* Maven
* MySQL

### Clone o repositório

git clone https://github.com/ferarruda/Projeto_Doceria.git

### Acesse a pasta

cd Projeto_Doceria

### Configure o banco de dados

Atualize as credenciais no arquivo:

application.properties

### Execute a aplicação

mvn spring-boot:run

### Acesse

http://localhost:8080

---

## Objetivos do Projeto

Este projeto foi desenvolvido com o objetivo de praticar conceitos de desenvolvimento web utilizando Spring Boot, banco de dados relacionais, arquitetura MVC e integração entre backend e frontend.

Os principais aprendizados incluem:

* Desenvolvimento de aplicações web completas
* Persistência de dados com JPA/Hibernate
* Integração entre camadas da aplicação
* Criação de interfaces utilizando Thymeleaf
* Boas práticas de organização de projetos Java
* Versionamento com Git e GitHub

---

## Autor

Fernando Arruda

## 📸 Demonstração

### Página Inicial
![Página Inicial](Projeto_Doceria-main/docs/home.png)

### Login
![Login](docs/login.PNG)


