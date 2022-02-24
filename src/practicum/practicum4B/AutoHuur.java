package practicum.practicum4B;

public class AutoHuur {
    private int aantalDagen;
    private Auto gehuurdeAuto;
    private Klant huurder;


    public AutoHuur(){}

    public void setAantalDagen(int aD){
        if (aD < 0){
            aantalDagen = 0;
        }
        else{
        aantalDagen = aD;
        }
    }

    public int getAantalDagen(){
        return aantalDagen;
    }

    public void setGehuurdeAuto(Auto gA){
        gehuurdeAuto = gA;
    }

    public Auto getGehuurdeAuto(){
        return gehuurdeAuto;
    }

    public void setHuurder(Klant k){
        huurder = k;
    }

    public Klant getHuurder(){
        return huurder;
    }

    public double totaalPrijs(){
        double ppd;
        double korting;
        if (gehuurdeAuto == null){
            ppd = 0;
        }
        else {
            ppd = gehuurdeAuto.getPrijsPerDag();
        }
        if (huurder == null){
            korting = 0;
        }
        else {
            korting = huurder.getKorting();
        }
        if (korting < 0){
            korting = 0;
        }
        double krtng = korting /100;
        double tot = aantalDagen * ppd;
        double prs = tot - (tot * krtng);
        return prs;
    }

    public String toString(){
        String at;
        String h;
        String k;
        if (gehuurdeAuto == null){
            at = "er is geen auto bekend\n";
        }
        else {
            at = "Autotype: " + gehuurdeAuto + "\n";
        }
        if (huurder == null){
            h = "er is geen huurder bekend\n";
        }
        else {
            h = "Huurder: " + huurder + "\n";
        }
        k = "aantal dagen: " + aantalDagen + " en dat kost: " + totaalPrijs();
        String s = at + h + k;
        return s;
    }


}
