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

        {
            int[] list = new int[a];

            //заполняем
            for (int i = 0; i < list.length; i++)
                list[i] = Integer.parseInt(reader.readLine()); 

            //вывод на экран

          //  System.out.println(list[0] *2);

           for (int i = 0; i < list.length; i++)
               System.out.println(list[i] * 2);

        }
    }


}

