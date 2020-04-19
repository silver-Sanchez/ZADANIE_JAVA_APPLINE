package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class binary {

    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        String str = reader.readLine();

        int n = 0;
        for (int i = 0; i < str.length(); i++) {
            n <<= 1;
            if (str.charAt(i) == '1') n++;


            System.out.println("\"" + str + "\" -> " + n);
        }
    }

}