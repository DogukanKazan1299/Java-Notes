/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_class;

/**
 *
 * @author dkzn1
 */
public abstract class Şekil {//abstract class oluşturuldu
    private String isim;

    public Şekil(String isim) {
        this.isim = isim;
    }

    public void ismini_söyle(){//metod
        System.out.println("Bu obje" + getIsim() + " objesidir");
    }
    
    abstract void alan_hesapla();//abstract method
    
    
    
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    
    
}
