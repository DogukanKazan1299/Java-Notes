package kuyruk_ramazan_pidesi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Kuyruk_Ramazan_Pidesi {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("RAMAZAN PİDESİ KUYRUĞU...");
        
        Random r = new Random();
        
        Queue<String> ramazan_pidesi = new LinkedList<String>();
        
        ramazan_pidesi.offer("Murat");
        ramazan_pidesi.offer("Hasan");
        ramazan_pidesi.offer("Okan");
        ramazan_pidesi.offer("Ayşe");
        ramazan_pidesi.offer("Merve");
        ramazan_pidesi.offer("Ezgi");
        ramazan_pidesi.offer("Gizem");
        ramazan_pidesi.offer("Mehmet");
        ramazan_pidesi.offer("Oğuz");
        ramazan_pidesi.offer("Azer");
        
        int pide_sayisi = 1 + r.nextInt(10);
        
        System.out.println("Pideler çıkıyor...");
        System.out.println("Çıkan pide sayısı = " + pide_sayisi);
        
        Thread.sleep(3000);
        
        while(pide_sayisi != 0){
            
            System.out.println(ramazan_pidesi.poll() + " pideyi aldı");
            pide_sayisi--;
            Thread.sleep(1000);
            
        }
        System.out.println("Pide kalmadı...");
        
       
         
        
    }
    
}
