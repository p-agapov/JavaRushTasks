package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(final String[] args) {
        switch (args[0]) {
            case "-c":
                try {
                    if (args[2].equals("м"))
                        allPeople.add(Person.createMale(args[1], new SimpleDateFormat("dd/MM/yyyy",
                                Locale.ENGLISH).parse(args[3])));
                    else if (args[2].equals("ж"))
                        allPeople.add(Person.createFemale(args[1], new SimpleDateFormat("dd/MM/yyyy",
                                Locale.ENGLISH).parse(args[3])));
                }
                catch (ParseException e) {}

                System.out.println(allPeople.size() - 1);
                break;
            case "-u":
                Person personToUpdate = allPeople.get(Integer.parseInt(args[1]));
                personToUpdate.setName(args[2]);
                personToUpdate.setSex(args[3] == "м" ? Sex.MALE : Sex.FEMALE);
                try {
                    personToUpdate.setBirthDay(new SimpleDateFormat("dd/MM/yyyy",
                            Locale.ENGLISH).parse(args[4]));
                }
                catch (ParseException e) {}

                break;
            case "-d":
                Person personToDelete = allPeople.get(Integer.parseInt(args[1]));
                personToDelete.setName(null);
                personToDelete.setSex(null);
                personToDelete.setBirthDay(null);
                break;
            case "-i":
                Person personToPrint = allPeople.get(Integer.parseInt(args[1]));
                String stringSex = (personToPrint.getSex() == Sex.MALE ? "м" : "ж");
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                System.out.println(personToPrint.getName() + " " + stringSex + " " +
                        simpleDateFormat.format(personToPrint.getBirthDay()));
                break;
            default:
                break;
        }
    }
}
