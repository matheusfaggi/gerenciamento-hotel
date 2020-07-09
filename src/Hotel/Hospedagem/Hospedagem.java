/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel.Hospedagem;

import java.sql.Date;
import Hotel.Pessoa.Cliente;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author matheusfaggi
 */
public class Hospedagem {
    private Date entrada, saida;
    private Reserva reserva;
    private Cliente cliente;
    private Quarto quarto;
    private TipoQuarto tipoQuarto;
    private int clienteid;
    private int quartoid;
    private int funcionarioid;

    public Hospedagem(Date entrada, Date saida, int a, int b, int i) {
        this.setEntrada(entrada);
        this.setSaida(saida);
        this.quartoid(a);
        this.clienteid(b);
        this.funcionarioid(i);
        
        
    }

    public int getClienteid() {
        return clienteid;
    }

    public void setClienteid(int clienteid) {
        this.clienteid = clienteid;
    }

    public int getQuartoid() {
        return quartoid;
    }

    public void setQuartoid(int quartoid) {
        this.quartoid = quartoid;
    }

    public int getFuncionarioid() {
        return funcionarioid;
    }

    public void setFuncionarioid(int funcionarioid) {
        this.funcionarioid = funcionarioid;
    }
    
    

    public Hospedagem(Cliente cliente, Quarto quarto, Date entrada, Date saida) {
        this.setCliente(cliente);
        cliente.addHospedagem(this);
        
        this.setEntrada(entrada);
        this.setSaida(saida);
        
        this.setQuarto(quarto);
    }
    
    public Hospedagem(Cliente cliente, Quarto quarto, Reserva reserva) {
        reserva.setUtilizada();
        this.setReserva(reserva);
        
        this.setCliente(cliente);
        cliente.addHospedagem(this);
        
        this.setQuarto(quarto);
    }
    public Hospedagem() {
        
    }

 
    
    public float getTotalPagar(){
        long diferencaEmMs = Math.abs(saida.getTime() - entrada.getTime());
        long dias = TimeUnit.DAYS.convert(diferencaEmMs, TimeUnit.MILLISECONDS);
        
        return this.quarto.getValorDiaria() * dias;
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
        this.setEntrada(reserva.getEntrada());
        this.setSaida(reserva.getSaida());
        
        this.reserva = reserva;
    }
    
    public Date getEntrada() {
        return entrada;
    }
    
    public String getEntradaFormatada(){
        return this.entrada.toString();
    }
    

    private void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public TipoQuarto getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(TipoQuarto tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public Date getSaida() {
        return saida;
    }

    private void setSaida(Date saida) {
        this.saida = saida;
    }

    private void clienteid(int b) {
        this.clienteid = b;
    }

    private void quartoid(int a) {
        this.quartoid = a;
    }

    private void funcionarioid(int i) {
        this.funcionarioid = i;
    }
    
    
}
