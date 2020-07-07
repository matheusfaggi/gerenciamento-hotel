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
public class TipoQuarto {
    private String descricao;
    private int qtdCamas, id;

    public TipoQuarto(String descricao, int qtdCamas)throws QuartoException {
        if(qtdCamas <= 0 )
            throw new QuartoException("Um quarto tem no mínimo 1 cama.");
        this.setDescricao(descricao);
        this.setQtdCamas(qtdCamas);
    }

    public TipoQuarto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getDescricao() {
        return descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdCamas() {
        return qtdCamas;
    }

    private void setQtdCamas(int qtdCamas) {
        this.qtdCamas = qtdCamas;
    }
    
}
