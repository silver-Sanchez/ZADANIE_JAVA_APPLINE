package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class vivoddannih {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        int number = Integer.parseInt(reader.readLine());


        int x = 1;
        int y = 2;
        int z = 3;





        if (number == x || number == y || number == z) {
            System.out.println("Данное значение " + number + " имеется в константах");
        }
        else {
            System.out.println("Такой константы " + number + " нет!");
        }



    }
}

