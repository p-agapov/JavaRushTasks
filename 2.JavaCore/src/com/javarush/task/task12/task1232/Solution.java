package com.javarush.task.task12.task1232;

/*
Нужно добавить в программу новую функциональность
*/

public class Solution {
    public static void main(final String[] args) {
        Pegas horse = new Pegas();
    }

    public interface Fly {
        void fly();
    }

    public static class Horse {
        public void run() {

        }
    }

    public static class Pegas extends Horse implements Fly {
        @Override
        public void fly() {

        }
    }
}
