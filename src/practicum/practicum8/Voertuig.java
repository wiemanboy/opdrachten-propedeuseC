package practicum.practicum8;

public abstract class Voertuig implements Goed {
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String tp, double pr, int jr){
        type = tp;
        nieuwprijs = pr;
        bouwjaar = jr;
    }

    public boolean equals(Object andereObject) {
        boolean gelijkeObjecten = false;

        if (andereObject instanceof Voertuig) {
            Voertuig andervoertuig = (Voertuig) andereObject;

            if (this.type.equals(andervoertuig.type) &&
                    this.nieuwprijs == andervoertuig.nieuwprijs &&
                    this.bouwjaar == andervoertuig.bouwjaar) {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }
}
