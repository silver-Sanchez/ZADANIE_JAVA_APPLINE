package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class table {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        int a = Integer.parseInt(reader.readLine());

        System.out.println(a*1);
        System.out.println(a*2);
        System.out.println(a*3);
        System.out.println(a*4);
        System.out.println(a*5);
        System.out.println(a*6);
        System.out.println(a*7);
        System.out.println(a*8);
        System.out.println(a*9);
        System.out.println(a*10);


    }
}

