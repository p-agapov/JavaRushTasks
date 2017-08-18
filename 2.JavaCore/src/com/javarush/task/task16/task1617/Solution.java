package com.javarush.task.task16.task1617;

/*
Отсчет на гонках
*/

public class Solution {
    public static volatile int countSeconds = 3;

    public static void main(final String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            try {
                Thread thread = Thread.currentThread();

                while (!thread.isInterrupted()) {
                    if (countSeconds == 0) {
                        System.out.println("Марш!");
                        break;
                    }
                    System.out.print(countSeconds-- + " ");
                    Thread.sleep(1000);
                }
            }
            catch (InterruptedException e) {
                System.out.println("Прервано!");
            }
        }
    }
}
