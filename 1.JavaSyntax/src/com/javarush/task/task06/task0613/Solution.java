package com.javarush.task.task06.task0613;

/*
Кот и статика
*/

public class Solution {
    public static void main(final String[] args) {

        for (int i = 0; i < 10; i++)
            new Cat();

        System.out.println(Cat.catCount);
    }

    public static class Cat {

        public static int catCount;

        public Cat() {
            catCount++;
        }
    }
}
