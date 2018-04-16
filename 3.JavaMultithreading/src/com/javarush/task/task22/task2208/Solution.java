package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.Map;

/*
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("name", null);
        map.put("country",  null);
        map.put("city", null);
        map.put("age", null);

        System.out.println(getQuery(map));
    }
    public static String getQuery(Map<String, String> params) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Map.Entry entry: params.entrySet()) {
            if (entry.getValue() != null) {
                stringBuilder.append(entry.getKey());
                stringBuilder.append(" = '");
                stringBuilder.append(entry.getValue());
                stringBuilder.append("' and ");
            }
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.delete(stringBuilder.length() - 5,
                    stringBuilder.length());
        }
        return stringBuilder.toString();
    }
}
