package practicum.practicum4A;

public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon (String nm, int lft){
        naam = nm;
        leeftijd = lft;

    }

    public String toString(){
        String str = naam + "; leeftijd " + leeftijd + " jaar";
        return str;
    }
}
