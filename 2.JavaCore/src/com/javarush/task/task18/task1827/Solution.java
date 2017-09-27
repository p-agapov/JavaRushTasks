package com.javarush.task.task18.task1827;

/*
Прайсы
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Solution {
    private static final int ID_LENGTH = 8;
    private static final int PRODUCT_NAME_LENGTH = ID_LENGTH + 30;
    private static final int PRICE_LENGTH = PRODUCT_NAME_LENGTH + 8;
    private static final int QUANTITY_LENGTH = PRICE_LENGTH + 4;

    public static void main(final String[] args) throws Exception {
        String option;

        try {
            option = args[0];
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            option = "";
        }

        if (option.equals("-c")) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = bufferedReader.readLine();
            bufferedReader.close();

            StringBuilder newProductName = new StringBuilder();
            ArrayList<String> buffer = new ArrayList<>();

            bufferedReader = new BufferedReader(new FileReader(fileName));

            int maxId = 0;
            while (bufferedReader.ready()) {
                buffer.add(bufferedReader.readLine());
                int currentId = Integer.parseInt(
                        buffer.get(buffer.size() - 1).substring(0, 8).replaceAll("\\s", ""));
                if (maxId < currentId)
                    maxId = currentId;
            }

            bufferedReader.close();

            newProductName.append(maxId + 1);

            while (newProductName.length() < ID_LENGTH) {
                newProductName.append(' ');
            }

            for (int i = 1; i < args.length - 2; i++) {
                newProductName.append(args[i]);
                newProductName.append(' ');
            }

            if (newProductName.length() > PRODUCT_NAME_LENGTH)
                newProductName.setLength(PRODUCT_NAME_LENGTH);
            else {
                while (newProductName.length() < PRODUCT_NAME_LENGTH) {
                    newProductName.append(' ');
                }
            }

            newProductName.append(args[args.length - 2]);

            if (newProductName.length() > PRICE_LENGTH)
                newProductName.setLength(PRICE_LENGTH);
            else {
                while (newProductName.length() < PRICE_LENGTH) {
                    newProductName.append(' ');
                }
            }

            newProductName.append(args[args.length - 1]);

            if (newProductName.length() > QUANTITY_LENGTH)
                newProductName.setLength(QUANTITY_LENGTH);
            else {
                while (newProductName.length() < QUANTITY_LENGTH) {
                    newProductName.append(' ');
                }
            }

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            for (String string: buffer)
                bufferedWriter.write(string + "\n");
            bufferedWriter.write(newProductName.toString());
            bufferedWriter.close();
        }
    }
}
