package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class matrix {
    public static void main (String[] args) {

        int a, b;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
        a = in.nextInt();

        System.out.print("Введите количество столбцов массива: ");
        b = in.nextInt();


        int[][] arr = new int[a][b];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Введите элемент arr[" + i + "][" + j + "]:");
                arr[i][j] = in.nextInt();
            }

        }
        in.close();

        System.out.println("весь массив" );
        for (int h = 0; h < a; h++) {  //идём по строкам
            for (int k = 0; k < b; k++) {//идём по столбцам
                System.out.print(" " + arr[h][k] + "\t" );
            }
            System.out.println();

        }


        System.out.println("умножение");

        for (int j = 0; j < arr[0].length; j++) {
            int tripledArrItem = arr[0][j] * 3;
            System.out.print(" " + tripledArrItem);
        }

        System.out.print(" ");


    }
}



