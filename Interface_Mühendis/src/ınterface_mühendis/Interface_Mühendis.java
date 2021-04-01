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
public class Interface_Mühendis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PcMuhendis pc = new PcMuhendis(false,false);
        
        pc.adli_sicil_sorgula();
        pc.askerlik_durum_sorgula();
        System.out.println(pc.mezuniyet_ortalama(3.11));
        
        String[] tecrübe = {"Vestel","Arçelik"};
        pc.iş_tecrübesi(tecrübe);
        
        
    }
    
}
