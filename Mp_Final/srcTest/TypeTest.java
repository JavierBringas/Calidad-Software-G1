import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class TypeTest {

    @Test
    void type() {
    Type type = new Type();
    Character_App Character_App = new Character_App();


    String[] entradas = {"Vampiro", " "};
    String ch = String.join(System.lineSeparator(), entradas) + System.lineSeparator();
    InputStream in = new ByteArrayInputStream(ch.getBytes());
    System.setIn(in);
    Character_App.setType(TCharacter.WEREWOLF);
    type.Type(character);



    Assertions.assertEquals(TCharacter.VAMPIRE, Character_App.getType());

        String[] entradas2 = {"Licántropo", " "};
         ch = String.join(System.lineSeparator(), entradas2) + System.lineSeparator();
         in = new ByteArrayInputStream(ch.getBytes());
        System.setIn(in);
        Character_App.setType(TCharacter.VAMPIRE);
        type.Type(character);

        Assertions.assertEquals(TCharacter.WEREWOLF, Character_App.getType());

        String[] entradas3 = {"Cazador", " "};
        ch = String.join(System.lineSeparator(), entradas3) + System.lineSeparator();
        in = new ByteArrayInputStream(ch.getBytes());
        System.setIn(in);
        Character_App.setType(TCharacter.WEREWOLF);
        type.Type(character);

        Assertions.assertEquals(TCharacter.HUNTER, Character_App.getType());

















    }
}