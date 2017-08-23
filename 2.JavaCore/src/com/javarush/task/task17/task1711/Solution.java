package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(final String[] args) {
        Person person;

        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {
                        try {
                            if (args[i + 1].equals("м"))
                                allPeople.add(Person.createMale(args[i], new SimpleDateFormat("dd/MM/yyyy",
                                        Locale.ENGLISH).parse(args[i + 2])));
                            else if (args[i + 1].equals("ж"))
                                allPeople.add(Person.createFemale(args[i], new SimpleDateFormat("dd/MM/yyyy",
                                        Locale.ENGLISH).parse(args[i + 2])));
                        }
                        catch (ParseException e) {}

                        System.out.println(allPeople.size() - 1);
                    }
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 4) {
                        person = allPeople.get(Integer.parseInt(args[i]));
                        person.setName(args[i + 1]);
                        person.setSex(args[i + 2] == "м" ? Sex.MALE : Sex.FEMALE);
                        try {
                            person.setBirthDay(new SimpleDateFormat("dd/MM/yyyy",
                                    Locale.ENGLISH).parse(args[i + 3]));
                        }
                        catch (ParseException e) {}
                    }
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        person = allPeople.get(Integer.parseInt(args[i]));
                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDay(null);
                    }
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        person = allPeople.get(Integer.parseInt(args[i]));
                        String stringSex = (person.getSex() == Sex.MALE ? "м" : "ж");
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy",
                                Locale.ENGLISH);
                        System.out.println(person.getName() + " " + stringSex + " " +
                                simpleDateFormat.format(person.getBirthDay()));
                    }
                }
                break;
        }
    }
}
