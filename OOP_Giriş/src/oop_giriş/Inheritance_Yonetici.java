/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_giriş;

/**
 *
 * @author dkzn1
 */
public class Inheritance_Yonetici extends Inheritance_Çalışan {
    
    private int sorumlu_kisi_sayisi;
    
    public Inheritance_Yonetici(String isim,int maas,String departman,int sorumlu_kisi_sayisi){
        super(isim,maas,departman);
        this.sorumlu_kisi_sayisi=sorumlu_kisi_sayisi;
    }
    public void bilgileri_goster(){
        super.bilgileri_goster();
        System.out.println("Sorumlu olduğu kişi sayısı = " + sorumlu_kisi_sayisi);
    }
}
