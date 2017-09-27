package com.javarush.task.task19.task1927;

/*
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        testString.printSomething();

        System.setOut(consoleStream);

        byte[] buffer = outputStream.toString().getBytes();
        int counter = 0;
        for (int i = 0; i < buffer.length; i++) {
            if (buffer[i] == 10) {
                counter++;
                if (counter % 2 == 0) {
                    System.out.println("\nJavaRush - курсы Java онлайн");
                    continue;
                }
            }
            System.out.print((char) buffer[i]);
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
