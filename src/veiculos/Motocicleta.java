/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculos;
/**
 *
 * @author matheusfaggi
 */
public class Motocicleta extends Veiculo {
    private int cilindrada;
    
    public Motocicleta(Object dono, String cor, int qtdLugares){
        super(dono, cor, qtdLugares);
    }
    
    public Motocicleta(Object dono, String cor){
        super(dono, cor);
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
