/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statik_olmayan_ınner_class;

import java.util.Scanner;

/**
 *
 * @author dkzn1
 */
public class Matematik {
    
    private double PI = Math.PI;
    
    
    public class Faktöriyel{
        
        public void faktöriyel_hesapla(){
            
            Scanner s = new Scanner(System.in);
            int fak = 1;
            System.out.println("Bir sayı giriniz");
            int sayi = s.nextInt();
            
            for(int i=1; i<=sayi; i++){
                fak = fak * i;
            }
            System.out.println("Faktöriyel = " + fak);
               
        }
    }
    
    public class Asal{
        public boolean asal_mı(int sayi){
            int i = 2;
            while(i<sayi){
                if(sayi%i==0){
                    return false;
                }
                i++;
            }
            return true;
        }
    }
    
    public class Alan{
        public void daire_alan(int yarıçap){
            System.out.println("Dairenin alanı = " + (PI * yarıçap * yarıçap)); 
                   
        }
    }
    
    
    
}
