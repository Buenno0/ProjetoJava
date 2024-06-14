
CREATE TABLE cliente (
    idCliente INT PRIMARY KEY AUTO_INCREMENT,
    Nome VARCHAR(255),
    Email VARCHAR(100),
    Telefone VARCHAR(35),
    Genero VARCHAR(50), 
    Endereco VARCHAR(255),
    idPlano INT,
    FOREIGN KEY (idPlano) REFERENCES planosAssociacao(ID) ON DELETE SET NULL
);


-- Criação da tabela de Planos de Associação
CREATE TABLE planosAssociacao (
    ID INT PRIMARY KEY auto_increment,
    NomePlano VARCHAR(100),
    Preço DECIMAL(10, 2),
    Descrição TEXT
);

-- Criação da tabela de Funcionários
CREATE TABLE funcionarios (
    ID INT PRIMARY KEY auto_increment,
    Nome VARCHAR(255),
    Cargo VARCHAR(100),
    Email VARCHAR(100),
    Salario DECIMAL(10, 2),
    Telefone VARCHAR(15),
    dataContrato DATE
);