package com.javarush.task.task19.task1906;

/*
Четные символы
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Solution {
    public static void main(final String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String fileInName = bufferedReader.readLine();
        String fileOutName = bufferedReader.readLine();
        bufferedReader.close();

        FileReader fileReader = new FileReader(fileInName);
        FileWriter fileWriter = new FileWriter(fileOutName);

        boolean even = false;
        while (fileReader.ready()) {
            int buff = fileReader.read();
            if (even)
                fileWriter.write(buff);
            even = !even;
        }

        fileReader.close();
        fileWriter.close();
    }
}
