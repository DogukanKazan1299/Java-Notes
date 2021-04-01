/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package şarkıcılar_projesi;

import java.util.ArrayList;

/**
 *
 * @author dkzn1
 */
public class Şarkıcılar {
    
    ArrayList<String> şarkıcı_listesi = new ArrayList<String>();
    
    public void şarkıcıları_bastır(){
        System.out.println("Şarkıcı Listesinde " + şarkıcı_listesi.size() + " kadar şarkıcı var");
        
        for(int i=0; i<şarkıcı_listesi.size(); i++){
            System.out.println((i+1)+ ". şarkıcı " + şarkıcı_listesi.get(i));
        }
        
    }
    
    public void şarkıcı_ekle(String isim){
        
        şarkıcı_listesi.add(isim);
        System.out.println("Şarkıcı Listesi Güncellendi..");
        
    }
    
    public void şarkıcı_güncelle(String yeni_isim,int id){
        şarkıcı_listesi.set(id, yeni_isim);
        System.out.println("Şarkıcı Listesi Güncellendi");
    }
    
    public void şarkıcı_sil(int id){
        String isim = şarkıcı_listesi.get(id);
        şarkıcı_listesi.remove(id);
        System.out.println(isim + " isimli şarkıcı listeden silindi..");
                
    }
    public void şarkıcı_ara(String şarkıcı_ismi){
        int id = şarkıcı_ismi.indexOf(şarkıcı_ismi);
        
        if(id>=0){
            System.out.println("Şarkıcı Bulundu..");
            System.out.println(şarkıcı_ismi + " isimli şarkıcı" + (id + 1) + " .id de") ;
        }
        else{
            System.out.println("Şarkıcı bulunamadı..."); 
                   
        }
    }
    
}
