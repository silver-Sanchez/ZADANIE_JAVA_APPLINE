package com.company;

//Итоговая задача №1
//        Ввести с консоли число в бинарном формате. Перевести его в десятичный формат,
//        записать в переменную int и вывести на экран. Необходимо использовать циклы,
//        нельзя использования готовые методы языка Java, для перевода числа из одной
//        системы счисления в другую.

import java.util.Scanner;

public class itog1 {
    public static void main(String[] args)   {
        {
            System.out.println("число в бинарном формате");
            Scanner in = new Scanner(System.in);
            String numer = in.nextLine();
  //   String numer = reader.readLine();


            if (numer.length() >= 32 ){
                System.out.println("число превышает допустимый размер Integer");
            }


            try
            {



                Float.parseFloat(numer);

                int result = 0;
                for (int i = 0; i < numer.length() && i < 32; i++) {
                    if (numer.charAt(numer.length() -1 - i) == '1'){
                        result += Math.pow(2, i);
                    }
                }

                System.out.println("Результат в десятичной: " + result);

            }

            catch (NumberFormatException e)

            {

                System.out.println(numer + " что это? это не число, введите число");

            }

        }




    }
}

