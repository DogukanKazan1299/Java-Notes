/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread_oluştur;

/**
 *
 * @author dkzn1
 */
public class Thread_oluştur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Printer p = new Printer("nesne1");
        Printer p1 = new Printer("nesne2");
        Printer p2 = new Printer("nesne3");
        
        p.start();
        p1.start();
        p2.start();
        
        System.out.println("Thread oluşturduk...");
        
        
    }
    
}
