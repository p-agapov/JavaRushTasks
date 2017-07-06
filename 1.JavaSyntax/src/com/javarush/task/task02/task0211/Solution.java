package com.javarush.task.task02.task0211;

/*
Самое нужное число
*/
public class Solution {
    public static void main(final String[] args) {
        int x = 1;
        int y = 0;

        y = y + x;

        x = x * 2;
        y = y + x;

        x = x * 2;
        //y = y + x;

        x = x * 2;
        //y = y + x;

        x = x * 2;
        y = y + x;

        System.out.println(y);
    }
}
