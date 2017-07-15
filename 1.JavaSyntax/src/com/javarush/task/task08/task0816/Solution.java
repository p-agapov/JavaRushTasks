package com.javarush.task.task08.task0816;

import java.util.*;

/*
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("JULY 1 1980"));
        map.put("Stallone2", new Date("AUGUST 1 1980"));
        map.put("Stallone3", new Date("MAY 1 1980"));
        map.put("Stallone4", new Date("JUNE 1 1980"));
        map.put("Stallone5", new Date("JUNE 1 1980"));
        map.put("Stallone6", new Date("JANUARY 1 1980"));
        map.put("Stallone7", new Date("JUNE 1 1980"));
        map.put("Stallone8", new Date("FEBRUARY 1 1980"));
        map.put("Stallone9", new Date("OCTOBER 1 1980"));

        return map;
    }

//    public static void removeAllSummerPeople(HashMap<String, Date> map) {
//        for (Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator(); iterator.hasNext(); ) {
//            Map.Entry<String, Date> entry = iterator.next();
//
//            if (entry.getValue().getMonth() > 4 && entry.getValue().getMonth() < 8)
//                iterator.remove();
//        }
//    }

        public static void removeAllSummerPeople(HashMap<String, Date> map) {
        for (Iterator<Date> iterator = map.values().iterator(); iterator.hasNext(); ) {
            Date date = iterator.next();

            if (date.getMonth() > 4 && date.getMonth() < 8)
                iterator.remove();
        }
    }

    public static void main(final String[] args) {

    }
}
