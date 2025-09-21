Projeto Web de Cadastro de Usuários
Descrição

Este projeto é uma atividade acadêmica voltada para estudo de desenvolvimento web em Java, utilizando JSP, Servlets, JDBC e MySQL.

O objetivo do projeto é criar um sistema simples de cadastro de clientes, permitindo que o usuário preencha um formulário com informações pessoais, que são então gravadas em um banco de dados.

O projeto segue a arquitetura MVC (Model-View-Controller):

Model: Classes que representam os dados e regras de negócio (Cliente.java, ClienteDAO.java).

View: Páginas JSP que exibem o formulário e mensagens ao usuário (cadastro.jsp, user.jsp).

Controller: JSPs que recebem as requisições e controlam o fluxo de cadastro, chamando o DAO para persistência.

Funcionalidades

Cadastro de clientes com os seguintes campos:

Nome completo

CPF

Email

Celular

CEP

Tipo de moradia (Apartamento ou Casa de Alvenaria)

Validação básica no HTML usando required.

Armazenamento dos dados no banco MySQL via JDBC.

Retorno de confirmação após cadastro, exibindo os dados inseridos.

Interface com CSS para melhor experiência visual.

Tecnologias Utilizadas

Java SE

JSP/Servlets

JDBC para conexão com banco MySQL

MySQL (pode ser utilizado via XAMPP)

HTML5 e CSS3

MVC como padrão de arquitetura

Estrutura do Projeto
WebCadastro/
│
├─ src/
│   ├─ model/
│   │   ├─ Cliente.java
│   │   └─ DAO/
│   │       └─ ClienteDAO.java
│   └─ config/
│       └─ ConectaBanco.java
│
├─ WebContent/
│   ├─ cadUser/
│   │   ├─ cadastro.jsp
│   │   └─ user.jsp
│   └─ css/
│       └─ style.css
│
├─ README.md
└─ .gitignore

Pré-requisitos

JDK 11 ou superior

Apache Tomcat 9+

MySQL (ou outro servidor compatível)

IDE como NetBeans ou Eclipse

Certifique-se de que a tabela do banco de dados está criada conforme os campos do formulário e que o usuário tem permissões para inserir dados.

Como Rodar

Clone o repositório:

git clone https://github.com/seu-usuario/WebCadastro.git


Configure o banco de dados (clientes) e a tabela (clientes) com os campos necessários.

Ajuste o arquivo ConectaBanco.java com usuário, senha e nome do banco.

Abra o projeto em uma IDE que suporte Java Web (ex: NetBeans).

Configure o Tomcat como servidor no projeto.

Execute o projeto e acesse o formulário no navegador:

http://localhost:8080/WebCadastro/cadUser/cadastro.jsp

Observações

Este projeto foi desenvolvido para fins acadêmicos.

O CPF, CEP e celular são tratados como String para preservar zeros à esquerda e evitar problemas com limites numéricos.

A interface possui um formulário centralizado, estilizado com CSS, com botões de envio e limpeza de campos.
