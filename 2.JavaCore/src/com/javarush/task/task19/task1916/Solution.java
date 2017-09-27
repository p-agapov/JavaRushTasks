package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<>();

    public static void main(final String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String f1Name = bufferedReader.readLine();
        String f2Name = bufferedReader.readLine();
        bufferedReader.close();

        BufferedReader file1Reader = new BufferedReader(new FileReader(f1Name));
        BufferedReader file2Reader = new BufferedReader(new FileReader(f2Name));

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        while (file1Reader.ready()) {
            list1.add(file1Reader.readLine());
        }
        while (file2Reader.ready()) {
            list2.add(file2Reader.readLine());
        }
        file1Reader.close();
        file2Reader.close();
        int i1 = 0;
        int i2 = 0;
        boolean firstReachedLast = false;
        boolean secondReachedLast = false;

        while (!firstReachedLast && !secondReachedLast) {
            if (i1 >= list1.size()) {
                firstReachedLast = true;
            }
            if (i2 >= list2.size()) {
                secondReachedLast = true;
            }

            if (firstReachedLast && !secondReachedLast) {
                if (lines.get(lines.size() - 1).type.equals(Type.SAME)) {
                    lines.add(new LineItem(Type.ADDED, list2.get(i2)));
                }
                break;
            }
            if (secondReachedLast && !firstReachedLast) {
                if (lines.get(lines.size() - 1).type.equals(Type.SAME)) {
                    lines.add(new LineItem(Type.REMOVED, list1.get(i1)));
                }
                break;
            }

            if (list1.get(i1).equals(list2.get(i2))) {
                lines.add(new LineItem(Type.SAME, list1.get(i1)));

                if (i1 < list1.size()) {
                    i1++;
                } else {
                    firstReachedLast = true;
                }
                if (i2 < list2.size()) {
                    i2++;
                } else {
                    secondReachedLast = true;
                }
            } else if (!firstReachedLast && !secondReachedLast) {
                if ((i2 + 1 < list2.size()) && list1.get(i1).equals(list2.get(i2 + 1))) {
                    lines.add(new LineItem(Type.ADDED, list2.get(i2)));
                    lines.add(new LineItem(Type.SAME, list1.get(i1)));

                    i1++;
                    i2++;

                    if (i2 < list2.size()) {
                        i2++;
                    } else {
                        secondReachedLast = true;
                    }
                } else if ((i1 + 1 < list1.size()) && list2.get(i2).equals(list1.get(i1 + 1))) {
                    lines.add(new LineItem(Type.REMOVED, list1.get(i1)));
                    lines.add(new LineItem(Type.SAME, list2.get(i2)));

                    i1++;
                    i2++;

                    if (i1 < list1.size()) {
                        i1++;
                    } else {
                        firstReachedLast = true;
                    }
                }
            }
        }
    }

    public enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
