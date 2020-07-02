/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.estacionamento;

import hotel.veiculos.Veiculo;
import java.util.ArrayList;

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

    public ArrayList<Veiculo> getVeiculos() {
        return this.veiculos;
    }
    
    public void addVeiculo(Object veiculo) {
        this.veiculos.add((Veiculo) veiculo);
    }
    
    public int getNumero() {
        return numero;
    }
    
}
