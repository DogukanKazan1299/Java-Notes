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
public class Monitor {
    
    private String model;
    private String üretici;
    private String boyut;
    private Resolution resolution;//Composition

    public Monitor(String model, String üretici, String boyut, Resolution resolution) {
        this.model = model;
        this.üretici = üretici;
        this.boyut = boyut;
        this.resolution = resolution;
    }
    
    public void monitoru_kapat(){
        System.out.println("Monitör kapatılıyor...");
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

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
    
    
    
    
    
    
}
