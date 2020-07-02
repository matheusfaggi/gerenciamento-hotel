/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.pessoa;
import hotel.hospedagem.Hospedagem;
import hotel.hospedagem.Reserva;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author matheusfaggi
 */
public class Cliente extends Pessoa {
    private String email;
    private Date ultimaHospedagem;
    private final List reservas = new <Reserva> ArrayList();
    private final Map <Integer, Hospedagem> hospedagens = new <Integer, Hospedagem> HashMap();
    
    public Cliente(){
        super();
    }
    public Cliente(String nome) throws PessoaException {
        super(nome);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getUltimaHospedagem() {
        this.setUltimaHospedagem();
        return ultimaHospedagem;
    }

    private void setUltimaHospedagem() {
        Hospedagem ultima = this.hospedagens.get(this.hospedagens.size());
        this.ultimaHospedagem =  ultima.getSaida();
    }
    public ArrayList<Hospedagem> getHospedagens(){
        return new ArrayList<>(this.hospedagens.values());
    }
    
    public void addHospedagem(Hospedagem hospedagem) {
        hospedagens.put(this.hospedagens.size() + 1, hospedagem);
    }
    
    public void addReserva(Reserva reserva){
        this.reservas.add(reserva);
    }
    
}
