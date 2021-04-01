/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_list;

import java.util.ArrayList;

/**
 *
 * @author dkzn1
 */
public class Array_List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> a = new ArrayList<String>();
        
        a.add("Doğukan Kazan");
        a.add("Yusuf Algün");
        a.add("Onur Aslan");
        a.add("Numan Mum");
        a.add("Mustafa Ateş");
        
        
        System.out.println("ARRAYLIST BOYUT = " + a.size());
        
        System.out.println("ARRAYLISTTE ELEMAN GETİRME =" + a.get(2));
        
        System.out.println("ELEMAN GÜNCELLEME İŞLEMİ...");
        
        a.set(0,"Alper Algül");
        
        for(int i=0; i<a.size(); i++){
            System.out.println(a.get(i));
        }
        
        
        
        
        //System.out.println("ELEMAN SİLME ---------");
       /* a.remove(3);
        for(int i = 0; i<a.size(); i++){
            System.out.println(a.get(i));
        }*/
        
        
        /*for(int i=0; i<a.size(); i++){
            System.out.println(a.get(i));
        }*/
                
        
        
        
    }
    
}
