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
public class Bicicleta extends Veiculo {
    private boolean marcha;
    public Bicicleta(String cor){
        super(cor, 1);
        this.marcha = false;
    }


    public boolean isMarcha() {
        return marcha;
    }

    public void setMarcha(boolean marcha) {
        this.marcha = marcha;
    }
    
}
