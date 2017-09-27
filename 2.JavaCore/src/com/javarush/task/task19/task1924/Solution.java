package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        reader = new BufferedReader(new FileReader(fileName));
        StringBuilder buffer = new StringBuilder();
        while (reader.ready()) {
            buffer.append((char) reader.read());
        }
        reader.close();
        String[] subStrings = buffer.toString().split(" ");
        buffer = new StringBuilder();
        for (int i = 0; i < subStrings.length; i++) {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                try {
                    if (entry.getKey().equals(Integer.parseInt(subStrings[i]))) {
                        subStrings[i] = entry.getValue();
                    }
                } catch (NumberFormatException e) {
                }
            }
            buffer.append(subStrings[i]);
            buffer.append(" ");
        }
        System.out.println(buffer.toString());
    }
}
