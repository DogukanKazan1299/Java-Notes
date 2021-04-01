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
public class Üçgen {
    
    private int kenar1;
    private int kenar2;
    private int kenar3;
    private int yükseklik;
    
    public int üçgen_çevre_hesapla(){
        return kenar1+kenar2+kenar3;
    }
    public int üçgen_alan_hesapla(){
        return (yükseklik*kenar1) / 2;
    }
    
    
    

    public Üçgen(int kenar1, int kenar2, int kenar3, int yükseklik) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
        this.kenar3 = kenar3;
        this.yükseklik = yükseklik;
    }

    public int getKenar1() {
        return kenar1;
    }

    public void setKenar1(int kenar1) {
        this.kenar1 = kenar1;
    }

    public int getKenar2() {
        return kenar2;
    }

    public void setKenar2(int kenar2) {
        this.kenar2 = kenar2;
    }

    public int getKenar3() {
        return kenar3;
    }

    public void setKenar3(int kenar3) {
        this.kenar3 = kenar3;
    }

    public int getYükseklik() {
        return yükseklik;
    }

    public void setYükseklik(int yükseklik) {
        this.yükseklik = yükseklik;
    }
    
    
    
}
