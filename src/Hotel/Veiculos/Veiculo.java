/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel.Veiculos;
import Hotel.Pessoa.Pessoa;

/**
 *
 * @author matheusfaggi
 */
public class Veiculo {
    private int qtdLugar;
    private String cor, placa, modelo;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNomeDono() {
        return this.dono.getNome();
    }
    
    private void setDono(Object dono){
        this.dono = (Pessoa) dono;
        if(dono instanceof Pessoa) this.dono.addVeiculo(this);
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

