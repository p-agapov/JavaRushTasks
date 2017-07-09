package com.javarush.task.task05.task0514;

/*
Программист создает человека
*/

public class Solution {
    public static void main(final String[] args) {

        Person person = new Person();
        person.initialize("Vasia", 18);

    }

    static class Person {

        String name;
        int age;

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;

        }
    }
}
