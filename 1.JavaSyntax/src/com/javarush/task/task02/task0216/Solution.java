package com.javarush.task.task02.task0216;

/*
Минимум трёх чисел
*/
public class Solution {
    public static int min(final int a, final int b, final int c) {
        if (b < c) {
            if (a < b)
                return a;
            else
                return b;
        } else {
            if (c < a)
                return c;
            else
                return a;
        }
    }

    public static void main(final String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(10, 5, 10));
    }

}
