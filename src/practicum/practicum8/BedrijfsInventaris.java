package practicum.practicum8;

public class BedrijfsInventaris {
    private String bedrijsnaam;
    private double budget;

    public BedrijfsInventaris(String nm, double bud){
        bedrijsnaam = nm;
        budget = bud;
    }

    public void schafAan(Goed g){}

    @Override
    public String toString() {
        return "BedrijfsInventaris{" +
                "bedrijsnaam='" + bedrijsnaam + '\'' +
                ", budget=" + budget +
                '}';
    }
}
