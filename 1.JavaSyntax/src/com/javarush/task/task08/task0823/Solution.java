package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Омовение Рамы
*/

public class Solution {
    public static void main(final String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        char[] string = s.toCharArray();

        for (int i = 0; i < string.length; i++)
        {
            if (i == 0 && string[i] != ' ')
                string[i] = Character.toUpperCase(string[i]);
            else if (string[i] == ' ' && string[i + 1] != ' ')
                string[i + 1] = Character.toUpperCase(string[i + 1]);
        }

        System.out.println(string);
    }
}
