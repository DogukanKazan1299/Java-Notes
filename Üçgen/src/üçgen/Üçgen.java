/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package üçgen;


import java.util.Scanner;

/**
 *
 * @author dkzn1
 */
public class Üçgen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Kısa kenarı giriniz");
        int kısakenar=s.nextInt();
        System.out.println("Uzun kenarı giriniz");
        int uzunkenar=s.nextInt();
        
        double hipotenüs = Math.sqrt(kısakenar*kısakenar + uzunkenar*uzunkenar);
        System.out.println("Hipotenüs değeri = " + hipotenüs);
        
        
        
    }
    
}
