package com.javarush.task.task04.task0419;

/*
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(final String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        System.out.println(max(max(a, b), max(c, d)));
    }

    public static int max(final int a, final int b) {
        if (a >= b)
            return a;
        else
            return b;
    }
}
