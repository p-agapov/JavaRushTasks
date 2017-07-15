package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Set из котов
*/

public class Solution {
    public static void main(final String[] args) {
        Set<Cat> cats = createCats();

        Iterator<Cat> iterator = cats.iterator();
        cats.remove(iterator.next());

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> set = new HashSet<>();

        set.add(new Cat());
        set.add(new Cat());
        set.add(new Cat());

        return set;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    public static class Cat {

    }
}
