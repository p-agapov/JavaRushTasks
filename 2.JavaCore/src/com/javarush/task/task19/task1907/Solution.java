package com.javarush.task.task19.task1907;

/*
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(final String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        FileReader fileReader = new FileReader(fileName);
        StringBuilder stringBuilder = new StringBuilder();
        while (fileReader.ready()) {
            stringBuilder.append((char) fileReader.read());
        }

        int count = 0;
        String[] words = stringBuilder.toString().split("\\W");
        for (String word: words) {
            if (word.equals("world"))
                count++;
        }
        System.out.println(count);

        fileReader.close();
    }
}
