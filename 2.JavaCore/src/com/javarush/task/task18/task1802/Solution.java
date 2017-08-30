package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
Минимальный байт
*/

public class Solution {
    public static void main(final String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());

        int minByte = 255;

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            if (data < minByte)
                minByte = data;
        }
        fileInputStream.close();
        System.out.println(minByte);
    }
}
