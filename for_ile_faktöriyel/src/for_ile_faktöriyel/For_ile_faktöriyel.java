/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for_ile_faktöriyel;

import java.util.Scanner;

/**
 *
 * @author dkzn1
 */
public class For_ile_faktöriyel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);

        int a;
        System.out.println("Bir sayı giriniz");
        a = s.nextInt();
        int faktoriyel=1;
        for(int i=1; i<=a; i++){
            faktoriyel*=i;
        }
        System.out.println("Sonuç = " + faktoriyel);

    }

}
