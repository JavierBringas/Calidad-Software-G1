import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddModifierTest {

    @Test
    void addModifier() {
        AddModifier addModifier = new AddModifier();
        Character_App Character_App = new Character_App();
        List<Modifiers> modifiersList = new ArrayList<>();
        Character_App.setModifierList(modifiersList);

        String[] entradas = {"a","TestMod","a","6","5","a","debilidad"};
        String input = String.join(System.lineSeparator(), entradas) + System.lineSeparator();
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Character_App newCharacter = addModifier.AddModifier (Character_App);
        assertEquals(1, newCharacter.getModifiersList().size());
        assertEquals("TestMod", newCharacter.getModifiersList().get(0).getName());
        assertEquals(5, newCharacter.getModifiersList().get(0).getValue());
        assertFalse(newCharacter.getModifiersList().get(0).isBuff());
        assertFalse(newCharacter.getModifiersList().get(0).isActive());

        in = new ByteArrayInputStream("salir".getBytes());
        System.setIn(in);

        newCharacter = addModifier.AddModifier (Character_App);
        assertEquals(1, newCharacter.getModifiersList().size());

        String[] entradas2 = {"a","TestMod","0","1","Fortaleza"};
        input = String.join(System.lineSeparator(), entradas2) + System.lineSeparator();
        in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        newCharacter = addModifier.AddModifier (Character_App);
        assertEquals(2, newCharacter.getModifiersList().size());
        assertEquals("TestMod", newCharacter.getModifiersList().get(1).getName());
        assertEquals(1, newCharacter.getModifiersList().get(1).getValue());
        assertTrue(newCharacter.getModifiersList().get(1).isBuff());
        assertFalse(newCharacter.getModifiersList().get(1).isActive());
    }
}