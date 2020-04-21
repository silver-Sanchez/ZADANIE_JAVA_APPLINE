package com.company;
import java.util.Scanner;

public class binary {

    public static void main(String[] args) {

        System.out.println("Введите число в бинарном виде");
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();

        try {

            int number = Integer.parseInt(num, 2);
            System.out.println(number);
        }
        catch (NumberFormatException ex){

            System.out.printf("строка %s не соотвествует бинарному формату 1 и 0.", num);
        }
    }
}
