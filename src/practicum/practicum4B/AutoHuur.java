package practicum.practicum4B;

public class AutoHuur {
    private int aantalDagen;
    private Auto gehuurdeAuto;
    private Klant huurder;

    public AutoHuur(){}

    public void setAantalDagen(int aD){
        aantalDagen = aD;
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
        return 1.0;
    }

    public String toString(){
        String s = "autotype: " + gehuurdeAuto;

        return s;
    }


}
