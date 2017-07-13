package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Меняем функциональность
*/

public class Solution {
    public static void main(final String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> listMultiplier = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() % 2 == 0)
                listMultiplier.add(list.get(i) + " " + list.get(i));
            else
                listMultiplier.add(list.get(i) + " " + list.get(i) + " " + list.get(i));
        }

        for (int i = 0; i < listMultiplier.size(); i++) {
            System.out.println(listMultiplier.get(i));
        }
    }
}
