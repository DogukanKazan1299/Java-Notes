/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematik_fizik_problemleri;

import java.util.Scanner;

/**
 *
 * @author dkzn1
 */
public class Vec {
    private String isim;
    private int i;
    private int j;
    private int k;
    
    public Vec(String isim){
        this.isim = isim;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println(isim +" in i - j - k değerlerini giriniz");
        System.out.println("i");
        this.i = s.nextInt();
        System.out.println("j");
        this.j = s.nextInt();
        System.out.println("k");
        this.k = s.nextInt();
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
    
    
    
}
