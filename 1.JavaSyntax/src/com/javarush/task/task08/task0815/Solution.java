package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();

        map.put("Иванов",       "Василий");
        map.put("Сидоров",      "Петр");
        map.put("Петров",       "Петр");
        map.put("Аваков",       "Петр");
        map.put("Пупкин",       "Петр");
        map.put("Кукушкин",     "Павел");
        map.put("Колотушкин",   "Василий");
        map.put("Медведев",     "Иван");
        map.put("Федоров",      "Виктор");
        map.put("Азазаев",      "Алексей");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;

        for (String value : map.values())
            if (value.equals(name))
                count++;

        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;

        for (String key : map.keySet())
            if (key.equals(lastName))
                count++;

        return count;
    }

    public static void main(final String[] args) {

    }
}
