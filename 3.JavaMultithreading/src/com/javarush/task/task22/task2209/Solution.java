package com.javarush.task.task22.task2209;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

/*
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) {
        //3.JavaMultithreading/src/com/javarush/task/task22/task2209/file.in

        try(
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                FileReader fileReader = new FileReader(bufferedReader.readLine())
        ) {
            StringBuilder buffer = new StringBuilder();

            while (fileReader.ready()) {
                buffer.append((char) fileReader.read());
            }

            StringBuilder result = getLine(buffer.toString().split(" "));
            System.out.println(result.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static StringBuilder getLine(String... words) {

        LinkedList<String> list = new LinkedList<>();
        StringBuilder result = new StringBuilder();
        char endChar;

        if (words.length == 0 || words == null) return new StringBuilder();

        for (String word: words) {
            list.add(word);
        }

        Collections.sort(list);

        result.append(list.get(0));
        list.remove(0);
        for (int i = 0; i < list.size(); i++) {
            endChar = Character.toUpperCase(result.charAt(result.length() - 1));
            if (list.get(i).charAt(0) == endChar) {
                result.append(' ');
                result.append(list.get(i));
                list.remove(i);
                i = -1;
            }
        }

        for (String s: list) {
            result.append(' ');
            result.append(s);
        }

        return result;
    }
}
