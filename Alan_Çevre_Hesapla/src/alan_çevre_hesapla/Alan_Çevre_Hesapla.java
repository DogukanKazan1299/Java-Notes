/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alan_çevre_hesapla;

/**
 *
 * @author dkzn1
 */
public class Alan_Çevre_Hesapla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kare k = new Kare(5);
        
        System.out.println("KARENİN ALANI = " + k.kare_alan_hesapla());
        
        System.out.println("KARENİN ÇEVRESİ = " +k.kare_cevre_hesapla());
               
        Üçgen üçgen = new Üçgen(5, 10, 7, 5);
        
        System.out.println("Üçgenin çevresi = " + üçgen.üçgen_çevre_hesapla());
        System.out.println("Üçgenin alanı = " + üçgen.üçgen_alan_hesapla());
        
        
        
    }
    
}
