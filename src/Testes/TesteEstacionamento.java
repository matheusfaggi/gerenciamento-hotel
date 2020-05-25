/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import estacionamento.Estacionamento;
import estacionamento.Vaga;
import veiculos.*;
import pessoa.*;
import java.util.*;


/**
 *
 * @author matheusfaggi
 */
public class TesteEstacionamento {
    public TesteEstacionamento(){
        
        Recepcionista recep = new Recepcionista("Ronaldo Silva");
        
        Cliente cliente = new Cliente("Hitchcook");
        
        Cliente cliente2 = new Cliente("Scully");
        
        Bicicleta bike =  new Bicicleta(recep, "Preto");
        
//        Motocicleta moto = new Motocicleta("Verde");
//        moto.setCilindrada(200);
        
        Carro carro = new Carro(cliente, "Cinza");
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
        
        estacionamento.listVagas();
        
        
        
        
    }
}
