package com.javarush.task.task19.task1923;

/*
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        String lines = "";
        String[] buffer;
        while (reader.ready()) {
            lines += reader.readLine();
        }
        buffer = lines.split(" ");
        for (int i = 0; i < buffer.length; i++) {
            if (buffer[i].matches(".*\\d.*")) {
                writer.write(buffer[i] + " ");
            }
        }
        reader.close();
        writer.flush();
        writer.close();
    }
}
