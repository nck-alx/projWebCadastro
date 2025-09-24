# 👨‍🎓 Projeto Web Cadastro

Mini-projeto acadêmico que permite o cadastro de dados em um **servidor local**, simulando um cadastro em um serviço de hotéis.

---

## 🛠️ Ferramentas utilizadas
- 📐 **Padrão MVC** (Model, View & Control)  
- ☕ **Java** | **JSP (Java Server Pages)**  
- 🌐 **Apache Tomcat** (servidor de aplicação local)  
- 🗄️ **MySQL** (banco de dados relacional)  

---

## 🚀 Funcionalidades
- Cadastro de clientes com os seguintes campos:  
  - Nome  
  - CPF  
  - Email  
  - Celular  
  - CEP  
  - Tipo de moradia (Apartamento ou Casa de Alvenaria)

---

## ⚙️ Banco de Dados
O banco foi criado em um servidor **MySQL** local com a seguinte estrutura:

```sql
CREATE DATABASE clientes;

USE clientes;

CREATE TABLE dadosCliente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    cpf VARCHAR(14) NOT NULL,
    cep VARCHAR(9) NOT NULL,
    tipo_moradia VARCHAR(50) NOT NULL,
    num_tel VARCHAR(20) NOT NULL
);
