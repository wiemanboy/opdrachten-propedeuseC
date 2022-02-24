package practicum.practicum4B;

public class Auto {
    private String type;
    private double prijsPerDag;

    public Auto(String tp, double prPd){
        type = tp;
        if (prPd < 0){
            prijsPerDag = 0;
        }
        else{
        prijsPerDag = prPd;
        }
    }

    public void setPrijsPerDag(double prDp){
        prijsPerDag = prDp;
    }

    public double getPrijsPerDag(){
        return prijsPerDag;
    }

    public String toString(){
        String s = type + " met prijs per dag: " + prijsPerDag;
        return s;
    }
}
