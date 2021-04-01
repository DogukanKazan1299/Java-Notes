/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

/**
 *
 * @author dkzn1
 */
public class Anakart {
    
    private String model;
    private String üretici;
    private int yuva_sayisi;
    private String işletim_sistemi;

    public Anakart(String model, String üretici, int yuva_sayisi, String işletim_sistemi) {
        this.model = model;
        this.üretici = üretici;
        this.yuva_sayisi = yuva_sayisi;
        this.işletim_sistemi = işletim_sistemi;
    }
    
    public void işletim_sistemi_yükle(String işletim_sistemi){
        this.işletim_sistemi=işletim_sistemi;
        
        System.out.println("İşletim sistemi yüklendi " + işletim_sistemi);
    }
    
    
    
    
    
    

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getÜretici() {
        return üretici;
    }

    public void setÜretici(String üretici) {
        this.üretici = üretici;
    }

    public int getYuva_sayisi() {
        return yuva_sayisi;
    }

    public void setYuva_sayisi(int yuva_sayisi) {
        this.yuva_sayisi = yuva_sayisi;
    }

    public String getIşletim_sistemi() {
        return işletim_sistemi;
    }

    public void setIşletim_sistemi(String işletim_sistemi) {
        this.işletim_sistemi = işletim_sistemi;
    }
    
    
    
    
}
