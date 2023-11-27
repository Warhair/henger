
package hengerprogram;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;


public class HengerProgram {

    private ArrayList<Henger> hengerek;
  
    public static void main(String[] args) {
        new HengerProgram().run();
    }
    public void HengerProgram(){
        run();
    }
    public double atlagTerfogat(){
        double atlagTerfogat = 0;
        return atlagTerfogat;
    }
    public double csovekSulya(){
        double csovekSulya = 0;
        return csovekSulya;
    }
    private List<Henger> lista(){
       hengerek = new ArrayList<>();
       hengerek.add(new  Henger(1, 1));
       hengerek.add(new TomorHenger(1, 2, 1));
       hengerek.add(new Cso(1, 1, 1));
       hengerek.add(new Cso(1, 1, 0.5));
       return Collections.unmodifiableList(hengerek);
       
    }
    public  void run(){
       lista();
    }
    
}
