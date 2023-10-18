CREATE TABLE usuarios (
id_usuario int(10) not null primary key auto_increment,
nome varchar(50) not null,
senha varchar(50) not null,
perfil varchar(50) not null 
);

INSERT INTO usuarios (nome, senha, perfil) VALUES 
('adm', 'adm', 'administrador'),
('ger', 'ger', 'gerente'),
('ven', 'ven', 'vendedor');


/* ESTOQUE */
CREATE TABLE estoque (
id_estoque int(10) not null primary key auto_increment, 
nome varchar(50) not null,
descricao varchar(200) not null, 
preco_unitario int(10) not null,
qtd_estoque int(10) not null
);

INSERT INTO estoque (nome, descricao, preco_unitario, qtd_estoque)
VALUES 
('Hambúrguer', 'Hambúrguer de carne', 5, 100),
('Refrigerante', 'Refrigerante de cola', 2, 200),
('Batata Frita', 'Porção de batatas', 3, 150),
('Sundae', 'Sundae de chocolate', 4, 50),
('Pizza Margherita', 'Pizza com molho de tomate, mussarela e manjericão', 8, 80),
('Cachorro-Quente', 'Pão com salsicha, ketchup e mostarda', 4, 120),
('Salada Caesar', 'Salada de alface, frango grelhado, croutons e molho Caesar', 6, 60),
('Lasanha', 'Lasanha de carne com molho de tomate e queijo', 7, 70),
('Taco Mexicano', 'Taco com carne moída, alface, queijo e molho de pimenta', 5, 90),
('Sushi', 'Sushi variado com peixe, arroz e alga', 10, 40);


/* CATEGORIAS */

CREATE TABLE categoria (
id_categoria int(10) not null auto_increment primary key,
nome_categoria varchar(100) not null,
id_estoque int(10),
CONSTRAINT fk_categoria_estoque foreign key (id_estoque) references estoque(id_estoque)
);

INSERT INTO categoria (nome_categoria, id_estoque)
VALUES 
('Fast Food', 1),
('Bebidas', 2),
('Fast Food', 3),
('Sobremesas', 4),
('Fast Food', 5),
('Fast Food', 6),
('Saladas', 7),
('Massas', 8),
('Fast Food', 9),
('Sushi', 10);


/* FORNECEDORES */

CREATE TABLE fornecedores(
id_cliente int(10) not null auto_increment primary key,
nome_fornecedor varchar(100) not null,
idade int(10) not null,
email varchar(100) not null,
telefone varchar(20) not null,
id_estoque int(10),
CONSTRAINT fk_fornecedores_estoque foreign key (id_estoque) references estoque(id_estoque)
);

INSERT INTO fornecedores (nome_fornecedor, idade, email, telefone) VALUES
('João da Silva', 35, 'joao.silva@email.com', '(11) 1234-5678'),
('Maria Oliveira', 28, 'maria.oliveira@email.com', '(22) 9876-5432'),
('Pedro Santos', 40, 'pedro.santos@email.com', '(33) 5555-5555'),
('Ana Souza', 23, 'ana.souza@email.com', '(44) 7777-7777'),
('Carlos Pereira', 50, 'carlos.pereira@email.com', '(55) 9999-9999'),
('Laura Almeida', 32, 'laura.almeida@email.com', '(66) 1111-1111'),
('José Ferreira', 45, 'jose.ferreira@email.com', '(77) 3333-3333'),
('Fernanda Lima', 29, 'fernanda.lima@email.com', '(88) 2222-2222'),
('Paulo Ribeiro', 38, 'paulo.ribeiro@email.com', '(99) 4444-4444'),
('Beatriz Santos', 26, 'beatriz.santos@email.com', '(00) 6666-6666');



