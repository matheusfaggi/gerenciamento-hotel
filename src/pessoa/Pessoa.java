/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;
import veiculos.*;

import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author matheusfaggi
 */
public class Pessoa {
    private String nome;
    private Set veiculos;
    
    public Pessoa(String nome){
        this.nome = nome;
        veiculos = new HashSet();
    }
    
    public String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;    
    }
    
    public void addCarro(Object veiculo){
        this.veiculos.add(veiculo);
    }
    
}
