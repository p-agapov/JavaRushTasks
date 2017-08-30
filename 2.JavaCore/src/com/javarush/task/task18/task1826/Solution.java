package com.javarush.task.task18.task1826;

/*
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(final String[] args) throws IOException {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        byte[] buffer;

        switch (args[0]) {
            case "-e":
                fileInputStream = new FileInputStream(args[1]);
                buffer = new byte[fileInputStream.available()];
                fileInputStream.read(buffer);
                fileInputStream.close();

                fileOutputStream = new FileOutputStream(args[2]);
                for (int i = 0; i < buffer.length; i++) {
                    fileOutputStream.write(buffer[i] + 1);
                }
                fileOutputStream.close();
                break;
            case "-d":
                fileInputStream = new FileInputStream(args[1]);
                buffer = new byte[fileInputStream.available()];
                fileInputStream.read(buffer);
                fileInputStream.close();

                fileOutputStream = new FileOutputStream(args[2]);
                for (int i = 0; i < buffer.length; i++) {
                    fileOutputStream.write(buffer[i] - 1);
                }
                fileOutputStream.close();
                break;
            default:
                break;
        }
    }
}
