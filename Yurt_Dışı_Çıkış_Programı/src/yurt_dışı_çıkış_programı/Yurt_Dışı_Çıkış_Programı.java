
package yurt_dışı_çıkış_programı;

public class Yurt_Dışı_Çıkış_Programı {

    
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Havalimanına Hoşgeldiniz");
        
        String şartlar = "Yurtdışına Çıkış Şartları...\n"
                +"Harç ücreti ödenmelidir\nSiyasi bir yasak olmamalıdır\nVizenizin geçerli olması gerekir\n";
        
        String mesaj = "Yurt dışına çıkma şartlarını yerine getirmeniz gerekmektedir...";
        
        while(true){
            
            
            System.out.println("-----------------");
            System.out.println(şartlar);
            
            Yolcu yolcu = new Yolcu();
            
            System.out.println("Harç ödemeniz kontrol ediliyor...");
            Thread.sleep(3000);//bekletme ver
            
            if(yolcu.yurt_dışı_harcı_kontrol()==false){
                System.out.println(mesaj);
                break;
            }
            System.out.println("Siyasi Yasak Kontrolü yapılıyor");
            Thread.sleep(3000);
            if(yolcu.siyasi_yasak_kontrol()==false){
                System.out.println(mesaj);
                break;
            }
            System.out.println("Vize durumu kontrol ediliyor");
            Thread.sleep(3000);
            
            if(yolcu.vize_durumu_kontrol()==false){
                System.out.println(mesaj);
                break;
            }
            System.out.println("İşlemleriniz Tamam | Yurt dışına çıkabilirsiniz...");
            break;
            
            
            
        }
        
    }
    
}
