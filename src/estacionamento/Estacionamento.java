/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

import java.util.ArrayList;
import veiculos.*;

/**
 *
 * @author matheusfaggi
 */
public class Estacionamento {
    private final ArrayList<Vaga> vagas;
    
    public Estacionamento(ArrayList<Vaga> vagas){
        this.vagas = vagas;
    }
    
    public void listVagas() {
        for(Vaga vaga : vagas) {
//          Percorre todas vagas, e exibe que veiculo pertenceu a vaga 
            System.out.println(String.format("Vaga %d: \n " , vaga.getNumero()));
            for(Object veiculo : vaga.getVeiculos()) {
            /*
                Descobre o tipo do objeto
                Converte ela para ter acesso aos métodos
                
                Utiliza eles
                
                - Desafio: reduzir quantidade de IFs, 
                    passando a resposabilidade para a classe veiculo
            */
                if(veiculo instanceof Bicicleta) {
                    Bicicleta bike = (Bicicleta)veiculo;
                    
                    System.out.println(String.format(
                        "Cor: %s \nqtdLugar: %d \nMarcha: %s\n\n",
                        bike.getCor(), bike.getQtdLugar(), bike.isMarcha()));
                }
                if(veiculo instanceof Carro) {
                    Carro carro = (Carro)veiculo;
                    
                    System.out.println(String.format(
                        "Cor: %s \nqtdLugar: %d \nModelo/ano: %s/%d\n\n",
                        carro.getCor(), carro.getQtdLugar(), carro.getModelo(), carro.getAno()));
                }
                if(veiculo instanceof Motocicleta) {
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
