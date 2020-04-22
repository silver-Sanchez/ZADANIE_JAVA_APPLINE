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

;
        int len2 = name1.length();

        int len1 = name2.length();


        if (name1.equals(name2)==true && len2==len1)
            System.out.println("Длины слов равны");
        else
        {
            System.out.println("Длины НЕ слов равны");
        }
    }
}
