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

    @Test
    @DisplayName("Busca pela palavra Acampamento")
    void testFindWordInArrayAcampamento() {
        char[] data = {
                'A', 'A', 'C', 'A', 'D', 'A', 'C', 'A', 'M', 'P', 'A', 'M', 'E', 'N', 'T', 'O', 'E', 'M', 'I', 'A',
        };

        assertTrue(arrayWord.FindWordInArray("Acampamento".toUpperCase(), data));
        assertFalse(arrayWord.FindWordInArray("False".toUpperCase(), data));
    }

    @Test
    @DisplayName("Busca por palavras big array")
    void testFindWordInArrayBigArray() {
        char[] data = {
                'A', 'A', 'C', 'A', 'D', 'A', 'C', 'A', 'M', 'P', 'A', 'M', 'E', 'N', 'T', 'O', 'I', 'M', 'I', 'A',
                'C', 'A', 'S', 'A', 'T', 'H', 'O', 'A', 'M', 'I', 'E', 'X', 'Ç', 'B', 'V', 'D', 'W', 'C', 'O', 'P',
                'N', 'P', 'Y', 'O', 'D', 'P', 'B', 'R', 'A', 'S', 'I', 'L', 'W', 'P', 'O', 'L', 'X', 'V', 'P', 'Z',
        };

        assertTrue(arrayWord.FindWordInArray("Casa".toUpperCase(), data));
        assertTrue(arrayWord.FindWordInArray("Brasil".toUpperCase(), data));

        assertFalse(arrayWord.FindWordInArray("False".toUpperCase(), data));
    }
}
