package com.javarush.task.task04.task0427;

/*
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(final String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());

        String out;

        if (number > 0 && number < 1000)
        {
            if (number / 100 > 0)
                out = "трехзначное число";
            else if (number / 10 > 0)
                out = "двузначное число";
            else
                out = "однозначное число";

            if (number % 2 == 0)
                out = "четное " + out;
            else
                out = "нечетное " + out;

            System.out.println(out);
        }
    }
}
