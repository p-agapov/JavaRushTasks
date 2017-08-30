package com.javarush.task.task18.task1818;

/*
Два в одном
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(final String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fileOutputStream = new FileOutputStream(bufferedReader.readLine());
        FileInputStream fileInputStream1 = new FileInputStream(bufferedReader.readLine());
        FileInputStream fileInputStream2 = new FileInputStream(bufferedReader.readLine());

        byte[] buffer = new byte[fileInputStream1.available()];
        fileInputStream1.read(buffer);
        fileOutputStream.write(buffer);

        buffer = new byte[fileInputStream2.available()];
        fileInputStream2.read(buffer);
        fileOutputStream.write(buffer);

        fileOutputStream.close();
        fileInputStream1.close();
        fileInputStream2.close();
    }
}
