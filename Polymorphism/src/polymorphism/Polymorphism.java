package polymorphism;

class Hayvan{
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    public String konuş(){
        return "Hayvan konuşuyor";
    }
}

class Kedi extends Hayvan{

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konuş() {
        return this.getIsim()+" miyavlıyor";
    }
    
}

class Kopek extends Hayvan{

    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konuş() {
        return this.getIsim()+" havlıyor";
    }
    
    
}


class At extends Hayvan{

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konuş() {
        return this.getIsim()+" kişniyor";
    }
    
    
}


public class Polymorphism {

    public static void main(String[] args) {
        // TODO code application logic here
        Hayvan hayvan1 = new Kedi("Tekir");
        Hayvan hayvan2 = new Kopek("Karabaş");
        Hayvan hayvan3 = new At("Şahbatur");
        System.out.println(hayvan1.konuş());
        System.out.println(hayvan2.konuş());
        System.out.println(hayvan3.konuş());
        
    }
    
}
