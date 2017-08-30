package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Самые редкие байты
*/

public class Solution {
    public static void main(final String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
        Map<Integer, Integer> bytesMap = new HashMap<>();
        Integer minCount = Integer.MAX_VALUE;

        while (fileInputStream.available() > 0) {
            Integer key = fileInputStream.read();
            Integer value = bytesMap.getOrDefault(key, 0);
            bytesMap.put(key, value + 1);
            if (value + 1 < minCount)
                minCount = value + 1;
        }

        fileInputStream.close();

        for (Map.Entry entrySet: bytesMap.entrySet()) {
            if (entrySet.getValue().equals(minCount))
                System.out.print(entrySet.getKey() + " ");
        }
    }
}
