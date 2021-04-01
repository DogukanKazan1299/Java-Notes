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
public class Kare extends Şekil{
    private int kenar;
    public Kare(String isim,int kenar) {
        super(isim);
        this.kenar = kenar;
    }

    @Override
    public void alan_hesapla() {
        System.out.println(getIsim() + " ın alanı = " + (kenar*kenar));
        
        
    }
    
}
