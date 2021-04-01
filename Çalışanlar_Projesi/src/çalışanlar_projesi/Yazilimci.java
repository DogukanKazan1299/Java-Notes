/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package çalışanlar_projesi;

/**
 *
 * @author dkzn1
 */
public class Yazilimci extends Çalışan{
    
    private String diller;
    
    
    public Yazilimci(String ad,String soyad,int id,String diller){
        super(ad, soyad, id);
        this.diller = diller;
    }
    
    
    public void formatAt(String isletim_sistemi){
        System.out.println(getAd()+ " " + isletim_sistemi + " ni yüklüyor");
    }

    @Override
    public void bilgileri_goster() {
        super.bilgileri_goster();
        System.out.println("Yazılımcının bildiği diller  = " + diller);
    }
    
    
    
}
