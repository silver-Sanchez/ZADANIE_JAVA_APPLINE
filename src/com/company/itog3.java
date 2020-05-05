package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class itog3 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("а какой сейчас курс доллара? введи:");
        double exchangeRate = Double.parseDouble(reader.readLine());

        System.out.println("сколько у вас рублей:");
        int rubles = Integer.parseInt(reader.readLine());

        System.out.printf("Курс доллара = %.2f, Количество рублей: %d, Итого: ого, целых %.2f  доллара", exchangeRate, rubles, rubles/exchangeRate);
    }
}
