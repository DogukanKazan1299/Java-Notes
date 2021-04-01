/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematik_fizik_problemleri;

/**
 *
 * @author dkzn1
 */
public class Problem {
    
    public static class Matematik{
        
        public static void daire_alan(int yarıçap){
            System.out.println("Daire alanı = " +(Math.PI * yarıçap * yarıçap));
        }
        
        public static void üçgen_çevre(int k1,int k2,int k3){
            System.out.println("Üçgen Çevresi = " + (k1+k2+k3));
        }
        
        
    }
    public static class Fizik{
        
        public static void iç_çarpım(Vec v1,Vec v2){
            int iççarpım = v1.getI() * v2.getI() +v1.getJ() * v2.getJ() + v1.getK() * v2.getK();
            System.out.println(v1.getIsim() + " ile" + v2.getIsim() + " in iç çarpımı = " + iççarpım);
        }
        
        
    }
    
}
