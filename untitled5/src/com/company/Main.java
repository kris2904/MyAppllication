package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String c = reader.readLine(),c1;
        if(c.equals("")) {
            System.out.println("the quick brown fox jumps over the lazy dog");
            c1="the quick brown fox jumps over the lazy dog";
        }
        else
            c1=c;
        ArrayList<String> array = pars(c1);//общие данные
        //задание 1
        System.out.println("Задание 1");
        writeResult(array);
        System.out.println("");
        //
        ArrayList<String> arrayList= new ArrayList<>(sortWordAbc(pars(c1)));
        //
        //задание 2
        System.out.println("Задание 2");
        writeResult(arrayList);
        System.out.println("");
        //
        //задание 3
        System.out.println("задание 3");
        ArrayList<String> Lists=unical(sortWordAbc(pars(c1)));
        writeResult(Lists);
        System.out.println("");
        //задание 4
        System.out.println("задание 4");
        Map<String,Integer> map=countS(arrayList);
        for (Map.Entry<String,Integer> pair:map.entrySet()){
            System.out.println(pair.getKey()+" "+pair.getValue());
        }
        System.out.println("Готово");
        System.out.println("");
        //
        //задание 5
        System.out.println("задание 5");
        obrat4(map);
        //

    }
    public static void writeResult(ArrayList<String> array) {
        for (String item : array) {
            System.out.println(item);
        }
        System.out.println("Готово");
    }
    //
    //pars(1),также общее для всех
    //
    public static ArrayList<String> pars(String s) {
        String[] words = s.split("\\s+");
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "");
            arrayList.add(words[i]);
        }
        return arrayList;
    }
    //
    //sortWordAbc(2)
    //
    public static ArrayList<String> sortWordAbc(ArrayList<String> arrayList){
        Collections.sort(arrayList);
        return  arrayList;
    }
    //
    //unical(3)
    public static ArrayList<String> unical(ArrayList<String> List){
        ArrayList<String> result=new ArrayList<>();
        String word1,word2;
        for (int i=0;i<List.size();i++){
            word1=List.get(i);;
            for(int j=i+1;j<List.size();j++){
                word2=List.get(j);
                if(word1.equals(word2)){
                    List.remove(j);
                    j--;
                }
            }
            result.add(word1);
        }
        return result;
    }
    //countS(4)
    //
    public static Map<String,Integer> countS(ArrayList<String> list){
        HashMap<String,Integer> result=new HashMap<>();
        String word1,word2;
        int count=0;
        for (int i=0;i<list.size();i++){
            word1=list.get(i);
            count=1;
            for(int j=i+1;j<list.size();j++){
                word2=list.get(j);
                if(word1.equals(word2)){
                    count++;
                    list.remove(j);
                    j--;
                }
            }
            result.put(word1, count);
        }
        return result;
    }

    public static void obrat4(Map listM){
        HashMap<String,Integer> map=new HashMap<String, Integer>(listM);
        List<Map.Entry<String, Integer>> toSort = new ArrayList<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            toSort.add(stringIntegerEntry);
        }
        toSort.sort(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()));
        for (Map.Entry<String, Integer> stringIntegerEntry : toSort) {
            System.out.println(stringIntegerEntry.getKey()+" "+ stringIntegerEntry.getValue());
        }
    }
}
