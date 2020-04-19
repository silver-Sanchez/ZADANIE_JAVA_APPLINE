package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class matrix {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество строк матрицы");
        int a = Integer.parseInt(reader.readLine());

        System.out.println("Введите длинну матрицы");
        int b = Integer.parseInt(reader.readLine());

        int [][] twoDimArray = new int[a][b];

        for (int i = 0; i < a; i++) {
            twoDimArray[a] = new int[]{i};
        }


        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(" " + twoDimArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
