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
        super(sugar, magassag);
    }

    public TomorHenger(double fajsuly, double sugar, double magassag) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }

    public double getFajsuly() {
        return fajsuly;
    }
    public double suly(){
       double suly = 0;
       return suly;
    }

    @Override
    public String toString() {
        return "TomorHenger{" + "fajsuly=" + fajsuly + '}';
    }
    
 
}
