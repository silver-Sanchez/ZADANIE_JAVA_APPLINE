package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class massiv {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 2; i++)
        {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int c = 0; c < 2; c++)
        {
            System.out.println(list.get(c) *2);
        }

    }
}

