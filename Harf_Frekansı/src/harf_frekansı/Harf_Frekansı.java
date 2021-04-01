/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harf_frekansı;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author dkzn1
 */
public class Harf_Frekansı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TreeMap kullanıcaktır...
        
        Scanner s = new Scanner(System.in);
        System.out.println("Cümleyi giriniz");
        String cumle = s.nextLine();
        
        Map<Character,Integer> frekans = new TreeMap<Character,Integer>();
        
        for(int i = 0; i<cumle.length(); i++){
            
            char c = cumle.charAt(i);
            
            if(frekans.containsKey(c)){
                frekans.replace(c, frekans.get(c) + 1);
            }
            else{
                frekans.put(c, 1);
            }
        }
        
        
        for(Map.Entry<Character,Integer> entry:frekans.entrySet()){
            System.out.println("Karakter: "+ entry.getKey() + " -->" + entry.getValue() + " kadar geçiyor.");
        }
               
    }
    
}
