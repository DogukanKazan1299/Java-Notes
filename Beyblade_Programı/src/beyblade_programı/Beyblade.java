/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beyblade_programı;

/**
 *
 * @author dkzn1
 */
public class Beyblade {
    private String beybladeci;
    private int dönüş_hızı;
    private int saldırı_gücü;
    
    
    public void saldır(){
        System.out.println(beybladeci + " " + saldırı_gücü + " ve" +dönüş_hızı + " ile saldırıyor" );
    }
    
    public void kutsalCanavarOrtayaÇıkar(){
        System.out.println("Bu beyblade in kutsal canavarı bulunmuyor..");
    }
    public void bilgileriGöster(){
        System.out.println("Beybladeci ismi " + beybladeci);
        System.out.println("Saldırı Gücü " + saldırı_gücü);
        System.out.println("Dönüş hızı " + dönüş_hızı);
    }
    
    
    

    public Beyblade(String beybladeci, int dönüş_hızı, int saldırı_gücü) {
        this.beybladeci = beybladeci;
        this.dönüş_hızı = dönüş_hızı;
        this.saldırı_gücü = saldırı_gücü;
    }

    public String getBeybladeci() {
        return beybladeci;
    }

    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    public int getDönüş_hızı() {
        return dönüş_hızı;
    }

    public void setDönüş_hızı(int dönüş_hızı) {
        this.dönüş_hızı = dönüş_hızı;
    }

    public int getSaldırı_gücü() {
        return saldırı_gücü;
    }

    public void setSaldırı_gücü(int saldırı_gücü) {
        this.saldırı_gücü = saldırı_gücü;
    }
    
    
    
}
