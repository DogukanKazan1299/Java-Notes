/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebob;

import java.util.Scanner;

/**
 *
 * @author dkzn1
 */
public class Ebob {

    public static int EbobBulma(int sayi1,int sayi2){
        
        int ebob=1;
        
        for(int i=1; i<=sayi1 && i<=sayi2; i++){
            if((sayi1%i==0) && (sayi2%i==0)){
                ebob = i;
            }
        }
        return ebob;
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
        int sayi1,sayi2;
        System.out.println("1.sayiyi giriniz");
        sayi1=s.nextInt();
        System.out.println("2.sayiyi giriniz");
        sayi2=s.nextInt();
        
        System.out.println("İki sayının ebobu = " + EbobBulma(sayi1, sayi2));
        
    }
    
}
