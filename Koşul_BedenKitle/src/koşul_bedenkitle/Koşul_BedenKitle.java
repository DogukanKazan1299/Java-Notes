/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koşul_bedenkitle;

import java.util.Scanner;

/**
 *
 * @author dkzn1
 */
public class Koşul_BedenKitle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Kilonuzu giriniz");
        int kilo=s.nextInt();
        System.out.println("Boyunuzu giriniz (Örn: 1,72)");
        double boy=s.nextDouble();
        
        double beden=kilo/(boy*boy);
        System.out.println("Beden kitle indeks değeriniz = " + beden);
        
        if(beden<18.5){
            System.out.println("Zayıf");
        }
        else if(beden>=18.5 && beden<25){
            System.out.println("Normal");
        }
        else if(beden>=25 && beden<30){
            System.out.println("Fazla kilolu");
        }
        else if(beden>=30){
            System.out.println("Obez");
        }
    }
    
}
