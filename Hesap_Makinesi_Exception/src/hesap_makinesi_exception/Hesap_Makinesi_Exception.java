package hesap_makinesi_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Hesap_Makinesi_Exception {

    
    public static void main(String[] args) {
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
        
        try{
        
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
        catch(InputMismatchException e){
            System.out.println("Inputları doğru giriniz");
        }
        catch(ArithmeticException e){
            System.out.println("Bir sayı 0'a bölünemez..");
        }
        
        
        
    }
    
}
