package com.javarush.task.task02.task0217;

/*
Минимум четырех чисел
*/
public class Solution {
    public static int min(final int a, final int b, final int c, final int d) {
        if (min(a, b) < min(c, d))
            return min(a, b);
        else
            return min(c, d);
    }

    public static int min(final int a, final int b) {
        if (a < b)
            return a;
        else
            return b;
    }

    public static void main(final String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
    }
}
