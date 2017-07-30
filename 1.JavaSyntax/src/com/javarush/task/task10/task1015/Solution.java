package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/*
Массив списков строк
*/

public class Solution {
    public static void main(final String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        final int size = 5;
        ArrayList<String>[] arrayLists = new ArrayList[size];

        for (int i = 0; i < size; i++) {
            arrayLists[i] = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                arrayLists[i].add((char) (i + 50) + " " + (char) (j + 100));
            }
        }

        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}