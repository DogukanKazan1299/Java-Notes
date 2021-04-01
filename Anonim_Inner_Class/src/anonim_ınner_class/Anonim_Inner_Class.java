/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonim_ınner_class;

/**
 *
 * @author dkzn1
 */
public class Anonim_Inner_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IOğrenci a = new IOğrenci() {
            @Override
            public void ders_çalış() {
                System.out.println("Ders çalışıyorum");
            }

            @Override
            public void derse_gir() {
                System.out.println("Derse giriyorum..");
            }
        };
        a.ders_çalış();
        a.derse_gir();
        
        
        Abstract_Öğrenci b = new Abstract_Öğrenci() {
            @Override
            void kayıt_yaptır() {
                System.out.println("Kayıt yapılıyor...");
            }
        };
        b.kayıt_yaptır();
        b.selamla();
        
        
        
    }
    
}
