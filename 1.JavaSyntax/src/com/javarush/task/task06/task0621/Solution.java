package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Родственные связи кошек
*/

public class Solution {
    public static void main(final String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name;

        name = reader.readLine();
        Cat grandFather = new Cat(name);

        name = reader.readLine();
        Cat grandMother = new Cat(name);

        name = reader.readLine();
        Cat father = new Cat(name, null, grandFather);

        name = reader.readLine();
        Cat mother = new Cat(name, grandMother, null);

        name = reader.readLine();
        Cat son = new Cat(name, mother, father);

        name = reader.readLine();
        Cat daughter = new Cat(name, mother, father);



        System.out.println(grandFather);
        System.out.println(grandMother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        public Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            String out = "Cat name is " + name;
            if (mother == null)
                out += ", no mother";
            else
                out += ", mother is " + mother.name;
            if (father == null)
                out += ", no father";
            else
                out += ", father is " + father.name;

            return out;
        }
    }
}
