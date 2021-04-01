/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesne_yönelimli_atm;

import java.util.Scanner;

/**
 *
 * @author dkzn1
 */
public class ATM {
    
    public void calis(Hesap hesap){
        Login login = new Login();
        Scanner s = new Scanner(System.in);
        
        System.out.println("Bankamıza Hoşgeldiniz...");
        System.out.println("-------------------------");
        System.out.println("KULLANICI GİRİŞ EKRANI");
        int giris_hakki=3;
        
        while(true){
            if(login.login(hesap)){
                System.out.println("BAŞARILI GİRİŞ");
                break;
            }
            else{
                System.out.println("GİRİŞ BAŞARISIZ");
                giris_hakki -=1;
                System.out.println("Kalan Giriş Hakkınız = " + giris_hakki);
            }
            if(giris_hakki==0){
                System.out.println("GİRİŞ hakkınız KALMADI....");
                return;
            }
        }
        
        System.out.println("-------------------------------");
        String islemler="1:Bakiye Görüntüle\n2:Para Yatırma\n3:Para Çek\nÇıkış için q ' ya basın";
        System.out.println(islemler);
        
        
        while(true){
            
            System.out.println("İŞLEM SEÇİNİZ");
            String islem = s.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else if(islem.equals("1")){
                System.out.println("BAKİYENİZ = " +hesap.getBakiye());
            }
            else if(islem.equals("2")){
                System.out.println("Ne kadar yatıracaksınız ? ");
                int tutar = s.nextInt();
                s.nextLine();
                hesap.ParaYatir(tutar);
            }
            else if(islem.equals("3")){
                System.out.println("Çekilecek miktarı giriniz");
                int miktar = s.nextInt();
                s.nextLine();
                hesap.paraCek(miktar);
            }
            else{
                System.out.println("Geçersiz İŞLEM SEÇTİNİZ...");
            }
            
            
        }
        
    }
    
}
