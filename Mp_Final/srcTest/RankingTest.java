import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RankingTest {

    @Test
    void Ranking() {
        Character_App aux = new Character_App();
        aux.setWins(10);
        Character_App aux2 = new Character_App();
        aux2.setWins(100);
        Character_App aux3 = new Character_App();
        aux3.setWins(1);
        List<Character> charList = new ArrayList<>();
        List<Character> charList2 = new ArrayList<>();
        charList.add(aux2);
        charList2.add(aux2);
        Ranking ranking = new Ranking();
        assertEquals(charList2, ranking.Ranking(charList));

        charList.add(aux3);
        charList.add(aux);
        charList2.add(aux);
        charList2.add(aux3);
        assertEquals(charList2, ranking.Ranking(charList));
    }
}