/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesne_yönelimli_atm;

import java.util.Scanner;

/**
 *
 * @author dkzn1
 */
public class Login {

    public  boolean login(Hesap hesap) {

        Scanner s = new Scanner(System.in);
        String kullanici_adi;
        String parola;

        System.out.println("Kullanıcı adını giriniz");
        kullanici_adi = s.nextLine();
        System.out.println("Parolanızı giriniz");
        parola = s.nextLine();
        
        if(hesap.getKullanici_adi().equals(kullanici_adi) && hesap.getParola().equals(parola)){
            return true;
        }
        else{
            return false;
        }

    }

}
