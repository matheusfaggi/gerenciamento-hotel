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
    nome  VARCHAR(25)  NOT NULL,
    cargo VARCHAR(64) NOT NULL
);
INSERT INTO funcionario(nome, cargo) VALUES
	("Jonas Kanhwald", "Recepcionista");


CREATE TABLE reserva (
	id INT AUTO_INCREMENT PRIMARY KEY,
    entrada DATETIME NOT NULL,
    saida DATETIME NOT NULL,
    id_quarto INT NOT NULL,
    is_usada TINYINT(1) DEFAULT 0,
    created_at DATETIME DEFAULT now(),
    CONSTRAINT fk_quarto
    FOREIGN KEY (id_quarto) REFERENCES quarto(id)
);

INSERT INTO reserva(entrada, saida, id_quarto) VALUES
("01/07/2020 11:00:00","05/07/2020 11:00:00", 1),
("05/07/2020 20:00:00","07/07/2020 20:00:00", 1),
("01/07/2020 15:00:00","05/07/2020 15:00:00", 2),
("01/07/2020 11:00:00","05/07/2020 11:00:00", 3);

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





