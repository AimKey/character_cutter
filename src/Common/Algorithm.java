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
        Arrays.sort(result);
        return result;
    }

    public Words countWords(Words words) {
        Words temp = new Words();
        for (Word word : words) {
            if (temp.isEmpty()) {
                temp.add(word);
            }
            if (temp.isExist(word) == false) {
                temp.add(word);
            }
        }
        for (Word t : temp) {
            for (Word w : words) {
                if (t.getWord().equals(w.getWord())) {
                    t.addCount();
                }
            }
        }
        return temp;
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
