package com.javarush.task.task18.task1828;

/*
Прайсы 2
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Solution {
    private static final int ID_LENGTH = 8;
    private static final int PRODUCT_NAME_LENGTH = ID_LENGTH + 30;
    private static final int PRICE_LENGTH = PRODUCT_NAME_LENGTH + 8;
    private static final int QUANTITY_LENGTH = PRICE_LENGTH + 4;

    public static void main(final String[] args) throws Exception {
        String option;

        try {
            option = args[0];
        } catch (ArrayIndexOutOfBoundsException exception) {
            option = "";
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        StringBuilder newProductName = new StringBuilder();
        LinkedList<Integer> idList = new LinkedList<>();
        LinkedList<String> dataList = new LinkedList<>();

        bufferedReader = new BufferedReader(new FileReader(fileName));

        while (bufferedReader.ready()) {
            String productString = bufferedReader.readLine();
            int currentId = Integer.parseInt(
                    productString.substring(0, ID_LENGTH).replaceAll("\\s", ""));

            idList.add(currentId);
            dataList.add(productString);
        }

        bufferedReader.close();

        if (option.equals("-u")) {

            newProductName.append(args[1]);

            while (newProductName.length() < ID_LENGTH) {
                newProductName.append(' ');
            }

            for (int i = 2; i < args.length - 2; i++) {
                newProductName.append(args[i]);
                newProductName.append(' ');
            }

            if (newProductName.length() > PRODUCT_NAME_LENGTH) {
                newProductName.setLength(PRODUCT_NAME_LENGTH);
            } else {
                while (newProductName.length() < PRODUCT_NAME_LENGTH) {
                    newProductName.append(' ');
                }
            }

            newProductName.append(args[args.length - 2]);

            if (newProductName.length() > PRICE_LENGTH) {
                newProductName.setLength(PRICE_LENGTH);
            } else {
                while (newProductName.length() < PRICE_LENGTH) {
                    newProductName.append(' ');
                }
            }

            newProductName.append(args[args.length - 1]);

            if (newProductName.length() > QUANTITY_LENGTH) {
                newProductName.setLength(QUANTITY_LENGTH);
            } else {
                while (newProductName.length() < QUANTITY_LENGTH) {
                    newProductName.append(' ');
                }
            }

            Integer updateId = Integer.parseInt(args[1]);
            if (idList.contains(updateId)) {
                dataList.set(idList.indexOf(updateId), newProductName.toString());
            }


        } else if (option.equals("-d")) {
            Integer deleteId = Integer.parseInt(args[1]);
            if (idList.contains(deleteId)) {
                dataList.remove(idList.indexOf(deleteId));
            }
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        for (String string: dataList) {
            bufferedWriter.write(string + "\n");
        }
        bufferedWriter.close();
    }
}
