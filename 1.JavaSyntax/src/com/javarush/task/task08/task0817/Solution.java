package com.javarush.task.task08.task0817;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();

        map.put("01", "Василий");
        map.put("02", "Петр");
        map.put("03", "Петр");
        map.put("04", "Петр");
        map.put("05", "Петр");
        map.put("06", "Павел");
        map.put("07", "Василий");
        map.put("08", "Иван");
        map.put("09", "Виктор");
        map.put("10", "Алексей");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<>(map);
        for (String value : copy.values()) {
            if (Collections.frequency(copy.values(), value) > 1)
                removeItemFromMapByValue(map, value);
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(final String[] args) {

    }
}
