package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
Разные методы для разных типов
*/

public class Solution {
    public static void main(final String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String inString;

        while (true) {
            inString = bufferedReader.readLine();

            if (inString.equals("exit"))
                break;

            try {
                if (inString.contains("."))
                    print(Double.parseDouble(inString));
                else if (Integer.parseInt(inString) > 0
                        && Integer.parseInt(inString) < 128)
                    print(Short.parseShort(inString));
                else if (Integer.parseInt(inString) <= 0
                        || Integer.parseInt(inString) >= 128)
                    print(Integer.parseInt(inString));
                else
                    print(inString);
            }
            catch (Exception e) {
                print(inString);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
