package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/*
Функциональности маловато!
*/

public class Solution {
    public static void main(final String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<>();

        while (true) {
            String inputString = reader.readLine();
            if (inputString.isEmpty())
                break;

            int id = Integer.parseInt(inputString);
            String name = reader.readLine();

            map.put(name, id);
        }

        for (Map.Entry<String, Integer> entrySet : map.entrySet()) {
            System.out.println(entrySet.getValue() + " " + entrySet.getKey());
        }
    }
}
