package practicum.practicum3A;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {
    Voetbalclub feij = new Voetbalclub("Feijenoord");


    @BeforeEach
    public void init(){
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('v');
        feij.verwerkResultaat('g');

    }

    @Test
    void legeVoetbalclub(){
        practicum.practicum3A.Voetbalclub leeg = new Voetbalclub("");
        assertEquals("FC",leeg.getNaam());
    }

    @Test
    void nullVoetbalclub(){
        practicum.practicum3A.Voetbalclub leeg = new Voetbalclub(null);
        assertEquals("FC",leeg.getNaam());
    }

    @Test
    void fouteInvoer(){
        feij.verwerkResultaat('z');
        feij.verwerkResultaat('8');
        feij.verwerkResultaat('#');
        assertEquals(4,feij.aantalPunten());
        assertEquals(3,feij.aantalGespeeld());
    }


    @Test
    void toStringWerkt(){
        assertEquals("Feijenoord\t3 1 1 1 4",feij.toString());
    }

    @Test
    void resultatenVerwerken(){
        assertEquals(3,feij.aantalGespeeld());
        assertEquals(4,feij.aantalPunten());
    }


}