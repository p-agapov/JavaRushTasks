package com.javarush.task.task14.task1420;

/*
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(final String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());

            if (a <= 0 || b <= 0)
                throw new Exception();

            //Euclid's GCD Algorithm

            while (a != 0 && b != 0) {
                if (a >= b) {
                    a %= b;
                } else {
                    b %= a;
                }
            }

            System.out.println(a + b);
        }

        finally {
        }
    }
}
