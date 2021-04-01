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
public class Constructor2 {
    
    private String marka;
    private int yil;
    private int tekerlek;
    private String model;

    
    public Constructor2(){
        System.out.println("Boş çağırılan constructor...");
    }
    
    public Constructor2(String marka,int yil,int tekerlek,String model){
        this.marka=marka;
        this.yil=yil;
        this.tekerlek=tekerlek;
        this.model=model;
    }
    
    public Constructor2(String marka,int yil){
        this(marka, yil,0,"BİLGİ YOK");
    }
    public void bilgiler(){
        System.out.println("ARAÇ MARKASI = " +this.marka);
        System.out.println("ÇIKIŞ YILI = " +this.yil);
        System.out.println("TEKERLEK SAYISI = " + this.tekerlek);
        System.out.println("ARAÇ MODELİ = " + this.model);
    }
    
    
    
    
    
    
    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public int getTekerlek() {
        return tekerlek;
    }

    public void setTekerlek(int tekerlek) {
        this.tekerlek = tekerlek;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    
    
    
    
    
    
    
    
}
