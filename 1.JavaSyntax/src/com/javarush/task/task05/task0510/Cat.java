package com.javarush.task.task05.task0510;

/*
Кошкоинициация
*/

public class Cat {

    String name;
    int age;
    int weight;
    String address;
    String color;


    public void initialize(String name) {
        this.name = name;
        this.age = 3;
        this.weight = 4;
        this.color = "Grey";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Grey";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 4;
        this.color = "Grey";
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 3;
    }


    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.address = address;
        this.color = color;
        this.age = 3;
    }

    public static void main(final String[] args) {

    }
}
