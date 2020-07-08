DROP DATABASE IF EXISTS gerenciamento_hotel;
CREATE DATABASE gerenciamento_hotel;
USE gerenciamento_hotel;

CREATE TABLE tipo_quarto (
	id INT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR(255),
    qtdCamas INT
);
INSERT INTO tipo_quarto(descricao, qtdCamas) VALUES
	("Quarto solteiro Standard", 1),
	("Quarto solteiro Master", 1),
	("Quarto solteiro Deluxe", 1),
	("Quarto duplo solteiro Standard", 2),
	("Quarto duplo solteiro Master", 2),
	("Quarto duplo solteiro Deluxe", 2);

-- SELECT * FROM tipo_quarto;

CREATE TABLE quarto(
	id INT AUTO_INCREMENT PRIMARY KEY,
	descricao VARCHAR(64) NOT NULL,
    valor_diaria DECIMAL(6,2) NOT NULL,
    id_tipo_quarto INT NOT NULL,
    CONSTRAINT fk_tipo_quarto 
    FOREIGN KEY (id_tipo_quarto) REFERENCES tipo_quarto(id)
);

INSERT INTO quarto(valor_diaria, id_tipo_quarto, descricao) VALUES 
	(80.00, 1, "01"), (90.00, 2, "02"), (110.00, 3, "03"),
	(120.00, 4, "11"), (130.00, 5, "12"), (140.00, 6, "13"),
	(120.00, 4, "21"), (130.00, 5, "22"), (140.00, 6, "23");

-- SELECT * FROM quarto;

CREATE TABLE funcionario (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome  VARCHAR(64)  NOT NULL,
    cargo VARCHAR(64) NOT NULL
);
INSERT INTO funcionario(nome, cargo) VALUES
	("Jonas Kanhwald", "Recepcionista");

CREATE TABLE cliente (
	id INT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(64) NOT NULL,
	email VARCHAR(64) NOT NULL UNIQUE
);
INSERT INTO cliente(nome, email) VALUES
	("Martha Nielsen", "martha.nielsen@gmail.com"),
	("Claudia Tiddeman", "claudia.tiddeman@hotmail.com"),
	("Michael Kanhwald", "michael.kanhwald@gmail.com"),
	("Bartosh Tiddeman", "bartosh.tiddman@gmail.com");


CREATE TABLE reserva (
	id INT AUTO_INCREMENT PRIMARY KEY,
    entrada DATE NOT NULL,
    saida DATE NOT NULL,
    id_quarto INT NOT NULL,
    id_cliente INT NOT NULL,
    id_funcionario INT NOT NULL,
    utilizada TINYINT(1) DEFAULT 0,
    created_at DATETIME DEFAULT now(),
    CONSTRAINT fk_quarto
    FOREIGN KEY (id_quarto) REFERENCES quarto(id),
    CONSTRAINT fk_cliente
    FOREIGN KEY (id_cliente) REFERENCES cliente(id),
    CONSTRAINT fk_funcionario
    FOREIGN KEY (id_funcionario) REFERENCES funcionario(id)
);

INSERT INTO reserva(entrada, saida, id_quarto, id_cliente, id_funcionario) VALUES
	("2020/07/01 11:00:00","2020/07/05 11:00:00", 1, 1, 1),
	("2020/07/05 20:00:00","2020/07/07 20:00:00", 1, 2, 1),
	("2020/07/01 15:00:00","2020/07/05 15:00:00", 2, 3, 1),
	("2020/07/02 11:00:00","2020/07/06 11:00:00", 3, 4, 1);

CREATE TABLE hospedagem (
	id INT AUTO_INCREMENT,
    check_in DATE NOT NULL,
    check_out DATE NOT NULL,
    id_quarto INT NOT NULL,
    id_cliente INT NOT NULL,
    id_funcionario INT NOT NULL,
    id_reserva INT,
    created_at DATETIME DEFAULT now(),
    PRIMARY KEY(id),
    FOREIGN KEY (id_quarto) REFERENCES quarto(id),
    FOREIGN KEY (id_reserva) REFERENCES reserva(id),
    FOREIGN KEY (id_cliente) REFERENCES cliente(id),
    FOREIGN KEY (id_funcionario) REFERENCES funcionario(id)
);

INSERT INTO hospedagem (check_in, check_out, id_quarto, id_cliente, id_funcionario, id_reserva) VALUES
	("2020/07/01 11:00:00","2020/07/05 11:00:00", 1, 1, 1, 1),
	("2020/07/01 15:00:00","2020/07/05 15:00:00", 2, 3, 1, 2),
	("2020/07/08 11:00:00","2020/07/12 11:00:00", 3, 4, 1, null);


CREATE TABLE veiculo (
	id INT AUTO_INCREMENT PRIMARY KEY,
	placa VARCHAR(10) UNIQUE,
	tipo VARCHAR(32) NOT NULL CHECK (tipo = "moto" OR tipo = "bicicleta" OR tipo = "carro") ,
	cor VARCHAR(32) NOT NULL,
	modelo VARCHAR(64) NOT NULL,
	ano INT,
	cilindrada INT,
	qtd_lugares INT,
	marcha INT
);

-- INSERIR QUANDO FAZER O FRONT 
INSERT INTO veiculo (placa, tipo, modelo, cor, ano) VALUES 
	("ABC-1234", "carro", "Uno fiat","Azul bb", 2006),
    ("DEF-5678", "carro", "Fiorino","Branca", 2006);

CREATE TABLE estacionamento(
	id INT PRIMARY KEY AUTO_INCREMENT,
	descricao VARCHAR(255) NOT NULL
);

INSERT INTO estacionamento(descricao) VALUES("térreo");

CREATE TABLE vaga(
	id INT PRIMARY KEY AUTO_INCREMENT,
	descricao VARCHAR(10) NOT NULL,
	id_veiculo INT UNIQUE,
    id_estacionamento INT, 
	FOREIGN KEY (id_veiculo) REFERENCES veiculo(id),
    FOREIGN KEY (id_estacionamento) REFERENCES estacionamento(id)
);

INSERT INTO vaga(descricao, id_estacionamento) VALUES 
	("1A",1),("2A",1),("3A",1),("4A",1),
	("1B",1),("2B",1),("3B",1),("4B",1);

UPDATE vaga SET id_veiculo = 1 WHERE id = 1;
UPDATE vaga SET id_veiculo = 2 WHERE id = 2;




