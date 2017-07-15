package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/*
Cамая длинная последовательность
*/
public class Solution {
    public static void main(final String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int longestSequence = 1;
        int sequence = 1;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++)
            list.add(Integer.parseInt(reader.readLine()));

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == list.get(i - 1)) {
                sequence++;
            }
            else
                sequence = 1;
            if (sequence > longestSequence)
                longestSequence = sequence;
        }
        System.out.println(longestSequence);
    }
}