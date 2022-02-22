package practicum.practicum4B;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public void klant(String nm){
        naam = nm;
    }

    public void setKorting(double kP){
        kortingsPercentage = kP;
    }

    public double getKorting(){
        return 1.0;
    }

    public String toString(){
        return "kaas";
    }


}
