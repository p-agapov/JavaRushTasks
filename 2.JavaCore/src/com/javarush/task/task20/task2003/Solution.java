package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/*
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileInputStream inputStream = new FileInputStream(fileName);
        load(inputStream);
        inputStream.close();
    }

    public void save(OutputStream outputStream) throws Exception {
        Properties props = new Properties();
        for (Map.Entry<String, String> entry: properties.entrySet()) {
            props.setProperty(entry.getKey(), entry.getValue());
        }
        props.store(outputStream, "Properties JavaRush");
    }

    public void load(InputStream inputStream) throws Exception {
        Properties props = new Properties();
        props.load(inputStream);
        Set<String> propertieSet = props.stringPropertyNames();
        for (String key: propertieSet) {
            properties.put(key, props.getProperty(key));
        }
    }

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        solution.fillInPropertiesMap();
        File file = File.createTempFile("task2003", null);
        OutputStream outputStream = new FileOutputStream(file);
        solution.save(outputStream);
        outputStream.close();
        file.deleteOnExit();
    }
}
