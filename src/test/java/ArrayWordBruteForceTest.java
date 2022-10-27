import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayWordBruteForceTest {

    private ArrayWordBruteForce arrayWord;

    @BeforeEach
    @DisplayName("Before run test case to init resource")
    void init() {
        arrayWord = new ArrayWordBruteForce();
    }

    @Test
    @DisplayName("Busca por palavras")
    void testFindWordInArrayAcademia() {
        char[] data = {
                'A', 'A', 'C', 'A', 'D', 'E', 'M', 'I', 'A',
        };

        assertTrue(arrayWord.FindWordInArray("Academia".toUpperCase(), data));
        assertTrue(arrayWord.FindWordInArray("Cade".toUpperCase(), data));

        assertFalse(arrayWord.FindWordInArray("Banheiro".toUpperCase(), data));
        assertFalse(arrayWord.FindWordInArray("Casa".toUpperCase(), data));
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
                'A', 'A', 'C', 'A', 'D', 'A', 'C', 'A', 'M', 'P', 'A', 'M', 'E', 'N', 'T', 'O', 'E', 'M', 'I', 'A',
                'C', 'A', 'S', 'A', 'T', 'H', 'O', 'A', 'M', 'N', 'E', 'X', 'Ç', 'B', 'V', 'D', 'W', 'C', 'O', 'P',
                'N', 'P', 'Y', 'O', 'D', 'P', 'B', 'R', 'A', 'S', 'I', 'L', 'W', 'P', 'O', 'L', 'X', 'V', 'P', 'Z',
        };

        assertTrue(arrayWord.FindWordInArray("Casa".toUpperCase(), data));
        assertTrue(arrayWord.FindWordInArray("Brasil".toUpperCase(), data));
        assertFalse(arrayWord.FindWordInArray("False".toUpperCase(), data));
    }
}
