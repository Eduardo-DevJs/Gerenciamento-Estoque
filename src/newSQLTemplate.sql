CREATE DATABASE bd_hamburgueria;
USE bd_hamburgueria;

CREATE TABLE usuarios(
id_usuario int(10) not null primary key auto_increment,
nome varchar(50) not null,
senha varchar(50) not null,
perfil varchar(50) not null 
);

INSERT INTO usuarios (nome, senha, perfil)
VALUES 
('adm', 'adm', 'administrador'),
('ven', 'ven', 'vendedor'),
('ger', 'ger', 'gerente');


CREATE TABLE estoques (
id_estoque int(10) not null primary key auto_increment,
nome varchar(50) not null,
preco_unitario varchar(50) not null,
qtd_estoque int(10) not null,
descricao varchar(150) not null
);

CREATE TABLE categorias(
id_categorias int(10) not null auto_increment primary key,
categoria varchar(50) not null,
id_estoque int(10)
);

-- Inserindo categorias para uma hamburgueria
INSERT INTO categorias (categoria, id_estoque) VALUES
('Hamburgueres', 1),
('Bebidas', 2),
('Sobremesas', 3),
('Acompanhamentos', 4),
('Combos', 5),
('Promoções', 6),
('Saladas', 7),
('Sanduíches', 8),
('Bebidas Alcoólicas', 9),
('Refrescos', 10);

CREATE TABLE fornecedores (
id_fornecedor int(10) not null primary key auto_increment,
nome varchar(100) not null,
idade int(10) not null,
email varchar(100) not null,
telefone varchar(20) not null,
id_estoque int(10) not null
);

INSERT INTO fornecedores (nome, idade, email, telefone, id_estoque)
VALUES 
('João da Silva', 35, 'joao.silva@email.com', '(11) 1234-5678',1),
('Maria Oliveira', 28, 'maria.oliveira@email.com', '(22) 9876-5432',2),
('Pedro Santos', 40, 'pedro.santos@email.com', '(33) 5555-5555',3),
('Ana Souza', 23, 'ana.souza@email.com', '(44) 7777-7777',4),
('Carlos Pereira', 50, 'carlos.pereira@email.com', '(55) 9999-9999',5),
('Laura Almeida', 32, 'laura.almeida@email.com', '(66) 1111-1111',6),
('José Ferreira', 45, 'jose.ferreira@email.com', '(77) 3333-3333',7),
('Fernanda Lima', 29, 'fernanda.lima@email.com', '(88) 2222-2222',8),
('Paulo Ribeiro', 38, 'paulo.ribeiro@email.com', '(99) 4444-4444',9),
('Beatriz Santos', 26, 'beatriz.santos@email.com', '(00) 6666-6666',10);


SELECT estoques.id_estoque, estoques.nome, estoques.preco_unitario, estoques.descricao, estoques.qtd_estoque, categorias.categoria
FROM estoques
INNER JOIN categorias ON estoques.id_estoque = categorias.id_estoque;


