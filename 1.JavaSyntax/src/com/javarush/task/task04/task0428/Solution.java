package com.javarush.task.task04.task0428;

/*
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(final String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int counter = 0;

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a > 0)
            counter++;
        if (b > 0)
            counter++;
        if (c > 0)
            counter++;

        System.out.println(counter);
    }
}
