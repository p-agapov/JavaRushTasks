package com.javarush.task.task20.task2027;

import java.util.ArrayList;
import java.util.List;

/*
Кроссворд
*/
public class Solution {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
        detectAllWords(crossword, "home", "same");
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {

        //List of results.
        List<Word> results = new ArrayList<>();

        //Coordinate shifts.
        int xShift;
        int yShift;

        //Letter number.
        int wordShift;

        //Matrix of directions.
        int[][] rose = new int[][]{
                {0, 1},
                {1, 1},
                {1, 0},
                {1, -1},
                {0, -1},
                {-1, -1},
                {-1, 0},
                {-1, 1}
        };

        for (String s: words) {
            for (int i = 0; i < crossword.length; i++) {
                for (int j = 0; j < crossword[i].length; j++) {
                    if (s.charAt(0) == crossword[i][j]) {
                        //Found first letter of the word.
                        Word word = new Word(s);
                        word.setStartPoint(j, i);
                        //Let's us mark end points as -1, to show that we didn't find whole word now.
                        word.setEndPoint(-1, -1);

                        //Searching for a word
                        for (int k = 0; k < rose.length; k++) {
                            xShift = rose[k][0];
                            yShift = rose[k][1];
                            wordShift = 1;
                            searchForLastLetter(crossword, word, yShift, xShift, wordShift, word.startY, word.startX);
                        }

                        //If we've found the whole word we should add it to out list.
                        if (word.endX != -1 && word.endY != -1) results.add(word);
                    }
                }
            }
        }

        return results;
    }

    public static void searchForLastLetter(int[][] crossword, Word word,
                                     int yShift, int xShift, int wordShift, int y, int x) {

        try {
            if (crossword[y + yShift][x + xShift] == word.text.charAt(wordShift)) {
                if (wordShift == word.text.length() - 1) {
                    word.setEndPoint(x + xShift, y + yShift);
                } else {
                    searchForLastLetter(crossword, word, yShift, xShift, ++wordShift, y + yShift, x + xShift);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {}
    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
