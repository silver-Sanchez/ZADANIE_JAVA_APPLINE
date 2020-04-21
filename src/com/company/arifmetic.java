package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arifmetic {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число x");
        double x = Integer.parseInt(reader.readLine());
        System.out.println("Введите число y 2");
        double y = Integer.parseInt(reader.readLine());
        System.out.println("Введите число3 z 3");
        double z = Integer.parseInt(reader.readLine());



        double d = x + y + z;
        double f = d / 3;

        System.out.println("число x = " + x + "число y = " + y + "число z = " + z );
        System.out.println("среднего арифметического чисел x, y, z = " + f );


        if (f > 3 && d % 2 == 0) {
            System.out.println("Программа выполнена корректно");
        }


    }
}

