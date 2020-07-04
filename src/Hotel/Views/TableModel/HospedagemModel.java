/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel.Views.TableModel;

/**
 *
 * @author matheusfaggi
 */
public class HospedagemModel {
    private String nome, descricao;
    private int diarias;
    private float totalPagar, valorDiaria;
    private int id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDiarias() {
        return diarias;
    }

    public void setDiarias(int diarias) {
        this.diarias = diarias;
    }

    public float getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(float totalPagar) {
        this.totalPagar = totalPagar;
    }

    public float getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public int getId() {
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
}
