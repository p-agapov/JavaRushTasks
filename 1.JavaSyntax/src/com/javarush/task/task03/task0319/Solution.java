package com.javarush.task.task03.task0319;

/*
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(final String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        int salary = Integer.parseInt(reader.readLine());
        int time = Integer.parseInt(reader.readLine());

        System.out.println(name + " получает " + salary + " через " + time + " лет.");
    }
}
