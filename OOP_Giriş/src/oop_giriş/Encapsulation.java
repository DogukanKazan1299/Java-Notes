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
public class Encapsulation {
    
    private String marka;
    private int kapi_sayisi;
    
    public void setMarka(String marka){
        this.marka=marka;
    }
    public String getMarka(){
        return marka;
    }

    
    public int getKapi_sayisi() {
        return kapi_sayisi;
    }

   
    public void setKapi_sayisi(int kapi_sayisi) {
        
        if(kapi_sayisi<0){
            System.out.println("Kapı sayısı negatif değer alamaz");
        }
        else{
            this.kapi_sayisi=kapi_sayisi;
        }
    }
    
    
    
}
