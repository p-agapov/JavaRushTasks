package com.javarush.task.task09.task0906;

/*
Логирование стек трейса
*/

public class Solution {
    public static void main(final String[] args) {
        log("In main method");
    }

    public static void log(final String s) {
        String string = "";

        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

        string += (stackTraceElements[2].getClassName() + ": ");
        string += (stackTraceElements[2].getMethodName() + ": " + s);

        System.out.println(string);
    }
}
