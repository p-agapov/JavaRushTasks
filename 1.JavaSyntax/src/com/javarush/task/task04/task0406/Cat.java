package com.javarush.task.task04.task0406;

/*
Реализовать метод setName
*/

public class Cat {
    private String fullName;

    public void setName(final String firstName, final String lastName) {
        String fullName = firstName + " " + lastName;

       this.fullName = fullName;
    }

    public static void main(final String[] args) {

    }
}
