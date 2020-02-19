package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String c1 = reader.readLine();
        ArrayList<Word> array = pars(c1);
        writeResult(array);
        Helper.sortWordAbc(array);
        writeResult(array);
    }

    public static void writeResult(ArrayList<Word> array) {
        for (Word item : array) {
            System.out.println(item.title);
        }
    }

    public static ArrayList<Word> pars(String s) {
        String[] words = s.split("\\s+");
        ArrayList<Word> arrayList = new ArrayList<Word>();
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "");
            arrayList.add(new Word(words[i], 1));
        }
        return arrayList;
    }
}








