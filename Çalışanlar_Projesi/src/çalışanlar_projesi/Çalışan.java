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
public class Çalışan {
    
    private String ad;
    private String soyad;
    private int id;

    
    public void bilgileri_goster(){
        System.out.println("ÇALIŞAN BİLGİLERİ...");
        System.out.println("AD : " + ad);
        System.out.println("SOYAD : " +soyad);
        System.out.println("id = " + id);
    }
    
    
    
    
    
    public Çalışan(String ad, String soyad, int id) {
        this.ad = ad;
        this.soyad = soyad;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
    
    
}
