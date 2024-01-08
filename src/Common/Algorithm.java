package Common;

import Model.Word;
import Model.Words;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Algorithm {

    StringTokenizer tokenizer;

    public String[] getWordsInString(String input) {
        tokenizer = new StringTokenizer(input, " !@#$%^&*_+{};':<>?,./");
        String[] result = new String[tokenizer.countTokens()];
        int i = 0;
        while (tokenizer.hasMoreTokens()) {
            result[i] = tokenizer.nextToken();
            i++;
        }
        return result;
    }
    
    public String[] getCharInString (String input) {
        String[] temp = null;
        temp = String.join("", input.split("[\\s!@#$%^&*()_+={}\\[\\]:;<>,.?~\\\\/-]+")).split("");
        return temp;
    }
    
    public Words countWordsPlus(Words words) {
        Words res = new Words();
        for (Word word : words) {
            if (res.isEmpty()) res.add(word);
            if (!res.contains(word)) res.add(word);
        }
        for (Word t : res) {
            for (Word w : words) {
                if (t.equals(w)) {
                    t.addCount();
                }
            }
        }
        return res;
    }
    
    public int[] countChars(String input) {
        int[] charCount = new int[128];

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            charCount[c]++;
        }
        return charCount;
        
    }

}
