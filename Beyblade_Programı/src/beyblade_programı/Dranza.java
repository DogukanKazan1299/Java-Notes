
package beyblade_programı;


public class Dranza extends Beyblade{
    
    private String kutsalcanavar;

    public Dranza(String beybladeci, int dönüş_hızı, int saldırı_gücü,String kutsalcanavar) {
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
        System.out.println(getBeybladeci() + " ın saldırısı : Alev Kılıcı");
    }
    
    
    
}
