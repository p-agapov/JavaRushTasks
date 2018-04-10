package com.javarush.task.task20.task2022;

import java.io.*;

/*
Переопределение сериализации в потоке
*/
public class Solution implements Serializable, AutoCloseable {
    private final String fileName;
    private transient FileOutputStream stream;

    public Solution(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(this.fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws Exception {

        Solution solution = new Solution("2.JavaCore/src/com/javarush/task/task20/task2022/file.txt");
        solution.writeObject("Data before serialization.");
        solution.close();

        FileOutputStream fileOutputStream = new FileOutputStream("2.JavaCore/src/com/javarush/task/task20/task2022/file.dat");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(solution);
        outputStream.flush();
        outputStream.close();

        FileInputStream fileInputStream = new FileInputStream("2.JavaCore/src/com/javarush/task/task20/task2022/file.dat");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

        Solution newSolution = (Solution) inputStream.readObject();
        inputStream.close();
        newSolution.writeObject("Data after deserialization.");
        newSolution.close();
    }
}
