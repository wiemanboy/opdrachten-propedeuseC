package practicum.practicum3B;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int rad, int x, int y){
        radius = rad;
        xPositie = x;
        yPositie = y;

    }

    public String toString(){
        return "cirkel (" + xPositie + "," + yPositie + ") met radius: " + radius ;
    }



}
