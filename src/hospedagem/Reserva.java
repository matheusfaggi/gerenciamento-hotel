/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospedagem;

import java.util.Date;
import pessoa.Cliente;
import pessoa.Recepcionista;

/**
 *
 * @author matheusfaggi
 */
public  class Reserva {
    private Date entrada, saida;
    private boolean utilizada;
    private Cliente cliente;
    private Recepcionista recepcionista;
    private Quarto quarto;

    
    
    public Reserva(){
        this.utilizada = false;
    }
    
    public Reserva(Date entrada, Date saida, Cliente cliente, Recepcionista recepcionista, Quarto quarto) {
        this.utilizada = false;
        
        this.setCliente(cliente);
        cliente.addReserva(this);
        
        this.setQuarto(quarto);
        this.setRecepcionista(recepcionista);
        
        this.setEntrada(entrada);
        this.setSaida(saida);
    }
    
    public Recepcionista getRecepcionista() {
        return recepcionista;
    }

    public void setRecepcionista(Recepcionista recepcionista) {
        this.recepcionista = recepcionista;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }
    
    public Date getEntrada() {
        return entrada;
    }

    private void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Date getSaida() {
        return saida;
    }
    private void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    private void setSaida(Date saida) {
        this.saida = saida;
    }

    public boolean isUtilizada() {
        return utilizada;
    }

    public void setUtilizada() { 
       this.utilizada = true;
    }
    
    
}
