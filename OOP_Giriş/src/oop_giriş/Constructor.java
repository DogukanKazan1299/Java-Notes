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
public class Constructor {
    
    
    private String ad;
    private String soyad;
    private String hesap_numarasi;
    private int bakiye;
    
    
    public Constructor(){
        System.out.println("EKRANA BOŞ CONSTRUCTOR GELİR");
        
        
    }
    public Constructor(String ad,String soyad,String hesap_numarasi,int bakiye){
        this.ad=ad;
        this.soyad=soyad;
        this.hesap_numarasi=hesap_numarasi;
        this.bakiye=bakiye;
    }
    public Constructor(String ad,String soyad){//---->İÇ İÇE CONSTRUCTOR KULLANIMI /
        
        this(ad,soyad,"Bilgi yok",0);
        
    }

    
    public void bilgileri_goster(){
        System.out.println("AD = " +this.ad);
        System.out.println("SOYAD = " +this.soyad);
        System.out.println("HESAP NUMARASI = " +this.hesap_numarasi);
        System.out.println("BAKİYE: " +this.bakiye);
    }
    
    
    
    public void para_cek(int miktar){
        
        if(miktar>bakiye){
            System.out.println("Hesabınızda bu kadar para yoktur..");
        }
        if(miktar>2000){
            System.out.println("Bir günde max 2000TL çekebilirsiniz");
        }
        else{
            bakiye = bakiye-miktar;
            System.out.println("Güncel bakiyeniz = " + bakiye);
        }
        
    }
    
    
    
    
    
    
    public void para_yatir(int miktar){
        
        bakiye = bakiye + miktar;
        System.out.println("Güncel bakiyeniz = " + bakiye);
        
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getHesap_numarasi() {
        return hesap_numarasi;
    }

    public void setHesap_numarasi(String hesap_numarasi) {
        this.hesap_numarasi = hesap_numarasi;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
    
    
    
    
    
    
}
