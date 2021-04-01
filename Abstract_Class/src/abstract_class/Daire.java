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
public class Daire extends Şekil{
    
    private int yarıçap;
    
    public Daire(String isim,int yarıçap) {
        super(isim);
        this.yarıçap=yarıçap;
    }

    @Override
    void alan_hesapla() {
        System.out.println("Daire Alanı = " + (Math.PI * yarıçap * yarıçap));
    }
    
}
