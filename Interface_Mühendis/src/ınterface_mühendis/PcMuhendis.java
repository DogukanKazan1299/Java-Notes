/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınterface_mühendis;

/**
 *
 * @author dkzn1
 */
public class PcMuhendis implements IMuhendis{
    
    private boolean askerlik;
    private boolean adli_sicil;

    public PcMuhendis(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }
    
    @Override
    public void askerlik_durum_sorgula() {
        if(askerlik){
            System.out.println("Askerlik Yaptım");
        }
        else{
            System.out.println("Askerlik yapmadım");
        }
    }

    @Override
    public String mezuniyet_ortalama(double derece) {
        
        return "Ortalamam =" + derece;
    }

    @Override
    public void adli_sicil_sorgula() {
        if(adli_sicil){
            System.out.println("Adli sicil kaydım vardır");
        }else{
            System.out.println("Adli sicil kaydım yoktur");
        }
    }

    @Override
    public void iş_tecrübesi(String[] array) {
        System.out.println("Çalıştığım şirketler...");
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    
    
    
}
