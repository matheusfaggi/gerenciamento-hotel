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
	("Quarto duplo solteiro Standart", 2),
	("Quarto duplo solteiro Master", 2),
	("Quarto duplo solteiro Deluxe", 2);

-- SELECT * FROM tipo_quarto;

CREATE TABLE quarto(
	id INT AUTO_INCREMENT PRIMARY KEY,
    valor_diaria DECIMAL(6,2) NOT NULL,
    id_tipo_quarto INT NOT NULL,
    CONSTRAINT fk_tipo_quarto 
    FOREIGN KEY (id_tipo_quarto) REFERENCES tipo_quarto(id)
);

INSERT INTO quarto(valor_diaria, id_tipo_quarto) VALUES 
	(80.00, 1), (90.00, 2), (110.00, 3),
	(120.00, 4), (130.00, 5), (140.00, 6);

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
	email VARCHAR(64) NOT NULL
);
INSERT INTO cliente(nome, email) VALUES
	("Martha Nielsen", "martha.nielsen@gmail.com"),
	("Claudia Tiddeman", "claudia.tiddeman@hotmail.com"),
	("Michael Kanhwald", "michael.kanhwald@gmail.com"),
	("Bartosh Tiddeman", "bartosh.tiddman@gmail.com");


CREATE TABLE reserva (
	id INT AUTO_INCREMENT PRIMARY KEY,
    entrada DATETIME NOT NULL,
    saida DATETIME NOT NULL,
    id_quarto INT NOT NULL,
    id_cliente INT NOT NULL,
    id_funcionario INT NOT NULL,
    utilizada TINYINT(1) DEFAULT 0,
    created_at DATETIME DEFAULT now(),
    CONSTRAINT fk_quarto
    FOREIGN KEY (id_quarto) REFERENCES quarto(id)
    CONSTRAINT fk_cliente
    FOREIGN KEY (id_cliente) REFERENCES cliente(id)
);

INSERT INTO reserva(entrada, saida, id_quarto) VALUES
("2020/07/01 11:00:00","2020/07/05 11:00:00", 1),
("2020/07/05 20:00:00","2020/07/07 20:00:00", 1),
("2020/07/01 15:00:00","2020/07/05 15:00:00", 2),
("2020/07/02 11:00:00","2020/07/06 11:00:00", 3);

CREATE TABLE hospedagem (
	id INT AUTO_INCREMENT PRIMARY KEY,
    check_in DATETIME NOT NULL,
    check_out DATETIME NOT NULL,
    id_quarto INT NOT NULL,
    id_reserva INT,
    created_at DATETIME DEFAULT now(),
    CONSTRAINT fk_quarto
    FOREIGN KEY (id_quarto) REFERENCES quarto(id),
    FOREIGN KEY (id_reserva) REFERENCES reserva(id)
);





