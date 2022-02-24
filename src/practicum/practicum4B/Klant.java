package practicum.practicum4B;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant(String nm){
        naam = nm;
    }

    public void setKorting(double kP){
        if (kP < 0){
        kortingsPercentage = 0;
        }
        else{
            if (kP > 100){
                kortingsPercentage = 100;
            }
            else{
                kortingsPercentage = kP;
            }
            }

    }

    public double getKorting(){
        return kortingsPercentage;
    }

    public String toString(){
        return naam + " (korting: " + kortingsPercentage + "%)";
    }


}
