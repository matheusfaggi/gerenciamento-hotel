/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import estacionamento.Vaga;
import java.util.ArrayList;
import java.util.Arrays;
import veiculos.Bicicleta;
import veiculos.Carro;
import veiculos.Motocicleta;

/**
 *
 * @author matheusfaggi
 */
public class Estacionamento {
    public Estacionamento(){ 
        Bicicleta bike =  new Bicicleta("Preto");
        
        Motocicleta moto = new Motocicleta("Verde");
        moto.setCilindrada(200);
        
        Carro carro = new Carro("Cinza");
        carro.setAno(2012);
        carro.setModelo("Uno Fiat");

        Vaga v1 = new Vaga(1);
        v1.addBicicleta(bike);
        v1.addMotocicleta(moto);

        Vaga v2 = new Vaga(2);
        v2.addCarro(carro);

        ArrayList<Vaga> vagas = new ArrayList(Arrays.asList(v1,v2));

        estacionamento.Estacionamento estacionamento =  new estacionamento.Estacionamento(vagas);

        estacionamento.addVaga(v1);
        estacionamento.addVaga(v2);

        estacionamento.listVagas();
    }
}
