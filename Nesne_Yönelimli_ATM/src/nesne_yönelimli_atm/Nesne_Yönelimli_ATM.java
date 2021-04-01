/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesne_yönelimli_atm;

/**
 *
 * @author dkzn1
 */
public class Nesne_Yönelimli_ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ATM atm = new ATM();
        Hesap hesap = new Hesap("Dogukan Kazan","12345", 2000);
        
        atm.calis(hesap);
        
        
    }
    
}
