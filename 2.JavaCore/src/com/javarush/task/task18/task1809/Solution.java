package com.javarush.task.task18.task1809;

/*
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(final String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
        FileOutputStream fileOutputStream = new FileOutputStream(bufferedReader.readLine());

        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        for (int i = buffer.length - 1; i >= 0; i--) {
            fileOutputStream.write(buffer[i]);
        }

        bufferedReader.close();
        fileInputStream.close();
        fileOutputStream.close();
    }
}
