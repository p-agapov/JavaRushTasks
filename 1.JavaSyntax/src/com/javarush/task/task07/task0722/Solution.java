package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Это конец
*/

public class Solution {
    public static void main(final String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> stringList = new ArrayList<>();

        while (true) {
            String inString = reader.readLine();
            if (inString.equals("end"))
                break;
            stringList.add(inString);
        }

        for (int i = 0; i < stringList.size(); i++)
            System.out.println(stringList.get(i));
    }
}