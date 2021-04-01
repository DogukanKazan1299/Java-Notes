/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idman_programı;

/**
 *
 * @author dkzn1
 */
public class Idman {

    private int burpee_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;

    public Idman(int burpee_sayisi, int pushup_sayisi, int situp_sayisi, int squat_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
        this.pushup_sayisi = pushup_sayisi;
        this.situp_sayisi = situp_sayisi;
        this.squat_sayisi = squat_sayisi;
    }
    
    public void hareketYap(String hareket_turu,int sayi){
        
        if(hareket_turu.equals("burpee")){
            burpeeYap(sayi);
        }
        else if(hareket_turu.equals("pushup")){
            pushupYap(sayi);
        }
        else if(hareket_turu.equals("situp")){
            situpYap(sayi);
        }
        else if(hareket_turu.equals("squat")){
            squatYap(sayi);
        }
        else{
            System.out.println("Geçersiz Hareket");
        }
    }
    
    public void burpeeYap(int sayi){
        if(burpee_sayisi - sayi <0){
            System.out.println("Hedefinin üzerinde burpee yaptın.Tebrikler");
            burpee_sayisi=0;
            System.out.println("Kalan burpee sayisi = " + burpee_sayisi);
        }
        if(burpee_sayisi==0){
            System.out.println("Günlük hedefini tamamladın.");
            System.out.println("KALAN BURPEE = "+burpee_sayisi);
        }
        else{
            burpee_sayisi-=sayi;
            System.out.println("Yapmanız gereken burpee sayısı = " + burpee_sayisi);
        }
    }
    public void pushupYap(int sayi){
        if(pushup_sayisi - sayi <0){
            System.out.println("Hedefinin üzerinde burpee yaptın.Tebrikler");
            pushup_sayisi=0;
            System.out.println("Kalan pushup sayisi = " + pushup_sayisi);
        }
        if(pushup_sayisi==0){
            System.out.println("Günlük hedefini tamamladın.");
            System.out.println("KALAN PUSHUP = "+pushup_sayisi);
        }
        else{
            pushup_sayisi-=sayi;
            System.out.println("Yapmanız gereken pushup sayısı = " + pushup_sayisi);
        }
    }
    
    
    public void situpYap(int sayi){
        if(situp_sayisi - sayi <0){
            System.out.println("Hedefinin üzerinde burpee yaptın.Tebrikler");
            situp_sayisi=0;
            System.out.println("Kalan situp sayisi = " + situp_sayisi);
        }
        if(situp_sayisi==0){
            System.out.println("Günlük hedefini tamamladın.");
            System.out.println("KALAN SITUP = "+situp_sayisi);
        }
        else{
            situp_sayisi-=sayi;
            System.out.println("Yapmanız gereken situp_sayisi  = " + situp_sayisi);
        }
    }
    
    
    public void squatYap(int sayi){
        if(squat_sayisi - sayi <0){
            System.out.println("Hedefinin üzerinde squat yaptın.Tebrikler");
            squat_sayisi=0;
            System.out.println("Kalan squat sayisi = " + squat_sayisi);
        }
        if(squat_sayisi==0){
            System.out.println("Günlük hedefini tamamladın.");
            System.out.println("KALAN SQUAT = "+squat_sayisi);
        }
        else{
            squat_sayisi -= sayi;
            System.out.println("Yapmanız gereken squat_sayisi  = " + squat_sayisi);
        }
    }
    
    public boolean idmanbittimi(){
        return (burpee_sayisi==0) && (pushup_sayisi==0) && (situp_sayisi==0) && (squat_sayisi==0);
    }
    
    
    
    public int getBurpee_sayisi() {
        return burpee_sayisi;
    }

    public void setBurpee_sayisi(int burpee_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
    }

    public int getPushup_sayisi() {
        return pushup_sayisi;
    }

    public void setPushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

    public int getSitup_sayisi() {
        return situp_sayisi;
    }

    public void setSitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }

    public int getSquat_sayisi() {
        return squat_sayisi;
    }

    public void setSquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }

}
