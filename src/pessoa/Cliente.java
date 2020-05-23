/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;
import java.time.LocalDate;

/**
 *
 * @author matheusfaggi
 */
public class Cliente extends Pessoa{
    private String email;
    private LocalDate ultimaHospedagem;
    
    public Cliente(String nome) {
        super(nome);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getUltimaHospedagem() {
        return ultimaHospedagem;
    }

    public void setUltimaHospedagem(LocalDate ultimaHospedagem) {
        this.ultimaHospedagem = ultimaHospedagem;
    }
    
}
