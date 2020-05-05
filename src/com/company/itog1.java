package com.company;

//Итоговая задача №1
//        Ввести с консоли число в бинарном формате. Перевести его в десятичный формат,
//        записать в переменную int и вывести на экран. Необходимо использовать циклы,
//        нельзя использования готовые методы языка Java, для перевода числа из одной
//        системы счисления в другую.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class itog1 {
    public static void main(String[] args) throws IOException {
        {
            System.out.println("число в бинарном формате");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String numer = reader.readLine();


            if (numer.length() >= 32){
                System.out.println("число превышает допустимый размер Integer");
            }
            
            int result = 0;
            for (int i = 0; i < numer.length() && i < 32; i++) {
                if (numer.charAt(numer.length() -1 - i) == '1'){
                    result += Math.pow(2, i);
                }
            }

            System.out.println("Результат в десятичной: " + result);

        }
    }
}
