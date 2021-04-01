/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lokal_ınner_class;

/**
 *
 * @author dkzn1
 */
public class Lokal_Inner_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        class Alan{
            
            public void daire_alan(int yarıçap){
                System.out.println("Daire alanı = " + (yarıçap * yarıçap * Math.PI));
            }
            
        }
        Alan a = new Alan();
        a.daire_alan(3);
        
        
    }
    
}
