package practicum.practicum4B;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoHuurTest {
    AutoHuur ah1;
    Klant k1;
    Auto a1;
    Auto a2;

    @BeforeEach
    public void init(){
        ah1 = new AutoHuur();
        k1 = new Klant("Pietje");
        a1 = new Auto("auto",10);


    }

    @Test
    void nietsIngevoerd(){
        assertEquals("er is geen auto bekend\n" + "er is geen huurder bekend\n" + "aantal dagen: 0 en dat kost: 0.0",ah1.toString());
    }

    @Test
    void allesIngevoerd(){
        ah1.setHuurder(k1);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(20);
        k1.setKorting(25);
        assertEquals("Autotype: auto met prijs per dag: 10.0\n" + "Huurder: Pietje (korting: 25.0%)\n" + "aantal dagen: 20 en dat kost: 150.0",ah1.toString());
    }

    @Test
    void geenAuto(){
        ah1.setHuurder(k1);
        assertEquals("er is geen auto bekend\n" + "Huurder: Pietje (korting: 0.0%)\n" + "aantal dagen: 0 en dat kost: 0.0",ah1.toString());
    }

    @Test
    void geenHuurder(){
        ah1.setGehuurdeAuto(a1);
        assertEquals("Autotype: auto met prijs per dag: 10.0\n" + "er is geen huurder bekend\n" + "aantal dagen: 0 en dat kost: 0.0",ah1.toString());
    }

    @Test
    void negatieveKorting(){
        k1.setKorting(-10);
        assertEquals("Pietje (korting: 0.0%)",k1.toString());
    }

    @Test
    void negatievePrijsPerDag(){
        a2 = new Auto("auto",-10);
        assertEquals("auto met prijs per dag: 0.0",a2.toString());
    }

    @Test
    void negatieveDagen(){
        ah1.setAantalDagen(-10);
        assertEquals("er is geen auto bekend\n" + "er is geen huurder bekend\n" + "aantal dagen: 0 en dat kost: 0.0",ah1.toString());
    }

    @Test
    void meerDan100ProcentKorting(){
        k1.setKorting(110);
        assertEquals("Pietje (korting: 100.0%)",k1.toString());
    }

}