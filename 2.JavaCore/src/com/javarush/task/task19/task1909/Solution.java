package com.javarush.task.task19.task1909;

/*
Замена знаков
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

        String text = bufferedReader.readLine();
        bufferedWriter.write(text.replaceAll("\\.", "!"));

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
