package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class massiv {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размер массива");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введите числа в массив равный " + a);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < a; i++)
        {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int c = 0; c < a; c++)
        {
            System.out.println(list.get(c) *2);
        }

    }
}

