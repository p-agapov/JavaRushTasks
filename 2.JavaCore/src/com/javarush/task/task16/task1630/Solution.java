package com.javarush.task.task16.task1630;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            firstFileName = bufferedReader.readLine();
            secondFileName = bufferedReader.readLine();

            bufferedReader.close();
        }
        catch (IOException e) {}
    }

    public static void main(final String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fileName;
        private String content = "";

        @Override
        public void run() {
            super.run();

            int symbol;

            try {
                FileReader fileReader = new FileReader(fileName);
                while ((symbol = fileReader.read()) != -1) {
                    if ((char) symbol == '\n')
                        content += " ";
                    else
                        content += (char) symbol;
                }

                fileReader.close();
            }
            catch (IOException e) {}
        }

        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return content;
        }
    }
}
