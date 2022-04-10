package com.ag;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ReadWords {
    String fileName;
    HashMap<String, String> words = new HashMap<>();
    ReadWords(String fileName){
        this.fileName=fileName;
    }
    public HashMap<String, String> read() throws IOException {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = reader.readLine();
        while (line != null) {
            String[] parts = line.split(" = ");
            String key = parts[0];
            String value = parts[1];
            words.put(key, value);
            line = reader.readLine();
        }
        return words;
    }
}
