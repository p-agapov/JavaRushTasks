package com.javarush.task.task04.task0429;

/*
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(final String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int counterPos = 0;
        int counterNeg = 0;

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a > 0)
            counterPos++;
        else if (a < 0)
            counterNeg++;
        if (b > 0)
            counterPos++;
        else if (b < 0)
            counterNeg++;
        if (c > 0)
            counterPos++;
        else if (c < 0)
            counterNeg++;

        System.out.println("количество отрицательных чисел: " + counterNeg);
        System.out.println("количество положительных чисел: " + counterPos);
    }
}
