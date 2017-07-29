package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/*
Список из массивов чисел
*/

public class Solution {
    public static void main(final String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> arrayList = new ArrayList<>();
        arrayList.add(new int[] {5, 5, 5, 5, 5});
        arrayList.add(new int[] {2, 2});
        arrayList.add(new int[] {4, 4, 4, 4});
        arrayList.add(new int[] {7, 7, 7, 7, 7, 7, 7});
        arrayList.add(new int[] {});
        return arrayList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
