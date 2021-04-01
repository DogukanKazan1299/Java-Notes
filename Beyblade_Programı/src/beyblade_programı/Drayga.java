/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beyblade_programı;

/**
 *
 * @author dkzn1
 */
public class Drayga extends Beyblade{
    private String kutsalcanavar;

    public Drayga(String beybladeci, int dönüş_hızı, int saldırı_gücü,String kutsalcanavar) {
        super(beybladeci, dönüş_hızı, saldırı_gücü);
        this.kutsalcanavar=kutsalcanavar;
    }

    @Override
    public void bilgileriGöster() {
        super.bilgileriGöster(); 
        System.out.println("Kutsal Canavar Adı = " + kutsalcanavar);
    }

    @Override
    public void kutsalCanavarOrtayaÇıkar() {
        System.out.println(getBeybladeci() + "" + kutsalcanavar+ " ı ortaya çıkarıyor..");
        System.out.println(getBeybladeci() + " ın saldırısı : Kaplan Pençesi");
    }
    
    
    
}
