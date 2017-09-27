package com.javarush.task.task19.task1914;

/*
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(final String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);

        System.setOut(printStream);
        testString.printSomething();
        System.setOut(consoleStream);

        String[] subStrings = outputStream.toString().split(" ");
        switch (subStrings[1]) {
            case "+":
                System.out.println(subStrings[0] + " + " + subStrings[2] + " = " +
                        (Integer.parseInt(subStrings[0]) + Integer.parseInt(subStrings[2])));
                break;
            case "-":
                System.out.println(subStrings[0] + " - " + subStrings[2] + " = " +
                        (Integer.parseInt(subStrings[0]) - Integer.parseInt(subStrings[2])));
                break;
            case "*":
                System.out.println(subStrings[0] + " * " + subStrings[2] + " = " +
                        (Integer.parseInt(subStrings[0]) * Integer.parseInt(subStrings[2])));
                break;
            default:
                break;
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}
