/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic_nedir;

/**
 *
 * @author dkzn1
 */
public class Generic_Nedir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Character[] char_dizi = {'J','A','V','A'};
        Integer[] int_dizi = {1,2,3,4,5};
        String[] string_dizi = {"Java","c#","c","python"};
        
        Yazdır<Character> yazdır_char = new Yazdır<Character>();
        yazdır_char.yazdır(char_dizi);
        
        Yazdır<Integer> yazdır_int = new Yazdır<Integer>();
        yazdır_int.yazdır(int_dizi);
        
        Yazdır<String> yazdır_string = new Yazdır<String>();
        yazdır_string.yazdır(string_dizi);
        
        
        
        
    }
    
}
