/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamento.hotel;

import estacionamento.*;
import veiculos.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author matheusfaggi
 */
public class GerenciamentoHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicicleta bike =  new Bicicleta("preto");
        Motocicleta moto = new Motocicleta("Verde", 2);
        moto.setCilindrada(200);
        Carro carro = new Carro("Cinza", 5);
        carro.setAno(2012);
        carro.setModelo("Uno Fiat");
        
        Vaga v1 = new Vaga(1);
        v1.addBicicleta(bike);
        v1.addMotocicleta(moto);
        
        Vaga v2 = new Vaga(2);
        v2.addCarro(carro);
        
        ArrayList<Vaga> vagas = new ArrayList(Arrays.asList(v1,v2));
        
        Estacionamento estacionamento =  new Estacionamento(vagas);
        
        estacionamento.addVaga(v1);
        estacionamento.addVaga(v2);
        
        estacionamento.listVagas();
        
        
    }
    
}
