package OOAD;

public class VerhuurRegels {
    private int einddatum;
    private int aantaldagen;
    private Exemplaar exemplaar;

    public VerhuurRegels(int ed, int ad){
        einddatum = ed;
        aantaldagen = ad;
    }

    public int geefPeriode(){
        return  einddatum;
    }
}
