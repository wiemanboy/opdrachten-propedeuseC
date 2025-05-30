package practicum.practicum3A;

public class Voetbalclub {
    int aantalGewonnen = 0;
    int aantalGelijk = 0;
    int aantalVerloren = 0;
    String naam = "";

    public Voetbalclub(String naam){
        if (naam == "" || naam == null){
            this.naam = "FC";
        }
        else {this.naam = naam;}
    }


    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public int aantalPunten(){
        return aantalGewonnen * 3 + aantalGelijk;

    }

    public int aantalGespeeld(){
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    public String toString(){
        return naam + "\t" + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPunten();
    }

    public String getNaam() {
        return naam;
    }
}

