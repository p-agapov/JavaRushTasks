package com.javarush.task.task04.task0425;

/*
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(final String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());

        if (x > 0) {
            if (y > 0)
                System.out.println(1);
            else
                System.out.println(4);
        }
        else if (y > 0)
            System.out.println(2);
        else
            System.out.println(3);
    }
}
