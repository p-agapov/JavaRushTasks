package com.javarush.task.task18.task1808;

/*
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(final String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
        FileOutputStream fileOutputStream1 = new FileOutputStream(bufferedReader.readLine());
        FileOutputStream fileOutputStream2 = new FileOutputStream(bufferedReader.readLine());

        int firstFileSizeInBytes = fileInputStream.available() -
                fileInputStream.available() / 2;
        int secondFileSizeInBytes = fileInputStream.available() -
                firstFileSizeInBytes;

        byte[] buffer = new byte[firstFileSizeInBytes];
        fileInputStream.read(buffer, 0, firstFileSizeInBytes);
        fileOutputStream1.write(buffer);

        buffer = new byte[secondFileSizeInBytes];
        fileInputStream.read(buffer, 0, secondFileSizeInBytes);
        fileOutputStream2.write(buffer);

        bufferedReader.close();
        fileInputStream.close();
        fileOutputStream1.close();
        fileOutputStream2.close();
    }
}
