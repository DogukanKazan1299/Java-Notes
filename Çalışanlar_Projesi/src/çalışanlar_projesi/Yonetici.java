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
public class Yonetici extends Çalışan{
    
    private int sorumlu_kisi_sayisi;

    public Yonetici(String ad, String soyad, int id,int sorumlu_kisi_sayisi) {
        super(ad, soyad, id);
        this.sorumlu_kisi_sayisi=sorumlu_kisi_sayisi;
    }

    @Override
    public void bilgileri_goster() {
        super.bilgileri_goster(); 
        System.out.println("Yöneticinin sorumlu olduğu kişi sayısı = " + sorumlu_kisi_sayisi);
    }
    
    
    public void zamYap(int zamMiktarı){
        System.out.println(getAd() + " çalışanlara" +zamMiktarı + " kadar zam yapıyor..." );
    }
    
    
    
}
