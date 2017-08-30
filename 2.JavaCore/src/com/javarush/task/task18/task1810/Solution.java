package com.javarush.task.task18.task1810;

/*
DownloadException
*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(final String[] args) throws DownloadException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream;
        String fileName;
        while (true) {
            fileName = bufferedReader.readLine();
            if (fileName.isEmpty())
                break;
            fileInputStream = new FileInputStream(fileName);
            if (fileInputStream.available() < 1000) {
                bufferedReader.close();
                fileInputStream.close();
                throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {}
}
