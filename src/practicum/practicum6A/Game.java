package practicum.practicum6A;

import java.util.Locale;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr){
        naam = nm;
        releaseJaar = rJ;
        nieuwprijs = nwpr;
    }

    public String getNaam() {
        return naam;
    }

    public double huidigeWaarde(){
        int leeftijd = 2022 - releaseJaar;
        double prijs = nieuwprijs;
        for (int i = 0 ;leeftijd > i; i++){
            prijs = prijs - (prijs * 0.3);
        }

        return prijs;
    }

    public boolean equals(Object andereObject) {
        boolean gelijkeObjecten = false;

        if (andereObject instanceof Game) {
            Game andereGame = (Game) andereObject;

            if (this.naam.equals(andereGame.naam) &&
                    this.releaseJaar == andereGame.releaseJaar) {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }


    public String toString() {
        return naam + ", uitgegeven in " + releaseJaar + "; nieuwprijs: €" + String.format(Locale.GERMANY,"%.2f",nieuwprijs) + " nu voor: €" + String.format(Locale.GERMANY,"%.2f",huidigeWaarde());
    }
}
