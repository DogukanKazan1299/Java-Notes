/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bedenkitleındeksi;

import java.util.Scanner;

/**
 *
 * @author dkzn1
 */
public class BedenKitleIndeksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        System.out.println("Boy değerini giriniz");
        double boy=s.nextDouble();
        System.out.println("Kilonuzu giriniz");
        int kilo=s.nextInt();
        
        double beden=kilo / (boy*boy);
        System.out.println("Beden kitle indeksi = " + beden);
        
        
    }
    
}
