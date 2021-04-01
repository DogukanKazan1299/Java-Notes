/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_geometrik_şekil;

import java.util.Scanner;

/**
 *
 * @author dkzn1
 */
public class Abstract_Geometrik_Şekil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);

        String işlemler = "1:Karenin alanı\n2:Üçgenin Alanı\n3:Dairenin Alanı\nÇıkış için q'ya basın\n";

        while (true) {
            System.out.println(işlemler);
            System.out.println("Hangi işlemi yapmak istersiniz?");
            String şekil_türü = s.nextLine();
            Şekil şekil = null;

            if (şekil_türü.equals("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;
            } else if (şekil_türü.equals("1")) {
                System.out.println("Karenin kenarını giriniz");
                int kenar = s.nextInt();
                s.nextLine();
                şekil = new Kare("Kare", kenar);
                şekil.alan_hesapla();
            } else if (şekil_türü.equals("2")) {
                System.out.println("Kenar 1 : ");
                int kenar1 = s.nextInt();
                System.out.println("Kenar 2 : ");
                int kenar2 = s.nextInt();
                System.out.println("Kenar 3 : ");
                int kenar3 = s.nextInt();
                s.nextLine();

                şekil = new Üçgen("Üçgen", kenar1, kenar2, kenar3);
                şekil.alan_hesapla();
            } else if (şekil_türü.equals("3")) {
                System.out.println("Dairenin yarıçapını giriniz");
                int yarıçap = s.nextInt();
                s.nextLine();
                şekil = new Daire("Daire", yarıçap);
                şekil.alan_hesapla();
            }else{
                System.out.println("Geçersiz İşlem...");
            }

        }

    }

}
