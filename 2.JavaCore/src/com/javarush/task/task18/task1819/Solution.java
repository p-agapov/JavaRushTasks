package com.javarush.task.task18.task1819;

/*
Объединение файлов
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(final String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream;

        byte[] shiftBuffer = new byte[fileInputStream.available()];
        fileInputStream.read(shiftBuffer);
        fileInputStream.close();

        fileInputStream = new FileInputStream(fileName2);
        fileOutputStream = new FileOutputStream(fileName1);
        byte[] buffer = new byte[fileInputStream.available()];

        fileInputStream.read(buffer);
        fileOutputStream.write(buffer);
        fileOutputStream.write(shiftBuffer);
        fileInputStream.close();
        fileOutputStream.close();
    }
}
