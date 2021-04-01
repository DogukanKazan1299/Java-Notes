/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_giriş;

/**
 *
 * @author dkzn1
 */
public class OOP_Giriş {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //1.ALAN--->OOP GİRİŞ ALANI
        /*Araba araba1 = new Araba();
        araba1.marka="Ferrari";
        araba1.renk="Kırmızı";
        araba1.teker_sayisi=4;
        araba1.yil=2017;
        
        System.out.println(araba1.marka);
        System.out.println(araba1.renk);
         */
        //2.ALAN--->ENCAPSULATION ALANI
        /* Encapsulation e = new Encapsulation();
        e.setMarka("Porsche");
        System.out.println("ARAÇ MARKASI = "+e.getMarka());
        
        e.setKapi_sayisi(-5);
        System.out.println("KAPI SAYISI = "+e.getKapi_sayisi());
        
         */
         /*     
        
        //3.ALAN --->CONSTRUCTOR....
        //Constructor c = new Constructor();--->Boş gelecek constructor...
        Constructor c1 = new Constructor("Doğukan", "Kazan", "DOKO123HESAP", 1000);
        System.out.println("Kişinin adı = " + c1.getAd() + " Soyadı= " +c1.getSoyad()+ " Hesap numarası = " +c1.getHesap_numarasi() + " Bakiyesi = " + c1.getBakiye());
         */
         
         /*
         //4.ALAN --->İÇ İÇE CONSTRUCTOR KULLANILDI...
         Constructor c1 = new Constructor("Yeni", "Kişi");
         c1.bilgileri_goster();
         */
         
         /*
         Constructor2 c = new Constructor2("Ferrari",2000);
         c.bilgiler();
        */
         
         
         //5.ALAN -->INHERITANCE(KALITIM....)
         Inheritance_Yonetici y = new Inheritance_Yonetici("Doğukan",2000, "IT",15);
         y.bilgileri_goster();
         
         
         
    }

}
