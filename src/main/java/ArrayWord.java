public class ArrayWord {
    public boolean FindWordInArray(String word, char[] array) {
        char[] wordToChar = word.toCharArray();
        return this.FindWordInArray(wordToChar, array, 0, array.length);
    }

    public boolean FindWordInArray(char[] wordToChar, char[] array, int positionStart, int positionEnd) {
        boolean resultFind = false;

        int positionMid = (positionEnd + positionStart) / 2;
        int position = positionMid - (wordToChar.length - 1);

        if (positionEnd - positionStart == 1) {
            return findInArray(positionStart, array, wordToChar);
        }

        if (positionMid + wordToChar.length <= array.length) {
            resultFind = findInArray(positionMid, array, wordToChar);
            resultFind = resultFind || this.FindWordInArray(wordToChar, array, positionMid, positionEnd);
        }

        if (position >= 0 && !resultFind) {
            resultFind = findInArray(position, array, wordToChar);
            resultFind = resultFind || this.FindWordInArray(wordToChar, array, positionStart, positionMid);
        }

        return resultFind;
    }

    private boolean findInArray(int position, char[] array, char[] words) {
        for (int i = 0; i < words.length; i++) {
            if (array[position + i] != words[i]) {
                return false;
            }
        }

        return true;
    }
}
