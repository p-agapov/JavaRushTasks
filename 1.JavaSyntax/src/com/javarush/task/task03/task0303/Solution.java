package com.javarush.task.task03.task0303;

/*
Обмен валют
*/

public class Solution {
    public static void main(final String[] args) {
        System.out.println(convertEurToUsd(100,  0.88));
        System.out.println(convertEurToUsd(35, 0.88));
    }

    public static double convertEurToUsd(final int eur, final double course) {
        return eur * course;
    }
}
