import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class HitPointsTest {

    @Test
    void hitPoints() {
        HitPoints hitPoints = new HitPoints();
        Character_App Character_App = new Character_App();
        String ch = "15\n10\n";
        Character_App.sethP(5);
        InputStream in = new ByteArrayInputStream(ch.getBytes());
        System.setIn(in);
        Character_App nuevoper = hitPoints.HitPoints (Character_App);
        assertEquals(10, nuevoper.gethP());

        ch = "salir\n";
        Character_App.sethP(5);
        in = new ByteArrayInputStream(ch.getBytes());
        System.setIn(in);
        nuevoper = hitPoints.HitPoints (Character_App);
        assertEquals(5, nuevoper.gethP());
    }
}