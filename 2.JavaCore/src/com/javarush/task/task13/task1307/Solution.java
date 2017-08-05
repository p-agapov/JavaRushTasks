package com.javarush.task.task13.task1307;

/*
Параметризованый интерфейс
*/

public class Solution {
    public static void main(final String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String> {
        @Override
        public SimpleObject<String> getInstance() {
            return null;
        }
    }
}
