package maciejkrolpl.codewars;

import java.util.Arrays;

public class SpinWords {

    public String spinWords(String sentence) {
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length()>=5) {
                words[i] = reverse(words[i]);
            }
        }

        return String.join(" ", words);
    }

    private String reverse(String word) {
        char[] wordChar = word.toCharArray();

        for (int i = 0; i < wordChar.length /2; i++) {
            char temp = wordChar[i];
            wordChar[i] = wordChar[wordChar.length-1-i];
            wordChar[wordChar.length-1-i] = temp;
        }

        return String.valueOf(wordChar);
    }
}