/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

/**
 *
 * @author dkzn1
 */
public class Bilgisayar {
    
    private Anakart anakart;
    private Monitor monitor;
    private Kasa kasa;

    public Bilgisayar(Anakart anakart, Monitor monitor, Kasa kasa) {
        this.anakart = anakart;
        this.monitor = monitor;
        this.kasa = kasa;
    }

    public Anakart getAnakart() {
        return anakart;
    }

    public void setAnakart(Anakart anakart) {
        this.anakart = anakart;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Kasa getKasa() {
        return kasa;
    }

    public void setKasa(Kasa kasa) {
        this.kasa = kasa;
    }
    
    
    
}
