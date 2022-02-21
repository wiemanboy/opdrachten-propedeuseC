package practicum.practicum3B;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int rad, int x, int y){
        radius = rad;
        xPositie = x;
        yPositie = y;
        if (radius <= 0) {
            throw new IllegalArgumentException ("Radius moet groter dan 0 zijn!");
        }
    }


    public String toString(){
        return "cirkel (" + xPositie + "," + yPositie + ") met radius: " + radius ;
    }



}
