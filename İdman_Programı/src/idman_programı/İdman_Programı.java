/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idman_programı;

import java.util.Scanner;

/**
 *
 * @author dkzn1
 */
public class İdman_Programı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        System.out.println("İdman programına HOŞGELDİNİZ");
        
        String idmanlar="Burpee\nPushup\nSitup\nSquat";
        
        System.out.println(idmanlar);
        
        System.out.println("İdman programınızı oluşturunuz");
        
        System.out.println("Burpee sayısı :");
        int burpee = s.nextInt();
        
        System.out.println("Pushup sayısı :");
        int pushup = s.nextInt();
        
        System.out.println("Situp sayısı :");
        int situp = s.nextInt();
        
        System.out.println("Squat sayısı :");
        int squat = s.nextInt();
        
        s.nextLine();
        
        Idman idman = new  Idman(burpee, pushup, situp, squat);
        
        System.out.println("İdmanınız Başlıyor...");
        
        while(idman.idmanbittimi()== false){
            System.out.println("Hareket Türü(Burpee,Pushup,Situp,Squat)");
            String tur = s.nextLine();
            System.out.println("Bu hareketten kaç tane yapacaksınız?");
            int sayi = s.nextInt();
            s.nextLine();
            idman.hareketYap(tur, sayi);
        }
        
        System.out.println("Günlük idmanınızı tamamladınız...");
        
        
    }
    
}
