package com.javarush.task.task18.task1825;

/*
Собираем файл
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(final String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        String fullFileName = null;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        Map<Integer, byte[]> partMap = new TreeMap<>();

        while (true) {
            fileName = bufferedReader.readLine();

            if (fileName.equals("end"))
                break;

            fileInputStream = new FileInputStream(fileName);
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
            fileInputStream.close();

            String[] fileNameParts = fileName.split(".part");
            fullFileName = fileNameParts[0];

            partMap.put(Integer.parseInt(fileNameParts[1]), buffer);
        }

        fileOutputStream = new FileOutputStream(fullFileName);
        for (Map.Entry<Integer, byte[]> entry: partMap.entrySet()) {
            fileOutputStream.write(entry.getValue());
        }
        fileOutputStream.close();
    }
}
