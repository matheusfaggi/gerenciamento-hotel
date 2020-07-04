/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel.Pessoa;
import Hotel.Veiculos.Veiculo;

import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author matheusfaggi
 */
public class Pessoa {
    private int id;
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

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;    
    }
    
    public void addVeiculo(Veiculo veiculo){
        this.veiculos.add(veiculo);
    }
    
}
