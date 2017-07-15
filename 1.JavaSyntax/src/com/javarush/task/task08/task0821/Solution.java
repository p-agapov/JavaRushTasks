package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(final String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String, String> map = new HashMap<>();

        map.put("01", "01");
        map.put("02", "02");
        map.put("03", "03");
        map.put("04", "05");
        map.put("05", "05");
        map.put("06", "06");
        map.put("07", "07");
        map.put("08", "08");
        map.put("09", "09");
        map.put("05", "05");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
