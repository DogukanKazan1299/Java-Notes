/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gelişmiş_not_hesaplama;

import java.util.Scanner;

/**
 *
 * @author dkzn1
 */
public class Gelişmiş_Not_Hesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        int vize;
        int final_notu;
        System.out.println("Vize notunuzu giriniz");
        vize=s.nextInt();
        System.out.println("Final notunuzu giriniz");
        final_notu=s.nextInt();
        
        int ortalama;
        ortalama=((vize*4)/10) + ((final_notu*6)/10);
        System.out.println("Ortalamanız = " + ortalama);
        
        if(ortalama>=90){
            System.out.println("Harf notunuz == AA");
        }
        else if(ortalama<90 && ortalama>=84){
             System.out.println("Harf notunuz == BA");
        }
        else if(ortalama<84 && ortalama>=76){
             System.out.println("Harf notunuz == BB");
        }
        else if(ortalama<76 && ortalama>=68){
             System.out.println("Harf notunuz == CB");
        }
        else if(ortalama<68 && ortalama>=60){
             System.out.println("Harf notunuz == CC");
        }
        else if(ortalama<60 && ortalama>=50){
            System.out.println("DC");
        }
        else{
            System.out.println("HARF NOTUNUZ FF KALDINIZ");
        }
        
        
        
        
        
        
    }
    
}
