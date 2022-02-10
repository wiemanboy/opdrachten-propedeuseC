package lessen.les2.banksysteem;

public class Rekening {
    private int nummer;
    private double saldo;

    public Rekening(int nummer){
        this.nummer = nummer;
    }

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
        return "Nummer = " + nummer + "\n Saldo = " + saldo + "euro\n";
    }
}
