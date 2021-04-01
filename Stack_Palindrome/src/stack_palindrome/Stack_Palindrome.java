/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_palindrome;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author dkzn1
 */
public class Stack_Palindrome {

    /**
     * @param args the command line arguments
     */
    
    public static boolean palindrome(String cumle,Stack<Character> stack){
        
        for(int i=(cumle.length() / 2) + 1; i<cumle.length(); i++){
            
            if(cumle.charAt(i) != stack.pop()){
                return false;
            }
        }
        return true;
        
        
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Bir kelime ya da cümle giriniz");
        
        String cumle = s.nextLine();
        
        Stack<Character> stack = new Stack<Character>();
        
        for(int i=0; i<cumle.length() / 2; i++){
            
            stack.push(cumle.charAt(i));
            
        }
        if(palindrome(cumle, stack)){
            System.out.println("Bu cümle palindromedur...");
        }
        else{
            System.out.println("Palindrome değildir..");
        }
        
        
    }
    
}
