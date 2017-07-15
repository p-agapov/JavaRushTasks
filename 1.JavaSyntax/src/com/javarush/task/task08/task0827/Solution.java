package com.javarush.task.task08.task0827;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
Работа с датой
*/

public class Solution {
    public static void main(final String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date curDate = new Date(date);
        SimpleDateFormat dateFormat = new SimpleDateFormat("D");
        String dayOldFormat = dateFormat.format(curDate);
        System.out.println(dayOldFormat);
        int dayNewFormat = Integer.parseInt(dayOldFormat);
        System.out.println(dayNewFormat % 2 != 0);
        return dayNewFormat % 2 != 0;
    }
}
