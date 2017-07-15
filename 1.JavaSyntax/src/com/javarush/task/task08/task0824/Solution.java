package com.javarush.task.task08.task0824;

/*
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(final String[] args) {
        Human   eldestSon      = new Human("Alexander", true, 30, new ArrayList<>()),
                youngerSon     = new Human("Paul", true, 25, new ArrayList<>()),
                daughter       = new Human("Kate", false, 20, new ArrayList<>()),
                father         = new Human("Alexander", true, 50, new ArrayList<>(Arrays.asList(eldestSon, youngerSon, daughter))),
                mother         = new Human("Tanya", false, 45, new ArrayList<>(Arrays.asList(eldestSon, youngerSon, daughter))),
                grandFatherDad = new Human("Stanley", true, 80, new ArrayList<>(Arrays.asList(father))),
                grandFatherMom = new Human("Cameron", true, 80, new ArrayList<>(Arrays.asList(mother))),
                grandMotherDad = new Human("Raina", false, 75, new ArrayList<>(Arrays.asList(father))),
                grandMotherMom = new Human("Zena", false, 75, new ArrayList<>(Arrays.asList(mother)));

        System.out.println(grandFatherDad);
        System.out.println(grandFatherMom);
        System.out.println(grandMotherDad);
        System.out.println(grandMotherMom);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(eldestSon);
        System.out.println(youngerSon);
        System.out.println(daughter);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name       = name;
            this.sex        = sex;
            this.age        = age;
            this.children   = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
