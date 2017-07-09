package com.javarush.task.task05.task0507;

/*
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(final String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int counter = 0;
        double sum = 0;

        while (true) {
            double num = Double.parseDouble(reader.readLine());
            if (num == -1) {
                System.out.println(sum / counter);
                break;
            }
            sum += num;
            counter++;
        }
    }
}

