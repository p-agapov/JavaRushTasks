package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/*
И еще один адаптер
*/

public class Solution {

    public static void main(final String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String[] data = fileScanner.nextLine().split(" ");

            return new Person(data[1], data[2], data[0],
                    new Date(data[3] + data[4] + data[5]));
        }

        @Override
        public void close() {
            fileScanner.close();
        }
    }
}
