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
public class Dragon extends Beyblade {

    private String kutsalcanavar;
    private String gizli_yetenek;

    public Dragon(String beybladeci, int dönüş_hızı, int saldırı_gücü, String kutsalcanavar, String gizli_yetenek) {
        super(beybladeci, dönüş_hızı, saldırı_gücü);
        this.kutsalcanavar = kutsalcanavar;
        this.gizli_yetenek = gizli_yetenek;
    }

    @Override
    public void bilgileriGöster() {
        super.bilgileriGöster();
        System.out.println("Kutsal Canavar Adı = " + kutsalcanavar);
        System.out.println("Gizli Yetenek =" + gizli_yetenek);
    }

    @Override
    public void kutsalCanavarOrtayaÇıkar() {
        System.out.println(getBeybladeci() + "" + kutsalcanavar + " ı ortaya çıkarıyor..");
        System.out.println(getBeybladeci() + " ın saldırısı : Hayalet Kasırga");
    }

}
