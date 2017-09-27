package com.javarush.task.task19.task1926;

/*
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    private static ArrayList<String> listOfStrings = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        reader = new BufferedReader(new FileReader(fileName));

        while (reader.ready()) {
            listOfStrings.add(reader.readLine());
        }
        reader.close();

        for (String string: listOfStrings) {
            StringBuilder buffer = new StringBuilder(string);
            buffer.reverse();
            System.out.println(buffer);
        }
    }
}
