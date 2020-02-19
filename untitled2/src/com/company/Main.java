package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String c = reader.readLine();
            int d = Integer.parseInt(c);
            System.out.println(abs(d));

    }


    public static String abs(int d) {
        int v=d%400,k=d%4;
        String IP="";
        if(v==0||k==0)
            IP="Весокосный";
        else
            IP="нЕТ";
return IP;

    }



}
