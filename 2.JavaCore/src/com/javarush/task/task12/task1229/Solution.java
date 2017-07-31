package com.javarush.task.task12.task1229;

/*
Родитель класса CTO
*/

public class Solution {

    public static void main(final String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public interface Businessman {
        void workHard();
    }

    public static class Worker {
        public void workHard() {

        }
    }

    public static class CTO extends Worker implements Businessman {

    }
}
