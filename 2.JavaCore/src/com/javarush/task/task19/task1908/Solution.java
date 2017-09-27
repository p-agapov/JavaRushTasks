package com.javarush.task.task19.task1908;

/*
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(final String[] args) throws Exception {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        String fileInName = consoleReader.readLine();
        String fileOutName = consoleReader.readLine();
        consoleReader.close();

        BufferedReader bufferedFileReader = new BufferedReader(new FileReader(fileInName));
        BufferedWriter bufferedFileWriter = new BufferedWriter(new FileWriter(fileOutName));
        String[] strings = bufferedFileReader.readLine().split(" ");
        for (String string: strings) {
            try {
                bufferedFileWriter.write(Integer.parseInt(string) + " ");
            }
            catch (NumberFormatException e) {
                continue;
            }
        }

        bufferedFileWriter.flush();
        bufferedFileReader.close();
        bufferedFileWriter.close();
    }
}
