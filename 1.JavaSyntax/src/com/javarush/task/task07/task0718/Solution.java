package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Проверка на упорядоченность
*/
public class Solution {
    public static void main(final String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> arrayList = new ArrayList<>();

        int maxLength = 0;

        for (int i = 0; i < 10; i++) {
            arrayList.add(reader.readLine());
        }

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() < maxLength) {
                System.out.println(i);
                break;
            }

            maxLength = arrayList.get(i).length();
        }
    }
}

