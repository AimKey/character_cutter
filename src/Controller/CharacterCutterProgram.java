package Controller;

import Common.Algorithm;
import Common.Library;
import Model.Words;
import View.Menu;
import java.util.Arrays;

public class CharacterCutterProgram extends Menu {

    private Words words;
    private Library lb;
    private Algorithm algo;
    private String str;

    public CharacterCutterProgram(String s) {
        super(new String[]{"Count words", "Count characters", "Exit"}, "Character cutter");
        words = new Words();
        lb = new Library();
        algo = new Algorithm();
        str = s;
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1: {
                doCut();
                break;
            }
            case 2: {
                doCount();
                break;
            }
            case 3: {
                System.out.println("See you next time!");
                System.exit(0);
            }
        }
    }

    public void doCut() {
        String[] test = algo.getWordsInString(str);
        words.addAllStrings(test);
        Words result = algo.countWords(words);
        System.out.println("Result: " + result);
    }

    public void doCount() {
        String temp = String.join("", str.split("[\\s!@#$%^&*()_+-=]+"));
        int[] charCount = algo.countChars(temp);
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                System.out.print((char) i + "= " + charCount[i] + ", ");
            }
        }
        System.out.println();
    }
}
