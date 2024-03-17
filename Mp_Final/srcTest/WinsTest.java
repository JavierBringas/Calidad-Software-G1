import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class WinsTest {

    @Test
    void wins() {
        Wins wins = new Wins();
        Character_App Character_App = new Character_App();
        String ch = "15\n";
        Character_App.setWins(5);
        InputStream in = new ByteArrayInputStream(ch.getBytes());
        System.setIn(in);
        Character_App nuevoper = wins.Wins(character);
        assertEquals(15, nuevoper.getWins());

        ch = "salir\n";
        Character_App.setWins(45);
        in = new ByteArrayInputStream(ch.getBytes());
        System.setIn(in);
        nuevoper = wins.Wins(character);
        assertEquals(45, nuevoper.getWins());
    }
}