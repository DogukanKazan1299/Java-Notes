/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hesap_makinesi_overloading;

import java.util.Scanner;

/**
 *
 * @author dkzn1
 */
public class Hesap_Makinesi_Overloading {

    public static int toplama(int a, int b) {
        return a + b;
    }

    public static int toplama(int a, int b, int c) {
        return a + b + c;
    }

    public static int çıkarma(int a, int b) {
        return a - b;
    }

    public static int çarpma(int a, int b) {
        return a * b;
    }

    public static int çarpma(int a, int b, int c) {
        return a * b * c;
    }

    public static int bolme(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String islemler = "1.Toplama İşlemi\n2.Çıkarma\n3.Çarpma\n4.Bölme\nq";
        System.out.println("--------------------------------");
        System.out.println(islemler);
        System.out.println("-----------------------------------");

        while (true) {

            System.out.println("İşlem seçiniz");
            String islem = s.nextLine();

            if (islem.equals("1")) {
                System.out.println("Toplama işlemini seçtiniz");
                System.out.println("Kaç değer toplayacaksınız?(2--3)");
                int kacsayi = s.nextInt();

                if (kacsayi == 2) {
                    System.out.println("ilk değer: ");
                    int a = s.nextInt();
                    System.out.println("İkinci değer");
                    int b = s.nextInt();
                    System.out.println("Sonuç" + toplama(a, b));
                } else if (kacsayi == 3) {
                    System.out.println("ilk değer: ");
                    int a = s.nextInt();
                    System.out.println("İkinci değer");
                    int b = s.nextInt();
                    System.out.println("Üçüncü değer");
                    int c = s.nextInt();
                    System.out.println("Sonuç" + toplama(a, b, c));
                }
            } else if (islem.equals("2")) {
                System.out.println("ÇIKARMA İŞLEMİ");
                System.out.println("ilk değer: ");
                int a = s.nextInt();
                System.out.println("İkinci değer");
                int b = s.nextInt();
                System.out.println("Sonuç" + çıkarma(a, b));
            } else if (islem.equals("3")) {
                System.out.println("ÇARPMA İŞLEMİ");
                System.out.println("Kaç değer ÇARPACAKSIN?(2--3)");
                int kacsayi = s.nextInt();

                if (kacsayi == 2) {
                    System.out.println("ilk değer: ");
                    int a = s.nextInt();
                    System.out.println("İkinci değer");
                    int b = s.nextInt();
                    System.out.println("Sonuç" + çarpma(a, b));
                } else if (kacsayi == 3) {
                    System.out.println("ilk değer: ");
                    int a = s.nextInt();
                    System.out.println("İkinci değer");
                    int b = s.nextInt();
                    System.out.println("Üçüncü değer");
                    int c = s.nextInt();
                    System.out.println("Sonuç" + çarpma(a, b, c));
                }
            } else if (islem.equals("4")) {
                System.out.println("BÖLME İŞLEMİ");
                int a = s.nextInt();
                System.out.println("İkinci değer");
                int b = s.nextInt();
                System.out.println("Sonuç" + bolme(a, b));
            }
            else if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor");
                break;
            }
            else{
                System.out.println("Hatalı SEÇİM...");
               
            }

        }

    }

}
