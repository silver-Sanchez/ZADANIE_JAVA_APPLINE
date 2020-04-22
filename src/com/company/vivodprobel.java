package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class vivodprobel {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("введите слово");
        String a = reader.readLine();

        a = a.replaceAll("\\s", "");
        System.out.println("смешно, вы сказали: " + a);
    }

}
