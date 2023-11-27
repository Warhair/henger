
package hengerprogram;


public class Henger {
    private static int hengerDarab = 0;
    private double sugar, magassag;

    public Henger(double sugar, double magassag) {
        this.sugar = sugar;
        this.magassag = magassag;
    }
    public Henger(int hengerDarab){
        this.hengerDarab = hengerDarab;
    }

    public static int getHengerDarab() {
        return hengerDarab;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }
     public double terfogat(){
        double terfogat = Math.pow(sugar, 2)*Math.PI*magassag;
        return terfogat;
    }

    @Override
    public String toString() {
        return "Henger{" + "sugar=" + getSugar() + ", magassag=" + getMagassag() + "terfogat=" +  terfogat() + '}';
    }
     
}
 
