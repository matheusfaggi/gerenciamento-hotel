/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel.Hospedagem;

/**
 *
 * @author matheusfaggi
 */
public class Quarto {
    private float valorDiaria;
    private TipoQuarto tipoQuarto;
    private String descricao;
    
    
    public Quarto(){
        
    }
    
    public Quarto(TipoQuarto tipoQuarto){
        this.setTipoQuarto(tipoQuarto);
    }
    
    public Quarto(TipoQuarto tipoQuarto, float valorDiaria){
        this.setTipoQuarto(tipoQuarto);
        this.valorDiaria = valorDiaria;
    }

    @Override
    public String toString() {
        return descricao + " - " + tipoQuarto.getDescricao();
    }
    

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public TipoQuarto getTipoQuarto() {
        return tipoQuarto;
    }

    private void setTipoQuarto(TipoQuarto tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }
    
    public float getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    
}
