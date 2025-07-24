<h1 align="center"> Projeto Spring Boot + MySQL com Docker</h1>
<br>
Este projeto é uma API REST de gerenciamento de usuários construída com **Spring Boot**, **Spring Data JPA**, **MySQL** e **Docker**. Foi criada como prática para consolidar conhecimentos em backend moderno com Java.

<br> <br>

 <h2 align="center"> O que foi aprendido </h2>

Durante o desenvolvimento deste projeto, os seguintes conceitos e tecnologias foram explorados e praticados:

- ✅ Criação de uma aplicação Spring Boot com estrutura MVC
- ✅ Uso do **Spring Data JPA** para persistência de dados
- ✅ Mapeamento de entidades com JPA (`@Entity`, `@Id`, `@GeneratedValue`, etc)
- ✅ Criação de repositórios com `JpaRepository`
- ✅ Criação de controllers REST com anotações `@RestController`, `@GetMapping`, `@PostMapping`, etc
- ✅ Tratamento de requisições HTTP e serialização automática JSON
- ✅ Conexão com banco de dados MySQL
- ✅ Containerização com **Docker**
- ✅ Criação de um ambiente completo com **Docker Compose**
- ✅ Separação de containers: um para o banco (`mysql`) e outro para o app (`Spring Boot`)
- ✅ Variáveis de ambiente para configuração do banco
- ✅ Uso de `depends_on`, `networks` e `build` no Docker Compose
- ✅ Debug de erros comuns (portas, mappings, ambiguidades)

<br>

---

<br>

<h2> Tecnologias Utilizadas </h2>



  
| Tecnologia       | Função no projeto                           |
|------------------|---------------------------------------------|
| Java 17+         | Linguagem principal                         |
| Spring Boot      | Framework principal para a API              |
| Spring Data JPA  | Abstração ORM com Hibernate                 |
| MySQL            | Banco de dados relacional                   |
| Docker           | Containerização dos serviços                |
| Docker Compose   | Orquestração da aplicação + banco           |

```
---


## 🧩 Estrutura do Projeto

```bash
usuarioapp/
├── src/
│   └── main/
│       ├── java/
│       │   └── usuarioapp/
│       │       ├── controller/
│       │       ├── model/
│       │       ├── repository/
│       │       └── UsuarioappApplication.java
│       └── resources/
│           └── application.properties
├── Dockerfile
├── docker-compose.yml
└── pom.xml

```
## 🐳 Como rodar com Docker

### 1. Clone o repositório

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git

cd seu-repositorio
```

### 2. Build e subir os containers 

```bash
sudo docker compose up --build -d
```

### 3. verificar se tudo estar rodando 

```bash
docker ps
```


