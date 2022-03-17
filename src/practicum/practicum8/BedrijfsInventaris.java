package practicum.practicum8;

import java.util.ArrayList;
import java.util.Locale;

public class BedrijfsInventaris {
    private String bedrijsnaam;
    private double budget;
    private ArrayList<Goed> alleGoederen = new ArrayList<>();

    public BedrijfsInventaris(String nm, double bud){
        bedrijsnaam = nm;
        budget = bud;
    }

    public void schafAan(Goed g){
        if (budget > g.huidigewaarde() && !alleGoederen.contains(g)){
            budget -= g.huidigewaarde();
            alleGoederen.add(g);
        }
    }

    @Override
    public String toString() {
        String s = "Het bedrijfsinventaris van " + bedrijsnaam + " heeft een budget van : " + String.format(Locale.GERMANY,"%.2f",budget) + " en bezit : \n";
        for (Goed goederen : alleGoederen){
            s += goederen;
        }
        return s;
    }
}
