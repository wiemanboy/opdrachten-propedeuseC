package practicum.practicum8;

public class Auto extends Voertuig{
    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt){
        super(tp,pr,jr);
        kenteken = kt;
    }

    @Override
    public double huidigewaarde() {
        return nieuwprijs * Math.pow(0.7,2022 - bouwjaar);
    }

    public boolean equals(Object andereObject) {
        boolean gelijkeObjecten = false;

        if (andereObject instanceof Auto) {
            Auto andereAuto = (Auto) andereObject;

            if (super.equals(andereAuto) && kenteken.equals(andereAuto.kenteken) ){
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

}
