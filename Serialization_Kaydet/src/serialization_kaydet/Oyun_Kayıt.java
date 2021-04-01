
package serialization_kaydet;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Oyun_Kayıt {
    
    public static void oyunKaydet(Kart[][] kartlar){
        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("kayit.bin"))){
            System.out.println("Oyun Kaydediliyor...");
            out.writeObject(kartlar);
        } catch (IOException ex) {
            Logger.getLogger(Oyun_Kayıt.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public static Kart[][] kayittanAl(){
        
       try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("kayit.bin"))){
            
           Kart[][] cikti = (Kart[][]) in.readObject();
           
           return cikti;
           
            
        } catch (IOException ex) {
            Logger.getLogger(Oyun_Kayıt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Oyun_Kayıt.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        return null;
    }
    
    
    
    
}
