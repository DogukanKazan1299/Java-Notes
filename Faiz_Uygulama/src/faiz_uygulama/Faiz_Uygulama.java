/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faiz_uygulama;

import java.util.Scanner;

/**
 *
 * @author dkzn1
 */
public class Faiz_Uygulama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        System.out.println("Anaparanızı giriniz");
        int anapara=s.nextInt();
        System.out.println("Kaç yıl vadeli bekleteceksiniz?");
        int yıl=s.nextInt();
        
        double toplampara = anapara;
        double faiz_oranı=0.06;//YÜZDE 6 FAİZ ORANI
        
        for(int i=1; i<=yıl; i++){
            
            toplampara=(toplampara * faiz_oranı) + toplampara;
            
            System.out.println(i + ". yılda toplam para = " + toplampara);
            
        }
        
        
        
    }
    
}
