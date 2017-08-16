package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<>();

    static {
        File file = new File(Statics.FILE_NAME);

        Scanner scanner;

        try {
            scanner = new Scanner(file);

            while (scanner.hasNextLine())
                lines.add(scanner.nextLine());
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public static void main(final String[] args) {
        System.out.println(lines);
    }
}
