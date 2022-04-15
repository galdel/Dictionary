package com.ag;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        String fileName="words.txt";
        HashMap<String, String> words = new ReadWords(fileName).read();
        new WriteWords(words, fileName).write();
        ArrayList<String> keyWords = new ArrayList<>(words.keySet());
        int index = 0;
        while (true) {
            Random generator = new Random();
            if (generator.nextBoolean() == true){
                int rnd = generator.nextInt(words.keySet().toArray().length);
                String key = words.keySet().toArray()[rnd].toString();
                String value = words.values().toArray()[rnd].toString();
                System.out.println(key);
                Scanner in = new Scanner(System.in);
                System.out.print("Ответ: ");
                String name = in.nextLine();
                if (name.toLowerCase().equals(value.toLowerCase())) {
                    System.out.println("Верно!");}
                else {
                    System.out.print("Не верно! Верно так: ");
                    System.out.println(value.toUpperCase());
                }
            }
            else {
                int rnd = generator.nextInt(words.keySet().toArray().length);
                String key = words.keySet().toArray()[rnd].toString();
                String value = words.values().toArray()[rnd].toString();
                System.out.println(value);
                Scanner in = new Scanner(System.in);
                System.out.print("Ответ: ");
                String name = in.nextLine();
                if (name.toLowerCase().equals(key.toLowerCase())) {
                    System.out.println("Верно!");}
                else {
                    System.out.print("Не верно! Верно так: ");
                    System.out.println(key.toUpperCase());
                }
            }
        }
    }

}

