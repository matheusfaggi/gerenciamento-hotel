/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamento.hotel;

import Testes.*;



/**
 *
 * @author matheusfaggi
 */
public class GerenciamentoHotel {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Roda seeds do estacionamento (Veiculos, Vaga)
          new TesteEstacionamento();

//        new TesteHospedagem();
    }
}
