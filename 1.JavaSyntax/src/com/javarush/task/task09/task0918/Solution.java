package com.javarush.task.task09.task0918;

/*
Все свои, даже исключения
*/

import java.io.FileNotFoundException;
import java.net.SocketException;

public class Solution {
    public static void main(final String[] args) {
    }
    
    static class MyException extends NumberFormatException {
    }

    static class MyException2 extends ArithmeticException {
    }

    static class MyException3 extends FileNotFoundException {
    }

    static class MyException4 extends SocketException {
    }
}
