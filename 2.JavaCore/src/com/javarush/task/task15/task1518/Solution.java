package com.javarush.task.task15.task1518;

/*
Статики и котики
*/

public class Solution {
    public static Cat cat;

    static {
        cat = new Cat();

        System.out.println(cat.name);
    }

    public static void main(final String[] args) {

    }

    static class Cat {
        public String name = "Cat";
    }
}
