package practicum.practicum5;

import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> deLeerlingen = new ArrayList<Leerling>();

    public Klas(String kC){
        klasCode = kC;
    }

    public void voegLeerlingToe(Leerling l){
        deLeerlingen.add(l);
    }

    public void wijzigCijfer(String nm, double nweCijfer){
        for (Leerling leerling : deLeerlingen) {
            if (leerling.getNaam().equals(nm)){
                leerling.setCijfer(nweCijfer);
                break;
            }
        }
    }

    public ArrayList<Leerling> getLeerlingen(){
        return deLeerlingen;
    }

    public int aantalLeerlingen(){
        return deLeerlingen.size();
    }

    public String toString(){
        String s = "In klas " + klasCode + " zitten de volgende leerlingen: \n";
        for (Leerling leerling : deLeerlingen) {
            s += leerling + "\n";
        }
        return s;
    }

}
