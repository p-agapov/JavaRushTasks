package com.javarush.task.task03.task0304;

/*
Задача на проценты
*/

public class Solution {
    public static double addTenPercent(final int i) {
        return i + 0.1 * i;
    }

    public static void main(final String[] args) {
        System.out.println(addTenPercent(9));
    }
}
