public class ArrayWordBruteForce {

    public boolean FindWordInArray(String word, char[] array) {
        char[] wordToChar = word.toCharArray();

        for (int i = 0; i < array.length; i++) {
            boolean findWordInArray = true;

            if (array[i] != wordToChar[0] || i + wordToChar.length > array.length) {
                continue;
            }

            for (int j = 1; j < wordToChar.length; j++) {

                if (array[i + j] != wordToChar[j]) {
                    findWordInArray = false;
                    break;
                }

            }

            if (findWordInArray) {
                return true;
            }
        }

        return false;
    }
}
