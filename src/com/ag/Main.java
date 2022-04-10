package com.ag;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String fileName="words.txt";
        HashMap<String, String> words = new ReadWords(fileName).read();
        new WriteWords(words, fileName).write();
        for (Map.Entry<String, String> entry : words.entrySet()) {
            System.out.println(entry.getKey());
            Scanner in = new Scanner(System.in);
            System.out.print("Ответ: ");
            String name = in.nextLine();
            if (name.equals(entry.getValue())) {
                System.out.println("Верно!");}
            else {
                System.out.println("Не верно!");
                System.out.println(entry.getValue());
            }

        }
    }

}

