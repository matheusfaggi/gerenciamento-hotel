/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamento.hotel;

/**
 *
 * @author matheusfaggi
 */
public class Veiculo {
    private int qtdLugar;
    private String cor;
    
    public Veiculo(){
        
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
    
    public Veiculo(String cor, int qtdLugar){
        this.setCor(cor);
        this.setQtdLugar(qtdLugar);
    }
}

