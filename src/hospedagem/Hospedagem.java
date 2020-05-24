/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospedagem;

import java.util.Date;
import pessoa.Cliente;

/**
 *
 * @author matheusfaggi
 */
public class Hospedagem {
    private Date entrada, saida;
    private Reserva reserva;
    private Cliente cliente;
    private Quarto quarto;
    

    public Hospedagem(Cliente cliente, Quarto quarto) {
        
    }
    
    public Hospedagem(Cliente cliente, Quarto quarto, Reserva reserva) {
        reserva.setUtilizada();
        this.setReserva(reserva);
        
        this.setCliente(cliente);
        cliente.addHospedagem(this);
        
        this.setQuarto(quarto);
    }

    public Reserva getReserva() {
        return reserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    private void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    private void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }
    
    private void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    
    public Date getEntrada() {
        return entrada;
    }
    
    public String getEntradaFormatada(){
        return this.entrada.toString();
    }
    

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Date getSaida() {
        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }
    
    
}
