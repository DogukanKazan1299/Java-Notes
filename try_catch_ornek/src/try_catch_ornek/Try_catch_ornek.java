/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package try_catch_ornek;

/**
 *
 * @author dkzn1
 */
public class Try_catch_ornek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            String s = null;
            int sayi = 30 / 0;
            
            
            System.out.println(s.hashCode());
        } 
        catch (NullPointerException e) {
            System.out.println("null referans hatası");
        }
        
        
        catch (ArithmeticException e) {
            System.out.println("Hata yakalandı sayıyı 0 ' a bölemezsin...");
        } 
        
        
        
        

    }

}
