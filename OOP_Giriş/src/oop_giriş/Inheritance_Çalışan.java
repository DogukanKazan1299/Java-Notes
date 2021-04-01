/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_giriş;

/**
 *
 * @author dkzn1
 */
public class Inheritance_Çalışan {
    
    private String isim;
    private int maas;
    private String departman;
    
    
    public void bilgileri_goster(){
        System.out.println("Çalışan adı = " + this.isim);
        System.out.println("Çalışanın maaşı = " + this.maas);
        System.out.println("Çalışanın departmanı = " + this.departman);
    }

    
    

    public Inheritance_Çalışan(String isim, int maas, String departman) {
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
    
    
    
}
