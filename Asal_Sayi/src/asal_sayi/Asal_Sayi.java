/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asal_sayi;

import java.util.Scanner;

/**
 *
 * @author dkzn1
 */
public class Asal_Sayi {
    
    public static boolean asal(int sayi){
        for(int i=2; i<=sayi; i++){
            if(sayi%i==0){
                return false;
            }
        }
        return true;
    }

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        for(int i=2; i<=1000; i++){
            if(asal(i)){
                System.out.println(i);
            }
        }
        
        
    }
    
}
