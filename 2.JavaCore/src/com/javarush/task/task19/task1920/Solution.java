package com.javarush.task.task19.task1920;

/*
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> map = new TreeMap<>();
        String[] buffer;
        Double max = 0d;
        while (reader.ready()) {
            buffer = reader.readLine().split(" ");
            if (map.containsKey(buffer[0])) {
                map.put(buffer[0], map.get(buffer[0]) +
                        Double.parseDouble(buffer[1]));
            } else {
                map.put(buffer[0], Double.parseDouble(buffer[1]));
            }
            if (max < map.get(buffer[0])) {
                max = map.get(buffer[0]);
            }
        }
        reader.close();
        for (Map.Entry<String, Double> entry: map.entrySet()) {
            if (entry.getValue().equals(max)) {
                System.out.println(entry.getKey());
            }
        }
    }
}
