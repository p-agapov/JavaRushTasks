package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Осваивание статического блока
*/

public class Solution {
    public static void main(final String[] args) {

    }
    
    static {
        try {
            reset();
        }
        catch (IOException e) {}
    }

    public static Flyable result;

    public static void reset() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String inString = bufferedReader.readLine();

        if (inString.equals("helicopter"))
            result = new Helicopter();
        else if (inString.equals("plane")) {
            result = new Plane(Integer.parseInt(bufferedReader.readLine()));
        }
        bufferedReader.close();
    }
}
