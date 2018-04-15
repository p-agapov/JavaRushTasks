package com.javarush.task.task22.task2207;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) {
        try (
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                FileReader fileReader = new FileReader(bufferedReader.readLine())
                )
        {
            StringBuilder buffer = new StringBuilder();

            while (fileReader.ready()) {
                buffer.append((char) fileReader.read());
            }

            ArrayList<String> words =
                    new ArrayList<>(Arrays.asList(buffer.toString().split("[ \r\n]")));

            for (int i = 0; i < words.size(); i++) {
                buffer = new StringBuilder(words.get(i));
                for (int j = i + 1; j < words.size(); j++) {
                    if (words.get(j).equals(buffer.reverse().toString())) {
                        Pair pair = new Pair();
                        pair.first = words.get(i);
                        pair.second = words.get(j);
                        result.add(pair);
                        words.remove(i);
                        words.remove(j - 1);
                        i = 0;
                        break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }
}
