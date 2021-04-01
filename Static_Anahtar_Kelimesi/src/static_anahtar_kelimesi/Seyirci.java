/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package static_anahtar_kelimesi;

/**
 *
 * @author dkzn1
 */
public class Seyirci {
    
    private String isim;
    
    private static int seyirci_sayısı = 0;//---->static olarak tanımlandığı için sadece objeye değil class a bağlı da kullanılır....

    public Seyirci(String isim) {
        this.isim = isim;
        seyirci_sayısı++;
    }
    
    
    public static int getSeyirci_Sayisi(){
        return seyirci_sayısı;
    }
    
    

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public void oyun_seyret(){
        System.out.println(getIsim() + " oyun seyrediyor...");
    }
    
}
