package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<>();

    public static void main(final String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;

        while (true) {
            fileName = bufferedReader.readLine();
            if (fileName.equals("exit"))
                break;
            ReadThread readThread = new ReadThread(fileName);
            readThread.start();
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            super.run();
            try {
                FileInputStream fileInputStream = new FileInputStream(fileName);
                Map<Byte, Integer> symbolMap = new HashMap<>();

                while (fileInputStream.available() > 0) {
                    byte readerByte = (byte) fileInputStream.read();
                    if (symbolMap.containsKey(readerByte))
                        symbolMap.put(readerByte, symbolMap.get(readerByte) + 1);
                    else
                        symbolMap.put(readerByte, 1);
                }

                int max = 0;
                int key = 0;
                for (Map.Entry<Byte, Integer> entry: symbolMap.entrySet()) {
                    if (entry.getValue() > max) {
                        key = entry.getKey();
                        max = entry.getValue();
                    }
                }
                resultMap.put(fileName, key);

                fileInputStream.close();
            }
            catch (Exception e) {}
        }
    }
}
