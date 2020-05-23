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
public class Vaga {
    private final int numero;
    private ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
    
    
    public Vaga(int numero){
        this.numero = numero;
    }

    public Object[] getVeiculos() {
        return this.veiculos.toArray();
    }
    
    public void addVeiculo(Object veiculo) {
        System.out.println(veiculo instanceof Veiculo);
        this.veiculos.add((Veiculo) veiculo);
    }
    
    public int getNumero() {
        return numero;
    }
    
}
