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
public class Composition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Resolution resolution = new Resolution(1920,1080);
        Monitor monitor = new Monitor("VS197DE", "ASUS", "18.5", resolution);
        
        Kasa kasa = new Kasa("Shadow Blade", "Shadow", "Temperli Cam");
        Anakart anakart = new Anakart("b250-PRO", "ASUS", 10, "Windows 10");
        
        Bilgisayar pc = new Bilgisayar(anakart, monitor, kasa);
        
        pc.getKasa().bilgisayarı_aç();
        pc.getMonitor().monitoru_kapat();
        
        
        
    }
    
}
