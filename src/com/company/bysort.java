package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//Задача №15: Сортировка данных в массиве
//        Написать программу сортировки по возрастанию заданного пользователем массива чисел.
//        Использовать пузырьковый метод сортировки.

public class bysort {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("привет, введи числа, но только через пробел");


        String array[] = reader.readLine().split(" ");

        int mainb[] = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            mainb[i] = Integer.parseInt(array[i]);
        }

        mainb = insertIntoSort(mainb);
        System.out.println("вот так как то правильней будет: " + Arrays.toString(mainb));
    }

    public static int[] insertIntoSort(int[] arry) {
        int temp, j;
        for(int i = 0; i < arry.length - 1; i++){
            if (arry[i] > arry[i + 1]) {
                temp = arry[i + 1];
                arry[i + 1] = arry[i];
                j = i;
                while (j > 0 && temp < arry[j - 1]) {
                    arry[j] = arry[j - 1];
                    j--;
                }
                arry[j] = temp;
            }
        }
        return arry;
    }
}

