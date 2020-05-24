/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import hospedagem.Hospedagem;
import hospedagem.Quarto;
import hospedagem.Reserva;
import hospedagem.TipoQuarto;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import pessoa.Cliente;
import pessoa.Recepcionista;
import pessoa.Pessoa;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
/**
 *
 * @author matheusfaggi
 */
public class TesteHospedagem {
    public TesteHospedagem(){
        
        Recepcionista recep = new Recepcionista("Moquidésia da Silva");
        
        Cliente cliente = new Cliente("Hitchcook");
        Cliente cliente2 = new Cliente("Scully");
        
        List<Pessoa> pessoas = new <Pessoa> ArrayList(Arrays.asList(recep, cliente, cliente2));
        
//        for(Pessoa pessoa : pessoas){
//            if(pessoa instanceof Cliente){
//                
//            }
//        }
        
        
        TipoQuarto presidencial =  new TipoQuarto("Quarto maravilhoso, chave dms", 3);
        TipoQuarto master =  new TipoQuarto("Quarto chave dms, maravilhoso", 4);
        
        Quarto quarto1 = new Quarto(presidencial, 200);
        Quarto quarto2 = new Quarto(presidencial, 200);
        Quarto quarto3 = new Quarto(master, 400);
        
        List <Quarto> quartos = new <Quarto> ArrayList(Arrays.asList(quarto1, quarto2, quarto3));
        
        System.out.println("--------QUARTOS--------");
        for(Quarto quarto : quartos ){
            System.out.println(String.format("Descrição: %s \nQuantidade de camas: %s \nValor diária: R$ %.2f\n\n", 
                    quarto.getTipoQuarto().getDescricao(), quarto.getTipoQuarto().getQtdCamas(),
                    quarto.getValorDiaria()));
        }
        
        
        Reserva reserva =  new Reserva();
        try{
            reserva = new Reserva(new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2020"), 
                            new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2020"),
                            cliente, recep, quarto1);
        }catch(ParseException e){
            System.out.println("Erro!!");
            System.out.println(e.getLocalizedMessage());
        }
        
       
        
        new Hospedagem(cliente, quarto1); 
    }
}
