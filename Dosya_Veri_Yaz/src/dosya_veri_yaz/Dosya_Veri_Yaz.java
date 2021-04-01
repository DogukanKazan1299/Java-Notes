/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosya_veri_yaz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dkzn1
 */
public class Dosya_Veri_Yaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileOutputStream fos = null;
        
       try{
           fos = new FileOutputStream("dosya.txt",true);
           String s = "Dogukan Kazan";
           byte[] s_array = s.getBytes();
           fos.write(s_array);
       }
       catch(FileNotFoundException e){
           System.out.println("Filenotfoundexception....");
       } catch (IOException ex) {
            Logger.getLogger(Dosya_Veri_Yaz.class.getName()).log(Level.SEVERE, null, ex);
        }
       finally{
            try {
                fos.close();
            } catch (IOException ex) {
                System.out.println("Dosya kapatılırken hata oluştu....");
            }
       }
        
    }
    
}
