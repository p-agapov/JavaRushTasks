package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> forRemoveLines = new ArrayList<>();

    public static void main(final String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1;
        String fileName2;
        File file1;
        File file2;
        Scanner scanner;

        try {
            fileName1 = "2.JavaCore/src/com/javarush/task/task17/task1721/" +
                    bufferedReader.readLine();
            fileName2 = "2.JavaCore/src/com/javarush/task/task17/task1721/" +
                    bufferedReader.readLine();

            file1 = new File(fileName1);
            file2 = new File(fileName2);

            bufferedReader.close();

            scanner = new Scanner(file1);
            while (scanner.hasNextLine()) {
                allLines.add(scanner.nextLine());
            }

            scanner = new Scanner(file2);
            while (scanner.hasNextLine()) {
                forRemoveLines.add(scanner.nextLine());
            }

            scanner.close();

            new Solution().joinData();
        }
        catch (FileNotFoundException e) {}
        catch (CorruptedDataException e) {}
        catch (IOException e) {}
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        }
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
