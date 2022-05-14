package com.ag;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "words.txt";
        ArrayList<ReadWords.Word> words = new ReadWords(fileName).read();
        new WriteWords(words, fileName).write();
        Collections.shuffle(words);
        Random generator = new Random();
        for (ReadWords.Word word : words) {
            if (generator.nextBoolean() == true) {
                System.out.println(word.eng);
                Scanner in = new Scanner(System.in);
                System.out.print("Ответ: ");
                String name = in.nextLine();
                if (name.toLowerCase().equals(word.rus.toLowerCase())) {
                    System.out.println("Верно!");
                } else {
                    System.out.print("Не верно! Верно так: ");
                    System.out.println(word.rus.toUpperCase());
                }
            } else {
                System.out.println(word.rus);
                Scanner in = new Scanner(System.in);
                System.out.print("Ответ: ");
                String name = in.nextLine();
                if (name.toLowerCase().equals(word.eng.toLowerCase())) {
                    System.out.println("Верно!");
                } else {
                    System.out.print("Не верно! Верно так: ");
                    System.out.println(word.eng.toUpperCase());
                }
            }
        }
    }

}

