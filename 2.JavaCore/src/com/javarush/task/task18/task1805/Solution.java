package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
Сортировка байт
*/

public class Solution {
    public static void main(final String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
        ArrayList<Integer> bytesArrayList = new ArrayList<>();

        while (fileInputStream.available() > 0) {
            Integer data = fileInputStream.read();
            if (!bytesArrayList.contains(data))
                bytesArrayList.add(data);
        }

        fileInputStream.close();
        Collections.sort(bytesArrayList);

        for (Integer integer: bytesArrayList) {
            System.out.print(integer + " ");
        }
    }
}
