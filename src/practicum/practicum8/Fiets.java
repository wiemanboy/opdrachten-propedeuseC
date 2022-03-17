package practicum.practicum8;

public class Fiets extends Voertuig{
    private int framenummer;

    public Fiets(String tp, double pr, int jr, int fnr){
        super(tp,pr,jr);
        framenummer = fnr;
    }

    @Override
    public double huidigewaarde() {
        return nieuwprijs * Math.pow(0.9,2022 - bouwjaar);
    }

    public boolean equals(Object andereObject) {
        boolean gelijkeObjecten = false;

        if (andereObject instanceof Fiets) {
            Fiets andereFiets = (Fiets) andereObject;

            if (super.equals(andereFiets) && framenummer == andereFiets.framenummer){
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }
}
