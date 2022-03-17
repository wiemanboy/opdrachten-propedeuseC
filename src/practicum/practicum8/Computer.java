package practicum.practicum8;

import java.lang.Math;
import java.util.Locale;

public class Computer implements Goed{

    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private  int productieJaar;

    Computer(String tp, String adr, double pr, int jr){
        type = tp;
        macAdres = adr;
        aanschafPrijs = pr;
        productieJaar = jr;
        if (productieJaar > 2022){
            productieJaar = 2022;
        }
    }

    public double huidigewaarde(){
        return aanschafPrijs * Math.pow(0.6,2022 - productieJaar);
    }

    public boolean equals(Object andereObject) {
        boolean gelijkeObjecten = false;

        if (andereObject instanceof Computer) {
            Computer andereComputer = (Computer) andereObject;

            if (this.type.equals(andereComputer.type) &&
                    this.macAdres.equals(andereComputer.macAdres) &&
                    this.aanschafPrijs == andereComputer.aanschafPrijs &&
                    this.productieJaar == andereComputer.productieJaar) {
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }

    @Override
    public String toString() {
        return "Computer type : " + type + " met macadres : " + aanschafPrijs + " gemaakt in productiejaar : " + productieJaar + " heeft een huidige waarde van " + String.format(Locale.GERMANY,"%.2f",huidigewaarde()) + "\n";
    }
}
