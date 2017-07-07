package com.javarush.task.task04.task0426;

/*
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(final String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());

        String out;

        if (number == 0)
            out = "ноль";
        else if (number > 0) {
            out = "положительное ";
            if (number % 2 == 0)
                out += "четное число";
            else
                out += "нечетное число";
        }
        else {
            out = "отрицательное ";
            if (number % 2 == 0)
                out += "четное число";
            else
                out += "нечетное число";
        }

        System.out.println(out);
    }
}
