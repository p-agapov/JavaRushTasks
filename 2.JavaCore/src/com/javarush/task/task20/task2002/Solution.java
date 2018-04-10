package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File fileName = File.createTempFile("task2002", null);
            OutputStream outputStream = new FileOutputStream(fileName);
            InputStream inputStream = new FileInputStream(fileName);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            /*javaRush.users.add(new User());
            javaRush.users.get(0).setFirstName("Oscar");
            javaRush.users.get(0).setLastName("Smith");
            javaRush.users.get(0).setBirthDate(new Date(90, 00, 01));
            javaRush.users.get(0).setMale(true);
            javaRush.users.get(0).setCountry(User.Country.OTHER);
            javaRush.users.add(new User());
            javaRush.users.get(1).setFirstName("Anna");
            javaRush.users.get(1).setLastName("Petrenko");
            javaRush.users.get(1).setBirthDate(new Date(95, 00, 01));
            javaRush.users.get(1).setMale(false);
            javaRush.users.get(1).setCountry(User.Country.UKRAINE);*/
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны
            //if (javaRush.equals(loadedObject)) System.out.println("Yes!");

            outputStream.close();
            inputStream.close();
            fileName.deleteOnExit();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter writer = new PrintWriter(outputStream);

            if (!users.isEmpty()) {
                for (User user: users) {
                    writer.println(":user");
                    writer.println(user.getFirstName());
                    writer.println(user.getLastName());
                    writer.println(user.getBirthDate().getTime());
                    writer.println(user.isMale());
                    writer.println(user.getCountry());
                }
                writer.flush();
            }
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            while (reader.ready()) {
                if (reader.readLine().equals(":user")) {
                    User user = new User();
                    user.setFirstName(reader.readLine());
                    user.setLastName(reader.readLine());
                    user.setBirthDate(new Date(Long.parseLong(reader.readLine())));
                    user.setMale(Boolean.parseBoolean(reader.readLine()));
                    String country = reader.readLine();
                    switch (country) {
                        case "UKRAINE":
                            user.setCountry(User.Country.UKRAINE);
                            break;
                        case "RUSSIA":
                            user.setCountry(User.Country.RUSSIA);
                            break;
                        case "OTHER":
                            user.setCountry(User.Country.OTHER);
                            break;
                        default:
                            break;
                    }
                    users.add(user);
                }
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
