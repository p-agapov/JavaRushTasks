package com.javarush.task.task14.task1419;

import java.io.FileNotFoundException;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

/*
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<>();

    public static void main(final String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        exceptions.add(new NullPointerException());
        exceptions.add(new IndexOutOfBoundsException());
        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new FileNotFoundException());
        exceptions.add(new SocketException());
        exceptions.add(new IllegalArgumentException());
        exceptions.add(new NumberFormatException());
        exceptions.add(new ArrayStoreException());
        exceptions.add(new RuntimeException());
    }
}
