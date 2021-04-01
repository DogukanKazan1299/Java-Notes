/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package try_catch_ornek;

/**
 *
 * @author dkzn1
 */
public class NewClass {
    
    public static void main(String[] args) {
        
        try{
        
        String s = null;
        
        System.out.println(s.hashCode());
        }catch(NullPointerException e){
            System.out.println("NullPointer hatası..");
        }
        
        
    }
    
}
