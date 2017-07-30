package com.javarush.task.task10.task1013;

/*
Конструкторы класса Human
*/

public class Solution {
    public static void main(final String[] args) {
    }

    public static class Human {
        private String name = "";
        private String surname = "";
        private int age = 18;
        private boolean sex = true;
        private Human mother = null;
        private Human father = null;

        public Human() {
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public Human(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        public Human(String name, String surname, int age, boolean sex) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, String surname, int age, boolean sex, Human mother, Human father) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.mother = mother;
            this.father = father;
        }

        public Human(int age, boolean sex) {
            this.age = age;
            this.sex = sex;
        }

        public Human(Human mother, Human father) {
            this.mother = mother;
            this.father = father;
        }

        public Human(String name, String surname, Human mother, Human father) {
            this.name = name;
            this.surname = surname;
            this.mother = mother;
            this.father = father;
        }

        public Human(String name, Human mother, Human father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }
    }
}
