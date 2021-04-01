/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kullanıcı_giriş;

import java.util.Scanner;

/**
 *
 * @author dkzn1
 */
public class Kullanıcı_Giriş {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        int giris_hakki=3;
        
        String kullanıcı_girisi="Dogukan Kazan";
        String parola="12345";
        
        System.out.println("-----------------------------");
        System.out.println("Kullanıcı Giriş EKRANINA GELDİNİZ");
        System.out.println("-----------------------------");
        
        
        while(true){
            
            System.out.println("Kullanıcı Adı:");
            String kullanıcı=s.nextLine();
            System.out.println("Parola");
            String k_parola=s.nextLine();
                   
            if(kullanıcı.equals(kullanıcı_girisi) && k_parola.equals(parola)){
                System.out.println("HOŞGELDİNİZ");
                break;
            }
            else if(kullanıcı.equals(kullanıcı_girisi) && !k_parola.equals(parola)){
                System.out.println("Yanlış parola girdiniz");
                giris_hakki -=1;
            }
            else if(!kullanıcı.equals(kullanıcı_girisi) && k_parola.equals(parola)){
                System.out.println("Yanlış kullanıcı adı girdiniz");
                giris_hakki -=1;
            }
            else{
                System.out.println("Kullanıcı adı ve parolanız yanlıştır.");
                giris_hakki -=1;
            }
            if(giris_hakki==0){
                System.out.println("Giriş hakkınız doldu...");
                break;
                
            }
            
        }
        
    }
    
}
