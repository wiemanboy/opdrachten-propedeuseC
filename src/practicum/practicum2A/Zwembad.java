package practicum.practicum2A;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad(double br,double ln, double dp){
        breedte = br;
        lengte = ln;
        diepte = dp;
    }

    public Zwembad(){}

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public void setDiepte(double diepte) {
        this.diepte = diepte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public double getBreedte() {
        return breedte;
    }

    public double getDiepte() {
        return diepte;
    }

    public double getLengte() {
        return lengte;
    }

    public double inhoud() {
        double inhoud = breedte * lengte * diepte;
        return inhoud;
    }

    public String toString(){
    return "Dit zwembad is " + getBreedte() + " meter breed, " + getLengte() + " Lang, en " + getDiepte() + " meter diep";
    }
}
