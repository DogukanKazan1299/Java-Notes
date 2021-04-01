/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_geometrik_şekil;

/**
 *
 * @author dkzn1
 */
public abstract class Şekil {
    private String isim;

    public Şekil(String isim) {
        this.isim = isim;
    }
    
    abstract void alan_hesapla();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    
}
