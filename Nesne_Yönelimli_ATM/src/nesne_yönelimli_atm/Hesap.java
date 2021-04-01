/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesne_yönelimli_atm;

/**
 *
 * @author dkzn1
 */
public class Hesap {
    
    private String kullanici_adi;
    private String parola;
    private int bakiye;

    public Hesap(String kullanici_adi, String parola, int bakiye) {
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
        this.bakiye = bakiye;
    }
    
    public void paraCek(int tutar){
        if(tutar>bakiye){
            System.out.println("Yeterli bakiye YOK");
        }
        else{
            bakiye -=tutar;
        }
    }
    
    public void ParaYatir(int tutar){
        bakiye += tutar;
        System.out.println("Yeni bakiyeniz = " +bakiye);
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
    
    
    
}
