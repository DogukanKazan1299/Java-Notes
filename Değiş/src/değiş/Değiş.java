/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package değiş;

import java.util.Scanner;

/**
 *
 * @author dkzn1
 */
public class Değiş {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        int a,b;
        System.out.println("İki sayı giriniz");
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("A değeriniz" + a);
        System.out.println("B değeriniz" + b);
        
        
        a=a+b;
        b=a-b;
        a=a-b;
        
        System.out.println("Yeni A değeriniz = " + a);
        System.out.println("Yeni B değeriniz = " + b);
        
        
        
    }
    
}
