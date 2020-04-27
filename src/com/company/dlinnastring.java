package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dlinnastring {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("привет, введи слово");

        String name1 = reader.readLine();

        System.out.println("введи слово второе слово для сравнения");
        String name2 = reader.readLine();



        if (name1.length() > name2.length()){
            System.out.println(name1);

        } else if (name2.length() > name1.length()){

            System.out.println(name2);
        } else {

            System.out.println("Длины строк равны");
        }



    }
}
