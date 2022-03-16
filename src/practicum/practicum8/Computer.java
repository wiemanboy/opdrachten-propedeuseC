package practicum.practicum8;

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
    }

    public double huidigewaarde(){
        return 0.0;
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


}
