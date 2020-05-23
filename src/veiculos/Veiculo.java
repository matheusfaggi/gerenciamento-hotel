/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculos;
import pessoa.*;

/**
 *
 * @author matheusfaggi
 */
public  class Veiculo {
    private int qtdLugar;
    private String cor;
    private Pessoa dono;
    
    public Veiculo(Object dono, String cor, int qtdLugar) {
        this.setCor(cor);
        this.setQtdLugar(qtdLugar);
        this.setDono(dono);

    }
    
    public Veiculo(Object dono, String cor){
        // Um veiculo no minimo leva uma pessoa (Bicicleta)
        int defaultQtdLugar = 1;
        
        if (this instanceof Motocicleta) defaultQtdLugar = 2;
        if (this instanceof Carro) defaultQtdLugar = 5;
        
        this.setQtdLugar(defaultQtdLugar);
        this.setCor(cor);
        this.setDono(dono);
    }

    public String getNomeDono() {
        return this.dono.getNome();
    }
    
    private void setDono(Object dono){
        this.dono = (Pessoa) dono;
        if(dono instanceof Pessoa) this.dono.addCarro(this);
    }

    public Pessoa getDono() {
        return dono;
    }
    
    public int getQtdLugar() {
        return qtdLugar;
    }

    private void setQtdLugar(int qtdLugar) {
        this.qtdLugar = qtdLugar;
    }

    public String getCor() {
        return cor;
    }

    private void setCor(String cor) {
        this.cor = cor;
    }
    
}

