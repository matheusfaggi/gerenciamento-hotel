/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

import java.util.ArrayList;
import java.util.Collection;
import veiculos.*;

    
/**
 *
 * @author matheusfaggi
 */
public class Vaga {
    private final int numero;
    private ArrayList<Object> veiculos = new ArrayList<Object>();
    
    
    public Vaga(int numero){
        
        this.numero = numero;
    }

    public Object[] getVeiculos() {
        return this.veiculos.toArray();
    }

    public void addCarro (Carro carro) {
        this.veiculos.add(carro);
    }
    
    public void addBicicleta(Bicicleta bicicleta){
        this.veiculos.add(bicicleta);
    }
    
    public void addMotocicleta(Motocicleta moto){
        this.veiculos.add(moto);
    }
    
    public int getNumero() {
        return numero;
    }
    
    
    
}
