import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NameTest {

    @Test
    void name() {
        Name name = new Name();
        Character_App Character_App = new Character_App();
        String[] entradas = {"JoseLuis","JoseLuis","a"};
        String ch = String.join(System.lineSeparator(), entradas) + System.lineSeparator();
        Character_App.setName("a");
        InputStream in = new ByteArrayInputStream(ch.getBytes());
        System.setIn(in);
        Character_App nuevoper = name.Name (Character_App);
        assertEquals("JoseLuis", nuevoper.getName());

        ch = "salir\n";
        in = new ByteArrayInputStream(ch.getBytes());
        System.setIn(in);
        nuevoper.setName("Juan");
        nuevoper = name.Name (Character_App);
        assertEquals("Juan",nuevoper.getName());

    }
}