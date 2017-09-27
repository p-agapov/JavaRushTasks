package com.javarush.task.task19.task1910;

/*
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(final String[] args) throws Exception {
        BufferedReader consoleBufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        String fileInName = consoleBufferedReader.readLine();
        String fileOutName = consoleBufferedReader.readLine();
        consoleBufferedReader.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileInName));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileOutName));

        StringBuilder stringBuilder = new StringBuilder();
        while (bufferedReader.ready()) {
            stringBuilder.append((char) bufferedReader.read());
        }
        bufferedWriter.write(stringBuilder.toString().replaceAll("[\\p{Punct}\\n]", ""));

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
