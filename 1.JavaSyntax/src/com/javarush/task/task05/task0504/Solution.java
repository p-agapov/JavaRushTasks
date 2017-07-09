package com.javarush.task.task05.task0504;


/*
Трикотаж
*/

public class Solution {
    public static void main(final String[] args) {
        Cat cat1 = new Cat("Cat1", 1,3,2);
        Cat cat2 = new Cat("Cat2", 2,4,4);
        Cat cat3 = new Cat("Cat3", 3,5,3);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
