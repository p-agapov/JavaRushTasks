package com.javarush.task.task05.task0502;

/*
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        double fac1 = 0.25 * this.age + 0.5 * this.weight + this.strength;
        double fac2 = 0.25 * anotherCat.age + 0.5 * anotherCat.weight + anotherCat.strength;
        if (fac1 > fac2)
            return true;
        else
            return false;
    }

    public static void main(final String[] args) {

    }
}
