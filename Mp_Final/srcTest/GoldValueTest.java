import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class GoldValueTest {

    @Test
    void goldValue() {
        GoldValue goldValue = new GoldValue();
        Character_App Character_App = new Character_App();
        String ch = "15\n";
        Character_App.setGoldValue(5);
        InputStream in = new ByteArrayInputStream(ch.getBytes());
        System.setIn(in);
        Character_App nuevoper = goldValue.GoldValue(character);
        assertEquals(15, nuevoper.getGoldValue());

        ch = "salir\n";
        Character_App.setGoldValue(45);
        in = new ByteArrayInputStream(ch.getBytes());
        System.setIn(in);
        nuevoper = goldValue.GoldValue(character);
        assertEquals(45, nuevoper.getGoldValue());
    }
}