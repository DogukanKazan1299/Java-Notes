/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread_oluştur;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dkzn1
 */
public class Printer extends Thread{

    private String isim;

    public Printer(String isim) {
        this.isim = isim;
    }
    
    
    
    @Override
    public void run() {
        System.out.println(isim + " Çalışıyor...");
        
        for(int i=1; i<=10; i++){
            
            try {
                System.out.println(isim + " çalışıyor" + i);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Hata verdi...");
            }
            
        }
        
    }
    
    
    
}
