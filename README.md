# Passo 1: Instalação do NetBeans

Acesse o site oficial do NetBeans (https://netbeans.apache.org/) e faça o download da versão mais recente.

Execute o arquivo de instalação baixado e siga as instruções do assistente de instalação para instalar o NetBeans no sistema.

Após a conclusão da instalação, inicie o NetBeans.


# Passo 2: Configuração do MySQL

Acesse o site oficial do MySQL (https://www.mysql.com/) e faça o download da versão mais recente do MySQL.

Execute o arquivo de instalação baixado e siga as instruções do assistente de instalação para instalar o MySQL em seu sistema.

Durante a instalação, defina uma senha para o usuário root do MySQL.

Após a conclusão da instalação, inicie o servidor MySQL.


# Passo 3: Criação do banco de dados

Abra o MySQL Workbench.

Conecte-se ao servidor MySQL usando as credenciais de root que você configurou durante a instalação.

Execute os seguintes comandos SQL para criar as tabelas do banco de dados:


```MySQL
CREATE DATABASE IF NOT EXISTS crud_frete;

USE crud_frete;

CREATE TABLE Veiculo (
  id INT PRIMARY KEY AUTO_INCREMENT,
  modelo VARCHAR(255),
  tipo VARCHAR(255),
  peso DECIMAL(10,2)
);

CREATE TABLE Produto (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(255),
  peso DECIMAL(10,2)
);

CREATE TABLE Usuario (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(255) NOT NULL, 
  senha VARCHAR(255) NOT NULL,
  perfil VARCHAR(255) NOT NULL, 
  email VARCHAR(100) NOT NULL
);

CREATE TABLE FreteDados (
  id INT PRIMARY KEY AUTO_INCREMENT,
  idUser INT,
  produto VARCHAR(100),
  pesoProduto DECIMAL(10,2),
  veiculo VARCHAR(100),
  valorFrete DECIMAL(10,2),
  valorTaxaFrete DECIMAL(10,2),
  distancia DECIMAL(10,2),
  dataSolicitacao VARCHAR(10),
  FOREIGN KEY (idUser) REFERENCES Usuario(id)
);

```

# Passo 4: Configuração do projeto no NetBeans

Inicie o NetBeans.

Na barra de menus, clique em "File" (Arquivo) e selecione "Open Project" (Abrir Projeto).

Navegue até o diretório do projeto existente e selecione a pasta raiz do projeto.

Clique em "Open" (Abrir) para abrir o projeto no NetBeans.

Abra o arquivo ConexaoDAO.java.

```java
String url = "jdbc:mysql://localhost:3306/CRUD_FRETE";
String user = "root";
String password = "sua_senha_aqui";
```

Localize a linha que contém a variável password e substitua "sua_senha_aqui" pela senha do seu banco de dados.

Verifique se a variável url está apontando para o endereço correto do seu banco de dados. 

No exemplo fornecido, está configurado como **jdbc:mysql://localhost:3306/CRUD_FRETE**, o que significa que o banco de dados está sendo executado localmente na porta 3306 e o nome do banco de dados é CRUD_FRETE.

Se o seu banco de dados estiver em um endereço ou porta diferente, ou se o nome do banco de dados for diferente, atualize essa linha de acordo.

Certifique-se de que as informações de senha e endereço do banco de dados estejam corretas para que a conexão seja estabelecida com sucesso.
