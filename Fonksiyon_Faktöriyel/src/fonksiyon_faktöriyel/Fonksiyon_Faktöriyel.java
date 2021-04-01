/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fonksiyon_faktöriyel;

import java.util.Scanner;

/**
 *
 * @author dkzn1
 */
public class Fonksiyon_Faktöriyel {

    public static void faktoriyel(){
        
        Scanner s = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi=s.nextInt();
        
        int f=1;
        for(int i=1; i<=sayi; i++){
            f=f*i;
            
        }
        System.out.println("Sonuç = " + f);
        
        
    }
    public static void main(String[] args) {
        faktoriyel();
       
    }
    
}
