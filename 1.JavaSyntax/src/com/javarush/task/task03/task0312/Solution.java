package com.javarush.task.task03.task0312;

/*
Конвертируем время
*/

public class Solution {
    public static int convertToSeconds(final int hour) {
        return hour * 3600;
    }

    public static void main(final String[] args) {
        System.out.println(convertToSeconds(1));
        System.out.println(convertToSeconds(9));
    }
}
