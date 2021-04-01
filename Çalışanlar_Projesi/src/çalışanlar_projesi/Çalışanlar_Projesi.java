/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package çalışanlar_projesi;

import java.util.Scanner;

/**
 *
 * @author dkzn1
 */
public class Çalışanlar_Projesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        System.out.println("ÇALIŞANLAR PROJESİNE HOŞGELDİNİZ...");
        String işlemler="1:Yazılımcı İşlemleri\n2:Yönetici İşlemleri\nÇıkış için q ' ya basınız";
        System.out.println(işlemler);
        
        while(true){
            
            System.out.println("Hangi işlemi yapmak istiyorsunuz?");
            String işlem = s.nextLine();
            
            if(işlem.equals("q")){
                System.out.println("Programdan ÇIKILIYOR...");
                break;
            }
            else if(işlem.equals("1")){
                Yazilimci yazilimci = new Yazilimci("Doğukan","Kazan",15,"Java,c#,sql");
                String y_işlem="1.Format At\n2:Bilgiler\nÇıkış için q' ya basın...";
                
                System.out.println(y_işlem);
                
                while(true){
                    System.out.println("YAZILIMCI İŞLEMLERİ:- BİR İŞLEM SEÇİNİZ");
                    String yazılımcı_işlem = s.nextLine();
                    if(yazılımcı_işlem.equals("q")){
                        System.out.println("ÇIKIŞ YAPILDI");
                        break;
                    }
                    else if(yazılımcı_işlem.equals("1")){
                        System.out.println("İşletim sistemi  ");
                        String işletim_sistemi = s.nextLine();
                        yazilimci.formatAt(işletim_sistemi);
                        
                    }
                    else if(yazılımcı_işlem.equals("2")){
                        yazilimci.bilgileri_goster();
                    }
                    else{
                        System.out.println("Yazılımcı için Geçersiz işlem...");
                    }
                }
                
                
            }
            
            else if(işlem.equals("2")){
                Yonetici yonetici = new Yonetici("Yusuf", "Algün", 1, 50);
                
                String yonetici_islem = "Yönetici İşlemleri\n"
                                        + "1. Zam Yap\n"
                                        + "2. Bilgileri GÖSTER\n"
                                        + "Çıkış için q'ya basın";
                System.out.println(yonetici_islem);
                
                while(true){
                    System.out.println("Bir yönetici işlemi seçiniz");
                    String yönetici_işlemi = s.nextLine();
                    
                    if(yönetici_işlemi.equals("q")){
                        System.out.println("Yönetici işlemlerinden çıkılıyor");
                        break;
                    }
                    else if(yönetici_işlemi.equals("1")){
                        System.out.println("Yönetici zam yapacaktır...Ne kadar yapsın?");
                        int zam_miktarı = s.nextInt();
                        s.nextLine();
                        yonetici.zamYap(zam_miktarı);
                        
                    }
                    else if(yönetici_işlemi.equals("2")){
                        yonetici.bilgileri_goster();
                        
                    }
                    else{
                        System.out.println("Hatalı Yönetici işlem seçimi");
                    }
                }
            }
            else{
                System.out.println("Hatalı işlem seçtiniz");
            }
            
            
            
            
        }
        
        
        
        
    }
    
}
