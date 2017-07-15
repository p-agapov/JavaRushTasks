package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Модернизация ПО
*/

public class Solution {
    public static void main(final String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String>    familyNames = new ArrayList<>(),
                        cities      = new ArrayList<>();
        while (true)
        {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            cities.add(city);
            String family = reader.readLine();
            familyNames.add(family);
        }

        String cityName = reader.readLine();

        if (cities.contains(cityName))
        {
            System.out.println(familyNames.get(cities.indexOf(cityName)));
        }
    }
}
