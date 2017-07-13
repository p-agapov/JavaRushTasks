package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самые-самые
*/

public class Solution {
    public static void main(final String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();
        int minLength = 0;
        int maxLength = 0;

        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
            if (i == 0)
                minLength = strings.get(i).length();
            if (strings.get(i).length() < minLength)
                minLength = strings.get(i).length();
            if (strings.get(i).length() > maxLength)
                maxLength = strings.get(i).length();
        }

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == maxLength) {
                System.out.println(strings.get(i));
                break;
            }
            else if (strings.get(i).length() == minLength) {
                System.out.println(strings.get(i));
                break;
            }
        }
    }
}
