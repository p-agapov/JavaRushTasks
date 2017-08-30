package com.javarush.task.task18.task1816;

/*
Английские буквы
*/

import java.io.FileInputStream;

public class Solution {
    public static void main(final String[] args) throws Exception {
        int counter = 0;
        FileInputStream fileInputStream = new FileInputStream(args[0]);

        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        fileInputStream.close();

        for (int i = 0; i < buffer.length; i++)
            if (buffer[i] >= 65 && buffer[i] <= 90 ||
                    buffer[i] >= 97 && buffer[i] <= 122)
                counter++;

        System.out.println(counter);
    }
}
