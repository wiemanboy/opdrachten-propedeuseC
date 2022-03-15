package practicum.practicum8;

import practicum.practicum6A.Game;

public class Auto {
    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt){
        kenteken = kt;
    }

    public double huidigeWaarde(){
        return 0.0;
    }

    public boolean equals(Object andereObject) {
        boolean gelijkeObjecten = false;

        if (andereObject instanceof Auto) {
            Auto andereGame = (Auto) andereObject;

            if (true == true){
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

}
