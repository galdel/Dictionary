package com.ag;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadWords {
    class Word{
        String eng;
        String rus;
        Word(String eng, String rus){
            this.eng = eng;
            this.rus = rus;
        }
    }
    String fileName;
    ArrayList<Word> words = new ArrayList<>();
    //HashMap<String, String> words = new HashMap<>();
    ReadWords(String fileName){
        this.fileName=fileName;
    }
    public ArrayList<Word> read() throws IOException {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = reader.readLine();
        while (line != null) {
            String[] parts = line.split(" = ");
            String eng = parts[0];
            String rus = parts[1];
            Word word = new Word(eng,rus);
            words.add(word);
            line = reader.readLine();
        }
        return words;
    }
}
