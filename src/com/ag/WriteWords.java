package com.ag;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteWords {
    ArrayList<ReadWords.Word> words = new ArrayList<>();
    String fileName;
    WriteWords(ArrayList<ReadWords.Word> words, String fileName) throws IOException {
        this.words=words;
        this.fileName=fileName;
    }
    public void write() throws IOException {
        FileWriter writer = new FileWriter(fileName);
        for(ReadWords.Word word: words) {
            String eng = word.eng;
            String rus = word.rus;
            writer.write(eng + " = " + rus + System.lineSeparator());
        }
        writer.close();
    }
}
