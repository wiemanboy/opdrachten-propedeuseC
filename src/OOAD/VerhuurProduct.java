package OOAD;

import java.util.ArrayList;

public class VerhuurProduct {
    private double verhuurPrijs;
    private double borg;
    private ArrayList<Product> alleVerhuurProducten;
    private ArrayList<Exemplaar> exemplaren;

    public VerhuurProduct(){}

    public String geefOmschrijving(){
        for (Product product : alleVerhuurProducten ){
            //String omschrijving = product.geefOmschrijving();
        }

        //return omschrijving;
        return "";
    }

    public ArrayList<Exemplaar> geefBeschikbareExemplaren(){
        for (Exemplaar exemplaar : exemplaren){
            exemplaar.geefDatails();
            exemplaar.isVerhuurd();
        }
    return exemplaren;
    }

}
