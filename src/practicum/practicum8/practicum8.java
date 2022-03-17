package practicum.practicum8;

public class practicum8 {
    public static void main(String[] args) {
        BedrijfsInventaris bI1 = new BedrijfsInventaris("bedrijf inc.",20000);
        Goed a1 = new Auto("mazda cx5",5000,2019,"AB12BC");
        Goed a2 = new Auto("mazda cx5",5000,2019,"AB12BC");
        Goed a3 = new Auto("Tesla model x",20000,2021,"CV21BA");

        Goed c1 = new Computer("desktop","ab12",3000,2019);
        Goed c2 = new Computer("desktop","ab12",3000,2019);
        Goed c3 = new Computer("laptop","ab12",1000,2020);

        Goed f1 = new Fiets("mountainbike",1000,2019,123456);
        Goed f2 = new Fiets("mountainbike",1000,2019,123456);
        Goed f3 = new Fiets("gazelle",600,2017,123457);
        Goed f4 = new Fiets("fiets can 12 karaat goud",47000000,2024,9016);

        bI1.schafAan(a1);
        bI1.schafAan(a2);
        bI1.schafAan(a3);

        bI1.schafAan(c1);
        bI1.schafAan(c2);
        bI1.schafAan(c3);

        bI1.schafAan(f1);
        bI1.schafAan(f2);
        bI1.schafAan(f3);
        bI1.schafAan(f4);

        System.out.println(bI1);

    }
}
