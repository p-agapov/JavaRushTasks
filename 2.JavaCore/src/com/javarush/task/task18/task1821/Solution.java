package com.javarush.task.task18.task1821;

/*
Встречаемость символов
*/

import java.io.FileInputStream;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(final String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        Map<Byte, Integer> symbolTreeMap = new TreeMap<>();

        while (fileInputStream.available() > 0) {
            byte readerByte = (byte) fileInputStream.read();
            if (symbolTreeMap.containsKey(readerByte))
                symbolTreeMap.put(readerByte, symbolTreeMap.get(readerByte) + 1);
            else
                symbolTreeMap.put(readerByte, 1);
        }
        fileInputStream.close();

        for (Map.Entry<Byte, Integer> entry: symbolTreeMap.entrySet()) {
            System.out.println((char) entry.getKey().byteValue() + " " + entry.getValue());
        }
    }
}
