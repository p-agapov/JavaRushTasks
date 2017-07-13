package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(final String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[20];
        int[] subArray1 = new int[10];
        int[] subArray2 = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
            if (i < 10)
                subArray1[i] = array[i];
            else {
                subArray2[i - 10] = array[i];
                System.out.println(subArray2[i - 10]);
            }
        }
    }
}
