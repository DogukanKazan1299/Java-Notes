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
public class Kasa {
    
    private String model;
    private String üretici;
    private String malzeme;

    public Kasa(String model, String üretici, String malzeme) {
        this.model = model;
        this.üretici = üretici;
        this.malzeme = malzeme;
    }
    
    
    public void bilgisayarı_aç(){
        System.out.println("Bilgisayar Açılıyor...");
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

    public String getMalzeme() {
        return malzeme;
    }

    public void setMalzeme(String malzeme) {
        this.malzeme = malzeme;
    }
    
    
    
    
}
