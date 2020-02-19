package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Helper {

    public static ArrayList<Word> sortWordAbc(ArrayList<Word> arrayList){
        arrayList.sort(Comparator.comparing(word -> word.title));
        return  arrayList;
    }

    public static ArrayList<Word> sortWordCountRepeat(ArrayList<Word> arrayList){
        arrayList.sort(Comparator.comparing(word -> word.count));
        return  arrayList;
    }

    public static ArrayList<Word> filterRepeat(ArrayList<Word> arrayList){
        //Счетать количество повторов и возвращать их
        //return массив вернуть
    }

    public static int getCountRepeat(ArrayList<Word> arrayList){
        //Счетать количество повторов и возвращать их
        return  1;
    }
}
