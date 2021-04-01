package acil_servis;
//ÖNCELİK SIRALAMASI 1-APANDİSİT 2-YANIK 3-BAŞAĞRISI

import java.util.PriorityQueue;
import java.util.Queue;


public class Acil_Servis {

    public static void main(String[] args) {
        
        Queue<Hasta> acilServis = new PriorityQueue<Hasta>();
        
        acilServis.offer( new Hasta("Murat Bey","Yanık"));
        acilServis.offer( new Hasta("Okan Bey","Başağrısı"));
        acilServis.offer( new Hasta("Elif Hanım","Apandisit"));
        acilServis.offer( new Hasta("Oğuz Bey","Yanık"));
        acilServis.offer( new Hasta("Merve Hanım","Yanık"));
        acilServis.offer( new Hasta("Gizem Hanım","Apandisit"));
        
        int i = 1;
        
        while(acilServis.isEmpty() != true){
            
            System.out.println("----------------");
            System.out.println(i + " .sırada ");
            System.out.println(acilServis.poll());
            System.out.println("----------------");
            i++;
            
            
        }
        
    }
    
}
