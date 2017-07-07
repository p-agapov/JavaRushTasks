package com.javarush.task.task04.task0420;

/*
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(final String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a > b) {
            if (b > c)
                System.out.println(a + " " + b + " " + c);
            else {
                if (a < c)
                    System.out.println(c + " " + a + " " + b);
                else
                    System.out.println(a + " " + c + " " + b);
            }
        } else {
            if (b < c)
                System.out.println(c + " " + b + " " + a);
            else {
                if (a < c)
                    System.out.println(b + " " + c + " " + a);
                else
                    System.out.println(b + " " + a + " " + c);
            }
        }
    }
}

