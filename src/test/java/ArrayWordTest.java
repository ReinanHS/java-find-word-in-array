import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayWordTest {
    private ArrayWord arrayWord;

    @BeforeEach
    @DisplayName("Before run test case to init resource")
    void init() {
        arrayWord = new ArrayWord();
    }

    @Test
    @DisplayName("Busca por palavras")
    void testFindWordInArrayAcademia() {
        char[] data = {
                'A', 'A', 'C', 'A', 'O', 'I', 'M', 'I',
        };

        assertTrue(arrayWord.FindWordInArray("AA".toUpperCase(), data));
        assertTrue(arrayWord.FindWordInArray("CA".toUpperCase(), data));
        assertTrue(arrayWord.FindWordInArray("OI".toUpperCase(), data));
        assertTrue(arrayWord.FindWordInArray("MI".toUpperCase(), data));

        assertTrue(arrayWord.FindWordInArray("AC".toUpperCase(), data));
        assertTrue(arrayWord.FindWordInArray("AO".toUpperCase(), data));
        assertTrue(arrayWord.FindWordInArray("IM".toUpperCase(), data));

        assertFalse(arrayWord.FindWordInArray("IO".toUpperCase(), data));
        assertFalse(arrayWord.FindWordInArray("UY".toUpperCase(), data));
        assertFalse(arrayWord.FindWordInArray("IT".toUpperCase(), data));
        assertFalse(arrayWord.FindWordInArray("AI".toUpperCase(), data));

        assertTrue(arrayWord.FindWordInArray("CAOI".toUpperCase(), data));
    }
}
