package com.ag;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WriteWords {
    HashMap<String, String> words = new HashMap<>();
    String fileName;
    WriteWords(HashMap<String, String> words, String fileName) throws IOException {
        this.words=words;
        this.fileName=fileName;
    }
    public void write() throws IOException {
        FileWriter writer = new FileWriter(fileName);
        for (Map.Entry<String, String> entry : words.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            writer.write(key + " = " + value + System.lineSeparator());
        }
        writer.close();
    }
}
