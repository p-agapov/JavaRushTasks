package com.javarush.task.task18.task1807;

/*
Подсчет запятых
*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(final String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
        int numberOfCommas = 0;

        while (fileInputStream.available() > 0) {
            if (fileInputStream.read() == 44)
                numberOfCommas++;
        }
        bufferedReader.close();
        fileInputStream.close();
        System.out.println(numberOfCommas);
    }
}
