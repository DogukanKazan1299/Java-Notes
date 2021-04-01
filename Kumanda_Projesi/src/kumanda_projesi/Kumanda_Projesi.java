package kumanda_projesi;

import java.util.Scanner;

public class Kumanda_Projesi {

    public static void main(String[] args) {
       
        System.out.println("Kumanda Programına Hoşgeldiniz");
        
        Scanner s = new Scanner(System.in);
        
        String işlemler = "İşlemler\n1:Kanalları Göster\n2:Kanal Ekle\n3:Kanal Sil\n4:Kanal Sayısı Öğren\nÇıkış için q'ya basın";

        Kumanda kumanda = new Kumanda();
        
        while(true){
            
            System.out.println(işlemler);
            System.out.println("--------------");
            System.out.println("Bir işlem seçiniz");
            String işlem = s.nextLine();
            
            if(işlem.equals("q")){
                System.out.println("Programdan çıkılıyor....");
                break;
            }
            else if(işlem.equals("1")){
                kanallarıGoster(kumanda);
                
            }
            else if(işlem.equals("2")){
                System.out.println("Eklenecek olan kanal adını giriniz");
                String kanalAd = s.nextLine();
                kumanda.kanalEkle(kanalAd);
            }
            else if(işlem.equals("3")){
                System.out.println("Silinecek olan kanal adını yazınız");
                String kanalAd = s.nextLine();
                kumanda.kanalSil(kanalAd);
            }
            else if(işlem.equals("4")){
                
                System.out.println("Kanal Sayısı = " + kumanda.kanalSayisi());
                
            }
            else {
                System.out.println("Hatalı seçim yaptınız.TEKRAR DENEYİN");
            }
            
        }
        
        
    }
    
    
    
    public static void kanallarıGoster(Kumanda kumanda){
        
        if(kumanda.kanalSayisi()==0){
            System.out.println("Şu anda hiç kanal yok..");
        }
        else{
            for(String kanal : kumanda){
                System.out.println("Kanallar "+kanal);
            }
        }
        
        
    }
    
}
