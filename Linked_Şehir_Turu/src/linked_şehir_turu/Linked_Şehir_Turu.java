/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked_şehir_turu;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author dkzn1
 */
public class Linked_Şehir_Turu {

    public static void işlemleri_bastır(){
        System.out.println("0-->İşlemleri Görüntüle");
        System.out.println("1-->Bir sonraki şehre git");
        System.out.println("2-->Bir önceki şehre git");
        System.out.println("3-->Uygulamadan ÇIK");
    }
    
    
    public static void şehirleri_turla(LinkedList<String> sehirler){
        
        ListIterator<String> iterator = sehirler.listIterator();
        
        int işlem;
        
        işlemleri_bastır();
        
        Scanner s = new Scanner(System.in);
        
        if(!iterator.hasNext()){
            System.out.println("Herhangi bir şehir bulunmuyor...");
        }
        boolean çıkış = false;
        boolean ileri = true;
        
        while(!çıkış){
            System.out.println("Bir işlem seçiniz");
            işlem = s.nextInt();
            
            switch(işlem){
                case 0:
                    işlemleri_bastır();
                    break;
                case 1:
                    
                    if(!ileri){
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                    }
                    
                    
                    if(iterator.hasNext()){
                        System.out.println("Şehre gidiliyor : " + iterator.next());
                                
                    }
                    else{
                        System.out.println("Gidilecek şehir kalmadı...");
                        ileri = true;
                    }
                    break;
                case 2:
                    
                    if(ileri){
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                        ileri = false;
                    }
                    
                    if(iterator.hasPrevious()){
                        System.out.println("Şehre gidiliyor : " + iterator.previous());
                    }
                    else{
                        System.out.println("Şehir turu başladı..");
                    }
                    break;
                case 3:
                    çıkış = true;
                    System.out.println("Uygulamadan çıkılıyor");
                    break;
                   
            }
                   
        }
        
    }
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> sehirler = new LinkedList<String>();
        
        sehirler.add("Ankara");
        sehirler.add("Eskişehir");
        sehirler.add("Afyon");
        
        şehirleri_turla(sehirler);
        
        
    }
    
}
