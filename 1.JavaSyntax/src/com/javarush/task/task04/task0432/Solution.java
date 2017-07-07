package com.javarush.task.task04.task0432;

/*
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(final String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String string = reader.readLine();
        int count = Integer.parseInt(reader.readLine());

        while (count > 0) {
            System.out.println(string);
            count--;
        }
    }
}
