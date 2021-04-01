/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beyblade_programı;

import java.util.Scanner;

/**
 *
 * @author dkzn1
 */
public class Beyblade_Programı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Beyblade Programına Hoşgeldiniz");
        System.out.println("Çıkış için q ' ya basınız");
        
        Scanner s = new Scanner(System.in);
        
        while(true){
            
            System.out.println("Hangi beyblade i üretmek istiyorsunuz?");
            String islem = s.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor");
                break;        
            }
            else{
                BeybladeFabrikası fabrika = new BeybladeFabrikası();
                
                Beyblade beyblade = fabrika.beyblade_üret(islem);//POLYMORPHISM....
                
                if(beyblade==null){
                    System.out.println("Geçerli bir beyblade ismi giriniz");
                }
                else{
                    beyblade.bilgileriGöster();
                    beyblade.saldır();
                    beyblade.kutsalCanavarOrtayaÇıkar();
                }
            }
            
        }
        
        
    }
    
}
