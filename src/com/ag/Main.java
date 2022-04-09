package com.ag;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
	    System.out.println("Hi");
        HashMap<String, String> words = new HashMap<>();
        words.put("Almost","Почти");
        words.put("Afraid","Бояться");
        System.out.println(words);
        FileWriter writer = new FileWriter("words.txt");
        writer.write("Доктор");
        for (Map.Entry<String, String> entry : words.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            writer.write(key + " = " + value + System.lineSeparator());
        }
        writer.close();
    }
}
