package OOAD;

import java.util.ArrayList;

public class Exemplaar {
    private int aanschafDatum;
    private int serieNr;
    private String status;
    private ArrayList<VerhuurRegels> regels;

    public Exemplaar(int ad, int sn, String s){
        aanschafDatum = ad;
        serieNr = sn;
        status = s;
    }

    public String geefDatails(){
        return status;
    }

    public int isVerhuurd(){
        for (VerhuurRegels regel : regels){
            int r = regel.geefPeriode();
        }
        return 0;
    }
}
