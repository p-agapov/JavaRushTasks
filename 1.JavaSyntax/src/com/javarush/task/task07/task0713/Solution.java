package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Играем в Jолушку
*/

public class Solution {
    public static void main(final String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> inArray = new ArrayList<>();
        ArrayList<Integer> div3Array = new ArrayList<>();
        ArrayList<Integer> div2Array = new ArrayList<>();
        ArrayList<Integer> otherArray = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            inArray.add(Integer.parseInt(reader.readLine()));

            if (inArray.get(i) % 3 == 0)
                div3Array.add(inArray.get(i));
            if (inArray.get(i) % 2 == 0)
                div2Array.add(inArray.get(i));
            if (inArray.get(i) % 3 != 0 && inArray.get(i) % 2 != 0)
                otherArray.add(inArray.get(i));
        }

        printList(div3Array);
        printList(div2Array);
        printList(otherArray);
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
