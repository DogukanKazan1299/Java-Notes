/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package static_anahtar_kelimesi;

/**
 *
 * @author dkzn1
 */
public class Static_Anahtar_Kelimesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Seyirci a = new Seyirci("Doğukan");
        Seyirci b = new Seyirci("Kadir");

        System.out.println("Seyirci sayısı = " + Seyirci.getSeyirci_Sayisi());

    }

}
