public class ArrayWord {
    public boolean FindWordInArray(String word, char[] array) {
        return this.FindWordInArray(word, array, 0, array.length);
    }

    public boolean FindWordInArray(String word, char[] array, int positionStart, int positionEnd) {
        char[] wordToChar = word.toCharArray();
        int positionMid = (positionEnd + positionStart) / 2;

        if (wordToChar.length > positionEnd - positionStart) {
            return false;
        }

        if (positionMid + wordToChar.length <= positionEnd) {
            boolean isEqual = true;

            for (int i = 0; i < word.length(); i++) {
                if (array[positionMid + i] != wordToChar[i]) {
                    isEqual = false;
                    break;
                }
            }

            isEqual = isEqual ? isEqual : this.FindWordInArray(word, array, positionMid, positionEnd);
            if (isEqual) {
                return true;
            }
        }

        if (positionMid - wordToChar.length >= 0) {
            boolean isEqual = true;
            int position = positionMid - wordToChar.length;

            for (int i = 0; i < word.length(); i++) {
                if (array[position + i] != wordToChar[i]) {
                    isEqual = false;
                    break;
                }
            }

            isEqual = isEqual ? isEqual : this.FindWordInArray(word, array, positionStart, positionMid);
            if (isEqual) {
                return true;
            }
        }

        return false;
    }
}
