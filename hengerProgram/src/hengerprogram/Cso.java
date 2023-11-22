/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hengerprogram;

/**
 *
 * @author TegzesMárton(SZF_202
 */
public class Cso  extends TomorHenger{
    private double falvastagsag;

    public Cso(double sugar, double magassag, double falvastagsag) {
        this(sugar, magassag, 1, falvastagsag);
        this.falvastagsag = falvastagsag;
    }

    public Cso(double falvastagsag, double fajsuly, double sugar, double magassag) {
        super(fajsuly, sugar, magassag);
        this.falvastagsag = falvastagsag;
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }
     @Override
     public double terfogat(){
         double terfogat = 0;
         return terfogat;
     }

    @Override
    public String toString() {
        return "Cso{" + "falvastagsag=" + falvastagsag + '}';
    }
     
}
