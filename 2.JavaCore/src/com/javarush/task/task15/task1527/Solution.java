package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Парсер реквестов
*/

public class Solution {
    public static void main(final String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String urlString = bufferedReader.readLine();
        String[] paramStrings = urlString.substring(urlString.indexOf('?') + 1).split("&");

        for (String string: paramStrings) {
            if (string.contains("="))
                string = string.substring(0, string.indexOf('='));
            System.out.print(string + " ");
        }

        System.out.println();

        for (String string: paramStrings) {
            if (string.contains("obj")) {
                string = string.substring(string.indexOf('=') + 1, string.length());
                try {
                    alert(Double.parseDouble(string));
                }
                catch (NumberFormatException e) {
                    alert(string);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
