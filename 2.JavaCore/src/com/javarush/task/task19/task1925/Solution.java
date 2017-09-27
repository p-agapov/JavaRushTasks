package com.javarush.task.task19.task1925;

/*
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        boolean start = true;

        while (reader.ready()) {
            String[] subStings = reader.readLine().split(" ");
            for (String string : subStings) {
                if (string.length() > 6) {
                    if (start) {
                        writer.write(string);
                        start = false;
                    } else {
                        string = "," + string;
                        writer.write(string);
                    }
                }
            }
        }
        reader.close();
        writer.close();
    }
}
