package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("01", 10);
        map.put("02", 1000);
        map.put("03", 50);
        map.put("04", 800);
        map.put("05", 100);
        map.put("06", 560);
        map.put("07", 500);
        map.put("08", 1200);
        map.put("09", 5000);
        map.put("10", 110);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        for (Iterator<Integer> iterator = map.values().iterator(); iterator.hasNext(); ) {
            Integer salary = iterator.next();
            if (salary < 500)
                iterator.remove();
        }
    }

    public static void main(final String[] args) {

    }
}