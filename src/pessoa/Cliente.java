/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;
import hospedagem.Hospedagem;
import hospedagem.Reserva;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
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
    
    public Cliente(String nome) {
        super(nome);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getUltimaHospedagem() {
        return ultimaHospedagem;
    }

    private void setUltimaHospedagem() {
//        System.out.println(this.hospedagens.size());
        
//        Hospedagem ultima = this.hospedagens.get();
//        this.ultimaHospedagem =  ultima.getSaida();
    }
    
    public void addHospedagem(Hospedagem hospedagem) {
        hospedagens.put(this.hospedagens.size() + 1, hospedagem);
        this.setUltimaHospedagem();
    }
    
    public void addReserva(Reserva reserva){
        this.reservas.add(reserva);
        this.setUltimaHospedagem();
    }
    
}
