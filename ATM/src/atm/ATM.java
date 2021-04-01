/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.util.Scanner;

/**
 *
 * @author dkzn1
 */
public class ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
        int bakiye=1000;
        
        String islemler="1.Bakiye Görüntüle\n"+"2.Para Çek\n"+"3.Para Yatır\n"+
                "4:Çıkış için q ' ya basınız";
        
        System.out.println("------------------------------------");
        System.out.println(islemler);
        System.out.println("------------------------------------");
        
        while(true){
            
            System.out.println("Yapmak istediğiniz işlemi seçiniz");
            String islem = s.nextLine();
            
            if(islem.equals("1")){
                System.out.println("Bakiyeniz = " + bakiye);
            }
            else if(islem.equals("2")){
                System.out.println("Para çekme ekranı\nNe kadar çekeceksiniz?");
                int cek=s.nextInt();
                if(cek>bakiye){
                    System.out.println("Yetersiz bakiye");
                    break;
                }
                bakiye-=cek;
                System.out.println("Kalan bakiyeniz = " + bakiye);
            }
            else if(islem.equals("3")){
                System.out.println("Para yatırma ekranı\nNe kadar para yatıracaksınız?");
                int yatir=s.nextInt();
                bakiye+=yatir;
                System.out.println("Yeni bakiyeniz = " + bakiye);
            }
            else if(islem.equals("q")){
                System.out.println("Program sonlandırılıyor...");
                break;
            }
            
            
            
        }
        
        
        
        
    }
    
}
