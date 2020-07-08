USE gerenciamento_hotel;
CREATE VIEW combo_box_estacionamento AS 
	SELECT e.id, e.descricao, count(*) as capacidade
	FROM estacionamento e 
		INNER JOIN vaga v
		ON e.id = v.id_estacionamento 
        WHERE v.id_veiculo IS NULL
		GROUP BY e.id;

-- SELECT * FROM combo_box_estacionamento;

CREATE VIEW veiculos_estacionados AS    
	SELECT e.descricao AS andar, v.descricao AS vaga, ve.placa 
    	FROM estacionamento e
    	INNER JOIN vaga v
    	ON v.id_estacionamento = e.id
    	INNER JOIN veiculo ve
    	ON ve.id = v.id_veiculo 
    	WHERE v.id_veiculo IS NOT NULL;
    

    SELECT * FROM hospedagem h;
    SELECT * FROM reserva r; 
   
   
   SELECT c.nome, tq.descricao,
 q.valor_diaria,DATEDIFF(h.check_out, h.check_in) AS diarias,
 DATEDIFF(h.check_out, h.check_in) * q.valor_diaria AS total_pagar
 FROM cliente c 
 INNER JOIN hospedagem h
 ON c.id = h.id_cliente
 INNER JOIN quarto q
 ON q.id = h.id_quarto
 INNER JOIN tipo_quarto tq
 ON q.id_tipo_quarto = tq.id;

  SELECT 
  DATE_FORMAT(h.check_in, "%d/%m/%Y") AS entrada, 
  DATE_FORMAT(h.check_out, "%d/%m/%Y") AS saida,
  tq.descricao,
  c.nome,
  q.valor_diaria
 FROM cliente c 
 INNER JOIN hospedagem h
 ON c.id = h.id_cliente
 INNER JOIN quarto q
 ON q.id = h.id_quarto
 INNER JOIN tipo_quarto tq
 ON q.id_tipo_quarto = tq.id;

SELECT * FROM cliente;

SELECT tq.descricao, count(*) as disponiveis
	FROM quarto q
	INNER JOIN
	tipo_quarto tq
	ON q.id_tipo_quarto = tq.id
	INNER JOIN hospedagem h
	ON h.id_quarto = q.id
	WHERE CAST('2020-07-01' as DATE) NOT BETWEEN CAST(h.check_in as DATE) AND CAST(h.check_out as DATE)
	GROUP BY 1;

SELECT tq.id, tq.descricao, tq.qtdCamas, count(*) as disponiveis
 FROM quarto q
 INNER JOIN
 tipo_quarto tq
 ON q.id_tipo_quarto = tq.id
 INNER JOIN hospedagem h
 ON h.id_quarto = q.id
 WHERE CAST(STR_TO_DATE('20/12/2020','%d/%m/%Y') as DATE) 
NOT BETWEEN CAST(h.check_in as DATE) 
AND CAST(h.check_out as DATE) AND CAST(h.check_out as DATE)
 GROUP BY 1;

SELECT q.id, q.valor_diaria, q.descricao
 FROM quarto q
 INNER JOIN tipo_quarto tq
 ON q.id_tipo_quarto = tq.id
 WHERE q.id NOT IN (
 	SELECT h.id FROM hospedagem h 
 	WHERE CAST(STR_TO_DATE('ENTRADA','%d/%m/%Y') as DATE) 
 	NOT BETWEEN CAST(h.check_in as DATE) AND CAST(h.check_out as DATE) AND CAST(h.check_out as DATE))
 AND tq.descricao =  'tipo quarto' GROUP BY 1;    


SELECT q.id, q.valor_diaria, q.descricao, tq.descricao 
 FROM quarto q
 INNER JOIN tipo_quarto tq
 ON q.id_tipo_quarto = tq.id WHERE q.id NOT IN ( 
SELECT h.id FROM hospedagem h 
WHERE CAST(STR_TO_DATE('20/01/2020','%d/%m/%Y') as DATE) 
NOT BETWEEN CAST(h.check_in as DATE) AND CAST(h.check_out as DATE) AND CAST(h.check_out as DATE)) 
AND tq.descricao like  'Quarto duplo solteiro Standard'  GROUP BY 1;

SELECT q.id, q.descricao, q.valor_diaria,q.id_tipo_quarto, tq.descricao, tq.qtdCamas FROM quarto q 
INNER JOIN tipo_quarto tq
ON q.id_tipo_quarto = tq.id
ORDER BY 2;

SELECT DISTINCT tq.descricao FROM quarto q 
INNER JOIN tipo_quarto tq
ON q.id_tipo_quarto = tq.id
ORDER BY 1;


