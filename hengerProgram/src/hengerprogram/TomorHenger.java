/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hengerprogram;

/**
 *
 * @author TegzesMárton(SZF_202
 */
public class TomorHenger extends Henger{
 private double fajsuly;    

    public TomorHenger(double sugar, double magassag) {
        this(sugar, magassag, 1);
    }

    public TomorHenger(double sugar, double magassag, double fajsuly) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }

    public double getFajsuly() {
        return fajsuly;
    }
    public double suly(){
       double suly = fajsuly * this.terfogat();
       return suly;
    }
    

    @Override
    public String toString() {
        return "Cso{" + "falsuly=" + getFajsuly() + "sugar=" + getSugar() + "magassag=" + getMagassag() + "terfogat=" + terfogat() + "suly=" + suly()+'}';
    }
    
 
}
