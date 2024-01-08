/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author phamm
 */
public class Word implements Comparable<Word> {

    private String word;
    private int count;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Word(String word) {
        this.word = word;
        this.count = 0;
    }

    public Word(String word, int count) {
        this.word = word;
        this.count = count;
    }

    public void addCount() {
        count++;
    }

    @Override
    public String toString() {
        return word + "= " + count;
    }

    @Override
    public int compareTo(Word o) {
        return this.word.compareTo(o.word);
    }



}
