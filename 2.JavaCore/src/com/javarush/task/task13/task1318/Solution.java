package com.javarush.task.task13.task1318;

import java.io.*;

/*
Чтение файла
*/

public class Solution {
    public static void main(final String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = bufferedReader.readLine();

        bufferedReader.close();

        InputStream inputStream = new FileInputStream(fileName);

        while (inputStream.available() > 0)
            System.out.print((char) inputStream.read());

        System.out.println();

        inputStream.close();
    }
}