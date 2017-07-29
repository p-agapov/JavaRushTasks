package com.javarush.task.task09.task0910;

import java.util.ArrayList;

/*
Исключение при работе с коллекциями List
*/

public class Solution {
    public static void main(final String[] args) throws Exception {

        try {
            ArrayList<String> list = new ArrayList<>();
            String s = list.get(18);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        }
    }
}