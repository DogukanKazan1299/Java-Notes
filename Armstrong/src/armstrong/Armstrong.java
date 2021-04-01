/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armstrong;

import java.util.Scanner;

/**
 *
 * @author dkzn1
 */
public class Armstrong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi = s.nextInt();
        
        System.out.println("Basamak sayısını giriniz");
        int basamak=s.nextInt();
        
        int gecici=sayi;
        int toplam = 0;
        
        do{
            
            int basamak_degeri = gecici%10;
            gecici /= 10;
            
            toplam +=Math.pow(basamak_degeri,basamak);
            
            
        }while(gecici>0);
        
        if(toplam==sayi){
            System.out.println("Sayı armstrong sayısıdır...");
        }
        else{
            System.out.println("Armstrong sayısı değildir....");
                    
        }
        
        
    }
    
}
