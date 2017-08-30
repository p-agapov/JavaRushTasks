package com.javarush.task.task18.task1817;

/*
Пробелы
*/

import java.io.FileInputStream;
import java.util.Locale;

public class Solution {
    public static void main(final String[] args) throws Exception {
        int numberOfSpaces = 0;
        FileInputStream fileInputStream = new FileInputStream(args[0]);

        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        fileInputStream.close();

        for (int i = 0; i < buffer.length; i++)
            if (buffer[i] == 32)
                numberOfSpaces++;

        double preResult = ((double) numberOfSpaces) / buffer.length * 100;
        System.out.println(String.format(Locale.ENGLISH, "%.2f", preResult));
    }
}
