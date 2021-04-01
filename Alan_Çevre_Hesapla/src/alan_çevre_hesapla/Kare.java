/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alan_çevre_hesapla;

/**
 *
 * @author dkzn1
 */
public class Kare {
    private int kenar;

    public Kare(int kenar) {
        this.kenar = kenar;
    }

    public int getKenar() {
        return kenar;
    }

    public void setKenar(int kenar) {
        this.kenar = kenar;
    }
    
    public int kare_alan_hesapla(){
        return kenar*kenar;
    }
    
    public int kare_cevre_hesapla(){
        return kenar*4;
    }
    
}
