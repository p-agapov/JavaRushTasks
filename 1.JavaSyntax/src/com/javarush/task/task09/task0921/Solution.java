package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Метод в try..catch
*/

public class Solution {
    public static void main(final String[] args) {
        readData();
    }

    public static void readData() {

        ArrayList<Integer> arrayList = new ArrayList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            while (true)
                arrayList.add(Integer.parseInt(bufferedReader.readLine()));
        }
        catch (Exception e) {
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.println(arrayList.get(i));
            }
        }
    }
}
