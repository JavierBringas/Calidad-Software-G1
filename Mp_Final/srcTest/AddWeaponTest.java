import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddWeaponTest {

    @Test
    void addWeapon(){
        AddWeapon addWeapon = new AddWeapon();
        Character_App Character_App = new Character_App();
        List<Weapon> weaponList = new ArrayList<>();
        Character_App.setWeaponSet(weaponList);

        String[] entradas = {"a","TestWeapon","4","3","4","3","0","1"};
        String input = String.join(System.lineSeparator(), entradas) + System.lineSeparator();
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Character_App newCharacter = addWeapon.AddWeapon (Character_App);
        assertEquals(1, newCharacter.getWeaponSet().size());
        assertEquals("TestWeapon", newCharacter.getWeaponSet().get(0).getName());
        assertEquals(3, newCharacter.getWeaponSet().get(0).getAttack());
        assertEquals(3, newCharacter.getWeaponSet().get(0).getDefence());
        assertFalse(newCharacter.getWeaponSet().get(0).isActive());

        in = new ByteArrayInputStream("salir".getBytes());
        System.setIn(in);

        newCharacter = addWeapon.AddWeapon (Character_App);
        assertEquals(1, newCharacter.getWeaponSet().size());

        String[] entradas2 = {"a","TestWeapon","a","0","1","a","-1","0","a","3","2"};
        input = String.join(System.lineSeparator(), entradas2) + System.lineSeparator();
        in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        newCharacter = addWeapon.AddWeapon (Character_App);
        assertEquals(2, newCharacter.getWeaponSet().size());
        assertEquals("TestWeapon", newCharacter.getWeaponSet().get(1).getName());
        assertEquals(1, newCharacter.getWeaponSet().get(1).getAttack());
        assertEquals(0, newCharacter.getWeaponSet().get(1).getDefence());
        assertFalse(newCharacter.getWeaponSet().get(1).isActive());
    }
}