import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Character_AppTest {

    @Test
    void setType() {
        Character_App Character_App = new Character_App();
        Character_App.setType("Vampiro");
        assertEquals(TCharacter.VAMPIRE,character.getType());

        Character_App.setType("Cazador");
        assertEquals(TCharacter.HUNTER,character.getType());

        Character_App.setType("Licántropo");
        assertEquals(TCharacter.WEREWOLF,character.getType());
    }
}