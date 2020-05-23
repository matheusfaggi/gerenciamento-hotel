/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculos;

/**
 *
 * @author matheusfaggi
 */
public class Carro extends Veiculo {
    private int ano;
    private String modelo;
    
    public Carro(Object dono, String cor, int qtdLugares) {
        super(dono, cor, qtdLugares);
    }
    
    public Carro(Object dono, String cor){
        super(dono ,cor);
    }
    
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
