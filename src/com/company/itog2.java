package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class itog2 {
    public static void main(String[] args) throws IOException {

        System.out.println("нужны числа через пробел");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String array[] = reader.readLine().split(" ");

        int numbers[] = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            numbers[i] = Integer.parseInt(array[i]);
        }

        shellSort(numbers);
        System.out.println("массив по возрастанию : " + Arrays.toString(numbers));
    }

    public static void shellSort(int[] array) {
        int h = 1;
        while (h*3 < array.length)
            h = h * 3 + 1;

        while(h >= 1) {
            hSort(array, h);
            h = h/3;
        }
    }

    private static void hSort(int[] array, int h) {
        int length = array.length;
        for (int i = h; i < length; i++) {
            for (int j = i; j >= h; j = j - h) {
                if (array[j] < array[j - h])
                    swap(array, j, j - h);
                else
                    break;
            }
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
