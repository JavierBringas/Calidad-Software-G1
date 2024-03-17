import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class PowerTest {

    @Test
    void power() {
        Power power = new Power();
        Character_App Character_App = new Character_App();
        String ch = "a\n \n15\n \n3\n";
        Character_App.setPower(5);
        InputStream in = new ByteArrayInputStream(ch.getBytes());
        System.setIn(in);
        Character_App nuevoper = power.Power(character);
        assertEquals(3, nuevoper.getPower());

        ch = "salir\n";
        Character_App.setPower(5);
        in = new ByteArrayInputStream(ch.getBytes());
        System.setIn(in);
        nuevoper = power.Power(character);
        assertEquals(5, nuevoper.getPower());
    }
}