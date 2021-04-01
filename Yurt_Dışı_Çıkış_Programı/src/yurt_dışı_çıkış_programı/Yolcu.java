/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yurt_dışı_çıkış_programı;

import java.util.Scanner;

/**
 *
 * @author dkzn1
 */
public class Yolcu implements YurtDışıKuralları {

    private int harç;
    private boolean siyasi_yasak;
    private boolean vize_durumu;
    
    public Yolcu(){
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Yatırdığınız Harç Bedeli : ");
        this.harç = s.nextInt();
        s.nextLine();
        
        
        System.out.println("Herhangi bir siyasi yasağınız var mı?(evet / hayır)");
        String cevap = s.nextLine();
        
        if(cevap.equals("evet")){
            this.siyasi_yasak=true;
                    
        }
        else{
            this.siyasi_yasak=false;
        }
        System.out.println("Vizeniz bulunuyor mu?(evet / hayır)");
        String cevap2 = s.nextLine();
        
        if(cevap2.equals("evet")){
            this.vize_durumu = true;
        }
        else{
            this.vize_durumu=false;
        }
        
    }
    
    

    @Override
    public boolean yurt_dışı_harcı_kontrol() {
        if(this.harç<15){
            System.out.println("Lütfen harcınızı tam yatırın");
            return false;
        }
        else{
            System.out.println("Harç işleminiz tamamlandı..");
            return true;
        }
    }

    @Override
    public boolean siyasi_yasak_kontrol() {
        if(this.siyasi_yasak==true){
            System.out.println("Siyasi yasak sebebiyle yurtdışına gidemezsiniz");
            return false;
        }else{
            System.out.println("Siyasi yasağınız yoktur.");
            return true;
        }
    }

    @Override
    public boolean vize_durumu_kontrol() {
        if(this.vize_durumu==true){
            System.out.println("Vize sorununuz yoktur..");
            return true;
        }
        else{
            System.out.println("Vizede sorun var");
            return false;
        }
    }

}
