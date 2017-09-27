package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String[] buffer;
        Date date;
        String name = "";
        while (reader.ready()) {
            buffer = reader.readLine().split(" ");
            date = new Date(Integer.parseInt(buffer[buffer.length - 1]) - 1900,
                    Integer.parseInt(buffer[buffer.length - 2]) - 1,
                    Integer.parseInt(buffer[buffer.length - 3]));
            for (int i = 0; i < buffer.length - 3; i++) {
                if (i != 0) {
                    name += " ";
                }
                name += buffer[i];
            }
            PEOPLE.add(new Person(name, date));

            name = "";
        }
        reader.close();
    }
}
