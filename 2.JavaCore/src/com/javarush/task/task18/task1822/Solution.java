package com.javarush.task.task18.task1822;

/*
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(final String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileInName = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileInName);
        int id = Integer.parseInt(args[0]);

        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        String dataString = new String(buffer);
        String[] dataStringArray = dataString.split("\n");
        for (String string: dataStringArray) {
            String[] stringArray = string.split(" ");
            if (Integer.parseInt(stringArray[0]) == id)
                System.out.println(string);
        }
        fileInputStream.close();
    }
}
