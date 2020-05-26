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
    private Set<Veiculo> veiculos;
    
    public Pessoa(){
        
    }
    public Pessoa(String nome) throws PessoaException{
        if(!nome.matches("^[ a-zA-Z]*$") || nome.trim().equals(""))
            throw new PessoaException("Caracter(es) inválidos, ou nome vazio");
        this.nome = nome;
        veiculos = new HashSet<Veiculo>();
    }
    
    public String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;    
    }
    
    public void addVeiculo(Veiculo veiculo){
        this.veiculos.add(veiculo);
    }
    
}
