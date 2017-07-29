package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(final String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inString = bufferedReader.readLine();
        String vowelsString = "";
        String consonantsString = "";

        for (int i = 0; i < inString.length(); i++) {
            if (inString.charAt(i) == ' ')
                continue;
            else if (isVowel(inString.charAt(i)))
                vowelsString += (inString.charAt(i) + " ");
            else
                consonantsString += (inString.charAt(i) + " ");
        }

        System.out.println(vowelsString);
        System.out.println(consonantsString);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
