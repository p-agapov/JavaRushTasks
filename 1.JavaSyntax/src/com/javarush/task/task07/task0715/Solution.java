package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
Продолжаем мыть раму
*/

public class Solution {
    public static void main(final String[] args) throws Exception {

        ArrayList<String> array = new ArrayList<>();

        Collections.addAll(array, "мама", "мыла", "раму");

        array.add(1, "именно");
        array.add(3, "именно");
        array.add(5, "именно");

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}
