# gerenciamento-hotel
Prova N1 da matéria de Programação Orientada a Objetos do professor Flavio Viotti, utilizando Java.

## Orientações 
A atividade consiste em implementar o diagrama abaixo.


![diagrama](https://github.com/matheusfaggi/gerenciamento-hotel/blob/develop/diagrama.jpg)

### Requisitos do sistema
- Toda reserva deve ser feita por um recepcionista e deve ter um cliente

- Essa reserva deve necessariamente informar qual o seu quarto, onde cada reserva possui somente um único quarto

- Posteriormente uma hospedagem pode ocorrer a partir de uma reserva. Caso isso ocorra as datas da hospedagem devem coincidir com as datas da reserva. Ou o cliente pode se hospedar sem fazer reserva

- Quando a hospedagem for via reserva, é preciso alterar o status da reserva para utilizada = true

- Em um cliente é possível listar todas suas reservas ou hospedagens. Essa listagem ira devolver para o usuário um array contendo todos os objetos destas coleções de reservas e hospedagens.

- Na hospedagem o método totalPagar() deve somar todos os valores das diárias que a pessoa ficou hospedada

- Preste atenção nos métodos construtores de veículos.

- Neste hotel existe um estacionamento que contém diversas vagas, e cada vaga pode ser ocupada por vários veículos. Não precisa fazer controle sobre quando um veículo estará ou não neste estacionamento.

- Quando for preciso listar os veículos deste estacionamento, o método deverá verificar se o veículo é um carro para mostrar o ano do carro, se for uma bicicleta mostrar sua marca, e se for uma motocicleta mostre sua cilindrada.

- Você precisa criar pelo menos duas classes de tratamento de exceções e coloca-las no seu projeto em algum local. Vou deixar isso a seu critério.

### Testes necessários na classe Main

- Crie 3 quartos e armazene-os em uma coleção de quartos

- Crie uma recepcionista e dois clientes

- Crie um estacionamento com 5 vagas

- Para a recepcionista atribua uma bicicleta, para um único cliente, um carro. Para cada um deles coloque-os em uma vaga de estacionamento

- Faça uma reserva para um cliente e para o outro cliente hospede-o diretamente sem reserva

- Informe o total a pagar para cada cliente

- Liste todos os veículos que o estacionamento possui

- Todos dados podem ser colocados de forma hardcode, ou seja, não precisa pedir para o usuário através da classe Scanner.
