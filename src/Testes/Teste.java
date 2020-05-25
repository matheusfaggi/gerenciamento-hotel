/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import estacionamento.Estacionamento;
import estacionamento.Vaga;
import hospedagem.Hospedagem;
import hospedagem.Quarto;
import hospedagem.Reserva;
import hospedagem.TipoQuarto;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import pessoa.Cliente;
import pessoa.Recepcionista;
import veiculos.Bicicleta;
import veiculos.Carro;

/**
 *
 * @author matheusfaggi
 */
public class Teste {
    public Teste(){
        TipoQuarto presidencial =  new TipoQuarto("Sauna, hidromassagem e open de Hidroxocloroquina", 1);
        TipoQuarto master =  new TipoQuarto("TV a cabo e cama massageadora", 2);
        
        Quarto quarto1 = new Quarto(presidencial, 200);
        Quarto quarto2 = new Quarto(presidencial, 250);
        Quarto quarto3 = new Quarto(master, 400);
        
        List <Quarto> quartos = new <Quarto> ArrayList(Arrays.asList(quarto1, quarto2, quarto3));
        System.out.println("------- QUARTOS -------\n");
        for(Quarto quarto : quartos){
            TipoQuarto tipo = quarto.getTipoQuarto();
            System.out.println(String.format("Tipo quarto: %s \nQuantidade de camas: %d \nValor diária: %.2f\n\n", 
                    tipo.getDescricao(), tipo.getQtdCamas(), quarto.getValorDiaria()));
        }
        
        Recepcionista recep = new Recepcionista("Ronaldo Silva");
        recep.setCargo("Gerenciamento de hospedagem");
        
        Cliente cliente1 = new Cliente("Hitchcook");
        cliente1.setEmail("hitchcook@gmail.com");
        
        Cliente cliente2 = new Cliente("Scully");
        cliente2.setEmail("scully@gmail.com");        
        
        Bicicleta bike =  new Bicicleta(recep, "Preta");
        bike.setMarcha(true);
        
        Carro carro = new Carro(cliente1, "Cinza");
        carro.setAno(2012);
        carro.setModelo("Uno Fiat");
        
        Vaga v1 = new Vaga(1);
        v1.addVeiculo(bike);

        Vaga v2 = new Vaga(2);
        v2.addVeiculo(carro);
        
        Vaga v3 = new Vaga(3);
        
        Vaga v4 = new Vaga(4);
        
        Vaga v5 = new Vaga(5);
        
        ArrayList<Vaga> vagas = new ArrayList(Arrays.asList(v1, v2, v3, v4, v5));
        Estacionamento estacionamento =  new Estacionamento(vagas);
        
        System.out.println("------- ESTACIONAMENTO -------\n");

        estacionamento.listVagas();
        
        System.out.println("------- RESERVAS E HOSPEDAGEM -------\n");

        // CRIANDO UMA HOSPEDAGEM COM RESERVA
        Date entrada =  new Date();
        Date saida =  new Date();
        try{
             entrada = new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2020");
             saida = new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2020");
        }catch(ParseException e){
            System.out.println(e.getMessage());
        }

        Reserva reserva = new Reserva(entrada, saida, cliente1, recep, quarto1);
        System.out.println(String.format("Reserva feita! \nValor da diária: %.2f\n", reserva.getQuarto().getValorDiaria()));
        
        Hospedagem h1 = new Hospedagem(cliente1, quarto1, reserva);
        System.out.println(String
                .format("Hospedagem realizada sem reserva prévia!\nCliente: %s\nValor total: %.2f\n", 
                        h1.getCliente().getNome(),h1.getTotalPagar()));
        
        
        
        // HOSPEDANDO SEM RESERVA
        try{
             entrada = new SimpleDateFormat("dd/MM/yyyy").parse("10/12/2020");
             saida = new SimpleDateFormat("dd/MM/yyyy").parse("25/12/2020");
        }catch(ParseException e){
            System.out.println(e.getMessage());
        }
        
        Hospedagem h2 = new Hospedagem(cliente2, quarto3, entrada, saida);
        System.out.println(String
                .format("Hospedagem realizada sem reserva prévia!\nCliente: %s\nValor total: %.2f\n", 
                        h2.getCliente().getNome(),h2.getTotalPagar()));
        
        Hospedagem h3 = new Hospedagem(cliente1, quarto2, entrada, saida);
        System.out.println(String
                .format("Hospedagem realizada sem reserva prévia!\nCliente: %s\nValor total: %.2f\n", 
                        h3.getCliente().getNome(),h3.getTotalPagar()));
        
        System.out.println("------- TOTAL A PAGAR POR CLIENTE -------\n");

        for(Cliente cliente : Arrays.asList(cliente1, cliente2)){
            float totalPagamento = 0;
            for(Hospedagem hospedagem : cliente.getHospedagens()){
                totalPagamento += hospedagem.getTotalPagar();
            }
            System.out.println(String.format("Cliente: %s - Total a pagar: %.2f", cliente.getNome(), totalPagamento));
        }
    }
}
