package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        reader = new BufferedReader(new FileReader(fileName));
        String buffer;
        while (reader.ready()) {
            int c = 0;
            buffer = reader.readLine();
            for (String string: words) {
                if (buffer.contains(string)) {
                    c++;
                }
            }
            if (c == 2) {
                System.out.println(buffer);
            }
        }
        reader.close();
    }
}
