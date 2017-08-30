package com.javarush.task.task18.task1820;

/*
Округление чисел
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Solution {
    public static void main(final String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileInName = bufferedReader.readLine();
        String fileOutName = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileInName);
        FileOutputStream fileOutputStream = new FileOutputStream(fileOutName);

        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer);

        int startIndex = 0;
        String resultString = "";
        for (int i = 0; i < buffer.length; i++) {
            if (buffer[i] == 32 || i == buffer.length - 1) {
                BigDecimal number;

                if (i == buffer.length - 1)
                    number = new BigDecimal(new String(buffer, startIndex, i - startIndex + 1));
                else
                    number = new BigDecimal(new String(buffer, startIndex, i - startIndex));

                if (number.doubleValue() > 0)
                    resultString += (number.setScale(0, BigDecimal.ROUND_HALF_UP) + " ");
                else
                    resultString += (number.setScale(0, BigDecimal.ROUND_HALF_DOWN) + " ");
                startIndex = i + 1;
            }
        }
        for (int i = 0; i < resultString.length() - 1; i++) {
            fileOutputStream.write((byte) resultString.charAt(i));
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
