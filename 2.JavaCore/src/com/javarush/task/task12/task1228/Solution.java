package com.javarush.task.task12.task1228;

/*
Интерфейсы к классу Human
*/

public class Solution {
    public static void main(final String[] args) {
        Human human = new Human();
        System.out.println(human);
    }

    public static interface Worker {
        void workLazy();
    }

    public static interface Businessman {
        void workHard();
    }

    public static interface Secretary {
        void workLazy();
    }

    public static interface Miner {
        void workVeryHard();
    }

    public static class Human implements Worker, Businessman, Secretary {

        public void workHard() {
        }

        public void workLazy() {
        }
    }
}
