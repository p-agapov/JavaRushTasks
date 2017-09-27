package com.javarush.task.task19.task1918;

/*
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    private static String tag;
    private static String openTag;
    private static String closeTag;
    private static int length;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        tag = args[0];
        openTag = "<" + tag;
        closeTag = "</" + tag + ">";
        length = tag.length();
        String input = new String();
        String line;
        while ((line = fileReader.readLine()) != null) {
            input += line;
        }
        fileReader.close();
        recursiveMethod(input);
    }
    private static void recursiveMethod(String input) {
        int deep = -1;
        int beginTagPosition = 0;
        for (int i = 0; i < input.length() - length - 2; i++) {
            if (openTag.equals(input.substring(i, i + length + 1))) {
                if (deep == -1) {
                    deep = 0;
                }
                if (deep == 0) {
                    beginTagPosition = i;
                }
                deep++;
            }
            else if (closeTag.equals(input.substring(i, i + length + 3))) {
                deep--;
            }
            if (deep == 0) {
                int endPositionOfBeginTagPosition = input.indexOf(">", beginTagPosition);
                String content = input.substring(endPositionOfBeginTagPosition + 1, i);
                System.out.println(input.substring(beginTagPosition, i + length + 3));
                recursiveMethod(content);
                deep = -1;
            }
        }
    }
}
