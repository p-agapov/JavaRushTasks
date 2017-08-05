package com.javarush.task.task13.task1326;

/*
Сортировка четных чисел из файла
*/


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(final String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
        Scanner scanner = new Scanner(fileInputStream);

        ArrayList<Integer> arrayList = new ArrayList<>();

        while (scanner.hasNext()) {
            arrayList.add(scanner.nextInt());
        }

        scanner.close();
        fileInputStream.close();
        bufferedReader.close();

        Collections.sort(arrayList);

        for (Integer i : arrayList) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
