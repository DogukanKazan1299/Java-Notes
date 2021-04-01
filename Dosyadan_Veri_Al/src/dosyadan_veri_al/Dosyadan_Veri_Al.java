/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosyadan_veri_al;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dkzn1
 */
public class Dosyadan_Veri_Al {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FileInputStream fis = null;
        
        try {
            fis=new FileInputStream("dosya.txt");
            int deger ;
            String s ="";
            while((deger=fis.read()) != -1){
                s += (char)deger;
            }
            System.out.println("Dosya içeriği = " + s);
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı...");
        } catch (IOException ex) {
            Logger.getLogger(Dosyadan_Veri_Al.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
