/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematik_fizik_problemleri;

import java.util.Scanner;

/**
 *
 * @author dkzn1
 */
public class Matematik_Fizik_Problemleri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        System.out.println("Matematik ve Fizik problemleri programına hoşgeldiniz...");
        
        String işlemler = "İşlemler ekranı\n1:Daire alanı hesapla\n2:Üçgen çevresi hesapla\n3:2 vektörün iç çarpımını hesapla\nÇıkış : q";
        
        while(true){
               
              System.out.println(işlemler);
              System.out.println("Bir işlem seçiniz");
              String işlem = s.nextLine();
              
              if(işlem.equals("q")){
                  System.out.println("Program kapanıyor...");
                  break;
              }
              else if(işlem.equals("1")){
                  System.out.println("Daire alanı hesaplama alanı");
                  System.out.println("Daire yarıçapını giriniz");
                  int r = s.nextInt();
                  s.nextLine();
                  
                  Problem.Matematik.daire_alan(r);
              }
              else if(işlem.equals("2")){
                  System.out.println("Üçgen çevresi hesaplama ekranı");
                  System.out.println("Kenar 1:");
                  int k1 = s.nextInt();
                  System.out.println("Kenar 2:");
                  int k2 = s.nextInt();
                  System.out.println("Kenar 3:");
                  int k3 = s.nextInt();
                  s.nextLine();
                  
                  Problem.Matematik.üçgen_çevre(k1, k2, k3);
              }
              else if(işlem.equals("3")){
                  System.out.println("2 vektörün iç çarpımı hesaplama ekranı");
                  Vec v1 = new Vec("Vektör1");
                  Vec v2 = new Vec("Vektör 2");
                  
                  Problem.Fizik.iç_çarpım(v1, v2);
              }else{
                  System.out.println("Geçersiz İşlem..");
              }
        
        
        
    }
    
}
}
