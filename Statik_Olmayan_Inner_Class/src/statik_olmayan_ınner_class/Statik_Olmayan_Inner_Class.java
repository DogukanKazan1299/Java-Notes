/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statik_olmayan_ınner_class;

/**
 *
 * @author dkzn1
 */
public class Statik_Olmayan_Inner_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Matematik.Faktöriyel mf = new Matematik().new Faktöriyel();
        Matematik.Asal ma = new Matematik().new Asal();
        Matematik.Alan m_alan = new Matematik().new Alan();
        mf.faktöriyel_hesapla();
        System.out.println("Girilen sayı asal mı ? = " + ma.asal_mı(19));
        m_alan.daire_alan(3);
        
        
        
        
    }
    
}
