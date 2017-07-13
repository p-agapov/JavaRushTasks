package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Улицы и дома
*/

public class Solution {
    public static void main(final String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] houseNumber = new int[15];
        int evenAmount = 0,
                oddAmount = 0;

        for (int i = 0; i < houseNumber.length; i++) {
            houseNumber[i] = Integer.parseInt(reader.readLine());

            if (i % 2 == 0)
                evenAmount += houseNumber[i];
            else
                oddAmount += houseNumber[i];
        }

        if (evenAmount > oddAmount)
                System.out.println("В домах с четными номерами проживает больше жителей.");
        else
                System.out.println("В домах с нечетными номерами проживает больше жителей.");

    }
}
