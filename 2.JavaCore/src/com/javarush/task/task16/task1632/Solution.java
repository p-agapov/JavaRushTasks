package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static void main(final String[] args) {
    }

    public static class Thread1 extends Thread {
        @Override
        public void run() {
            super.run();
            while (true) {}
        }
    }

    public static class Thread2 extends Thread {
        @Override
        public void run() {
            super.run();
            try {
                throw new InterruptedException();
            }
            catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Thread3 extends Thread {
        @Override
        public void run() {
            super.run();
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            }
            catch (InterruptedException e) {}
        }
    }

    public static class Thread4 extends Thread implements Message {
        @Override
        public void showWarning() {
            if (this.isAlive())
                this.interrupt();
        }
    }

    public static class Thread5 extends Thread {
        @Override
        public void run() {
            super.run();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int sum = 0;
            String inString;

            try {
                while (true) {
                    inString = bufferedReader.readLine();
                    if (inString.equals("N")) {
                        System.out.println(sum);
                        break;
                    }

                    sum += Integer.parseInt(inString);
                }
            }
            catch (IOException e) {}
        }
    }
}
