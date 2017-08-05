package com.javarush.task.task13.task1319;

import java.io.*;

/*
Писатель в файл с консоли
*/

public class Solution {
    public static void main(final String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = bufferedReader.readLine();
        String inputString;

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));

        while (true) {
            inputString = bufferedReader.readLine();
            bufferedWriter.write(inputString + "\n");
            bufferedWriter.flush();

            if (inputString.equals("exit"))
                break;
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
