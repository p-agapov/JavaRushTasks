package com.javarush.task.task22.task2202;

/*
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
        System.out.println(getPartOfString("Амиго и Диего лучшие друзья!"));
    }

    public static String getPartOfString(String string) {
        if (string == null || string.isEmpty()) throw new TooShortStringException();

        String[] subStrings = string.split(" ");

        if (subStrings.length < 5) throw  new TooShortStringException();

        StringBuilder result = new StringBuilder(subStrings[1]);

        for (int i = 2; i < 5; i++) {
            result.append(' ');
            result.append(subStrings[i]);
        }

        return result.toString();
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
