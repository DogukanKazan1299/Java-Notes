/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package araç;

import java.util.Scanner;

/**
 *
 * @author dkzn1
 */
public class Araç {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        System.out.println("Kaç km yol gideceksiniz?");
        int km=s.nextInt();
        System.out.println("Araç km de kaç kuruş yakıyor?");
        double kurus=s.nextDouble();
        
        
        double sonuc=km*kurus;
        System.out.println("Sonuc " + sonuc);
        
        
        
    }
    
}
