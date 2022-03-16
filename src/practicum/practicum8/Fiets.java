package practicum.practicum8;

public class Fiets {
    private int framenummer;

    public Fiets(String tp, double pr, int jr, int fnr){
        framenummer = fnr;
    }

    public double huidigeWaarde(){
        return 0.0;
    }

    public boolean equals(Object andereObject) {
        boolean gelijkeObjecten = false;

        if (andereObject instanceof Fiets) {
            Fiets anderefiets = (Fiets) andereObject;

            if (this.framenummer == anderefiets.framenummer){
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }
}
