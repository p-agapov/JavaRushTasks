package com.javarush.task.task01.task0132;

/*
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(final String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(final int number) {
        return (number / 100) + ((number % 100) / 10) + number % 100 % 10;
    }
}
