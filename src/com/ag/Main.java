package com.ag;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        HashMap<String, String> words = new HashMap<>();
        FileReader fileReader = new FileReader("words.txt");
        BufferedReader reader = new BufferedReader(fileReader);
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            String[] parts = line.split(" = ");
            String key = parts[0];
            String value = parts[1];
            words.put(key, value);
            System.out.println(words);
        }

        FileWriter writer = new FileWriter("words.txt");
        for (Map.Entry<String, String> entry : words.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            writer.write(key + " = " + value + System.lineSeparator());
        }
        writer.close();
    }
}
