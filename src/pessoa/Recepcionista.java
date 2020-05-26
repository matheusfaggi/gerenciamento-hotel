/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

/**
 *
 * @author matheusfaggi
 */
public class Recepcionista extends Pessoa {
    private String cargo;
    
    public Recepcionista(){
        super();
    }
    public Recepcionista(String nome) throws PessoaException{
        super(nome);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
