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

    @Test
    void checkIfRepeatedResultAltersPoints()
    {
        String testrow = createTestString();
        Integer expectedPoints = determineExpectedPoints(testrow);
        for(char i: testrow.toCharArray())
        {
            v.verwerkResultaat(i);
        }
        assertEquals(expectedPoints, v.aantalPunten());
    }

    private String createTestString()
    {
        String res = "";
        Random rand = new Random();
        int r = 0;
        for(int i = 0; i < 10; i++)
        {
            r = rand.nextInt(3) + 1;
            if(r == 1){res += "v";}
            else if(r == 2){res += "g";}
            else{res += "w";}
        }
        return res;
    }

    private Integer determineExpectedPoints(String results)
    {
        int res = 0;
        for(char target: results.toCharArray())
        {
            if(target == 'g') {res += 1;}
            else if (target == 'w'){res += 3;}
        }
        return res;
    }


}