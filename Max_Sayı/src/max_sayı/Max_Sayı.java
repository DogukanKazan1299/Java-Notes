/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package max_sayı;

import java.util.Scanner;

/**
 *
 * @author dkzn1
 */
public class Max_Sayı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
        
        int a,b,c;
        System.out.println("a sayisini giriniz");
        a=s.nextInt();
        System.out.println("b sayisini giriniz");
        b=s.nextInt();
        System.out.println("c sayisini giriniz");
        c=s.nextInt();
        
        if(a>b && a>c){
            System.out.println("En büyük sayı a =" + a);
        }
        else if(b>a && b>c){
            System.out.println("En büyüğü b " + b);
        }
        else if(c>a && c>b){
            System.out.println("En büyük sayı c dir" + c);
        }
        
        
        
        
        
    }
    
}
