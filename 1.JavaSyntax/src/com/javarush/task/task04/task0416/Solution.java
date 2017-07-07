package com.javarush.task.task04.task0416;

/*
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(final String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double time = Double.parseDouble(reader.readLine());

        double stage = time % 5;

        if (stage >= 0 && stage < 3)
            System.out.println("зелёный");
        else if (stage >= 3 && stage < 4)
            System.out.println("желтый");
        else if (stage >= 4 && stage < 5)
            System.out.println("красный");
    }
}