/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafoza_oyunu;

/**
 *
 * @author dkzn1
 */
public class Kart {
    
    private char deger;
    private boolean tahmin=false;

    public Kart(char deger) {
        this.deger = deger;
    }

    public char getDeger() {
        return deger;
    }

    public void setDeger(char deger) {
        this.deger = deger;
    }

    public boolean isTahmin() {
        return tahmin;
    }

    public void setTahmin(boolean tahmin) {
        this.tahmin = tahmin;
    }
    
    
    
    
}
