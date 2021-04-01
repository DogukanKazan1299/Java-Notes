/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package şarkıcılar_projesi;

import java.util.Scanner;

/**
 *
 * @author dkzn1
 */
public class Şarkıcılar_Projesi {
    
    private static Şarkıcılar şarkıcılar = new Şarkıcılar();
    private static Scanner s = new Scanner(System.in);
    
    public static void işlemleri_bastır(){
        System.out.println("0:İşlemleri Görüntüle");
        System.out.println("1:Şarkıcıları Görüntüle");
        System.out.println("2:Şarkıcı Ekle");
        System.out.println("3:Şarkıcı Güncelle");
        System.out.println("4:Şarkıcı Sil");
        System.out.println("5:Şarkıcı Ara");
        System.out.println("6:Uygulamadan ÇIK");
    }
    
    public static void şarkıcı_görüntüle(){
        şarkıcılar.şarkıcıları_bastır();
    }
    public static void şarkıcı_ekle(){
        System.out.println("EKLEMEK İSTEDİĞİNİZ ŞARKICININ ADINI GİRİN");
        
        String isim = s.nextLine();
        şarkıcılar.şarkıcı_ekle(isim);
    }
    
    public static void şarkıcı_güncelle(){
        System.out.println("Güncellemek istediğin id...(1,2,3...)");
        
        int id = s.nextInt();
        s.nextLine();
        
        String yeni_isim = s.nextLine();
        şarkıcılar.şarkıcı_güncelle(yeni_isim, id - 1);
    }
    
    public static void sil(){
        System.out.println("Silmek istediğiniz id(1,2,3....)");
        
        int id = s.nextInt();
        şarkıcılar.şarkıcı_sil(id-1);
    }
    
    public static void ara(){
        System.out.println("Aramak istediğiniz şarkıcıyı giriniz");
        String isim = s.nextLine();
        şarkıcılar.şarkıcı_ara(isim);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ŞARKICI UYGULAMASINA HOŞGELDİNİZ...");
        
        işlemleri_bastır();
        
        boolean çıkış = false;
        
        int işlem;
        
        while(!çıkış){
            System.out.println("Bir işlem seçiniz");
            işlem = s.nextInt();
            s.nextLine();
            
            switch(işlem){
                case 0:{
                    işlemleri_bastır();
                    break;
                }
                case 1:{
                    şarkıcı_görüntüle();
                    break;
                }
                case 2:{
                    şarkıcı_ekle();
                    break;
                }
                case 3:{
                    şarkıcı_güncelle();
                    break;
                }
                case 4:{
                    sil();
                    break;
                }
                case 5:{
                    ara();
                    break;
                }
                case 6:{
                    çıkış = true;
                    System.out.println("Uygulamadan Çıkılıyor...");
                    break;
                }
            }
        }
        
    }
    
}
