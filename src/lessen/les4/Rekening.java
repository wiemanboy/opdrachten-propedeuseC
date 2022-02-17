package lessen.les4;

public class Rekening {
    private int nummer;
    private double saldo;


    public Rekening(int nummer){
        this.nummer = nummer;
    }

    //private Klant rekeninghouder(){}

    //public Klant getrekeninghouder(){
    //    return rekeninghouder;
    //}

    //public void setRekeninghouder(Klant rekeninghouder){
    //    this.rekeninghouder = rekeninghouder
    //}

    public int getNummer() {
        return nummer;
    }

    public void neemOp(double bedrag){
        saldo -= bedrag;
    }

    public void stort(double bedrag){
        saldo += bedrag;
    }

    public String toString(){
        String s = "Nummer = " + nummer + "\n Saldo = " + saldo + "euro\n";
    //    if (rekeninghouder != null)
    //        s += "rekeninghouder = " + rekeninghouder.toString();

        return s;
    }
}
