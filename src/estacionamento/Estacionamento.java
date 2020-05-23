/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

import java.util.Set;
import java.util.ArrayList;

import veiculos.*;

/**
 *
 * @author matheusfaggi
 */
public class Estacionamento {
    private ArrayList<Vaga> vagas;
    public Estacionamento(ArrayList<Vaga> vagas){
        this.vagas = vagas;
    }
    public void listVagas() {
        for(Vaga vaga : vagas){
            System.out.println(String.format("Vaga %d: \n " , vaga.getNumero()));
            for(Object veiculo : vaga.getVeiculos()){
                if(veiculo instanceof Bicicleta){
                    Bicicleta bike = (Bicicleta)veiculo;
                    System.out.println(String.format(
                        "Cor: %s \nqtdLugar: %d \nMarcha: %s\n\n",
                        bike.getCor(), bike.getQtdLugar(), bike.isMarcha()));
                }
                if(veiculo instanceof Carro){
                    Carro carro = (Carro)veiculo;
                    System.out.println(String.format(
                        "Cor: %s \nqtdLugar: %d \nModelo/ano: %s/%d\n\n",
                        carro.getCor(), carro.getQtdLugar(), carro.getModelo(), carro.getAno()));
                }
                if(veiculo instanceof Motocicleta){
                    Motocicleta moto =  (Motocicleta)veiculo;
                    System.out.println(String.format(
                        "Cor: %s \nqtdLugar: %d \nCilindrada: %s\n\n",
                        moto.getCor(), moto.getQtdLugar(), moto.getCilindrada()));
                }
            }
            
        }
    }
    
    
    public void addVaga(Vaga vaga) {
        this.vagas.add(vaga);
    }
    
}
