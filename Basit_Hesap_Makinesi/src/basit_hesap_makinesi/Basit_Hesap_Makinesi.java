/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basit_hesap_makinesi;

import java.util.Scanner;

/**
 *
 * @author dkzn1
 */
public class Basit_Hesap_Makinesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        int a,b;
        System.out.println("İlk sayıyı giriniz");
        a=s.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        b=s.nextInt();
        int sonuc;
       
        System.out.println("Bir işlem seçeceksiniz");
        System.out.println("1-toplama 2-Çıkarma 3-çarpma 4-bölme");
        int islem=s.nextInt();
        switch(islem){
            case 1:{
                System.out.println("Toplamayı seçtiniz");
                sonuc=a+b;
                System.out.println("Sonuç =" + sonuc);
                break;
            }
            case 2:{
                System.out.println("Çıkarmayı seçtiniz");
                sonuc=a-b;
                System.out.println("Sonuç =" + sonuc);
                break;
            }
            case 3:{
                System.out.println("Çarpmayı seçtiniz");
                sonuc=a*b;
                System.out.println("Sonuç =" + sonuc);
                break;
            }
            case 4:{
                System.out.println("Bölmeyi seçtiniz");
                sonuc=a/b;
                System.out.println("Sonuç =" + sonuc);
                break;
            }
            default:{
                System.out.println("Hatalı seçim yaptınız");
            }
        }
        
        
        
    }
    
}
