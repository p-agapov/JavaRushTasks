package com.javarush.task.task04.task0442;

/*
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(final String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        while (true) {
            int i = Integer.parseInt(reader.readLine());
            if (i == -1) {
                sum += i;
                System.out.println(sum);
                break;
            }
            else
                sum += i;
        }
    }
}
