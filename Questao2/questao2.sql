CREATE DATABASE CATALOGO_DE_FILMES;
USE CATALOGO_DE_FILMES;
CREATE TABLE FILMES(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(50),
descricao VARCHAR(50),
ano_lancamento INT);

INSERT INTO filmes(nome, descricao, ano_lancamento) 
VALUES 
('O Poderoso Chefão','Drama',1972),
('Matrix','Ficção Científica',1999),
('O Rei Leão','Animaçao',2019),
('Gladiador','Ação',2000),
('Django Livre','Faroeste',2013),
('Toy Story 4','Infantil',2019),
('Bastardos Inglórios','Ação',2009),
('Duro de Matar','Ação',1988),
('O Exorcismo de Emily Rose','Terror',2005),
('Minha Mãe é Uma Peça','Comédia',2009),
('V de Vingança','Ação',2006),
('O Lobo de Wall Sreet','Comédia/Drama',2014),
('Procurando Nemo','Infantil',2003),
('Tubarão','Suspense',1975),
('Piratas do Caribe: A Maldição do Pérola Negra','Ação',2003),
('O Exterminador do Futuro','Ficção Científica',1984),
('Fuja','Terror',2020),
('Pânico em Alto Mar','Drama/Terror',2006),
('Jurassic World: Domínio','Aventura/Ficção Científica',2022),
('O Impossível','Drama',2012);

