package practicum.practicum6A;

import java.util.ArrayList;
import java.util.Locale;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> mijnGames = new ArrayList();

    public Persoon(String nm, double bud){
        naam = nm;
        budget = bud;
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game g){
        if (g.huidigeWaarde() < budget && !mijnGames.contains(g)){
            budget -= g.huidigeWaarde();
            mijnGames.add(g);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean verkoop(Game g, Persoon koper){
        if (g.huidigeWaarde() < koper.budget && !koper.mijnGames.contains(g) && mijnGames.contains(g)) {
            koper.budget -= g.huidigeWaarde();
            budget += g.huidigeWaarde();
            mijnGames.remove(g);
            koper.mijnGames.add(g);
            return true;
        }
        else {
            return false;
        }
    }

    public String toString() {
        String s = naam + " heeft een budget van €" + String.format(Locale.GERMANY,"%.2f",budget) + " en bezit de volgende games:";
        for (Game games : mijnGames){
            s+= "\n" + games;
        }
        return s;
    }
}
