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
public class Daire extends Şekil{
    private int yarıçap;
    public Daire(String isim,int yarıçap) {
        super(isim);
        this.yarıçap=yarıçap;
    }

    @Override
    public void alan_hesapla() {
        System.out.println(getIsim() + " ın alanı =" + (Math.PI * yarıçap * yarıçap));
    }
    
}
