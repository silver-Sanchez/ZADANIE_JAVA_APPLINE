package com.company;
import java.io.*;
import java.nio.charset.StandardCharsets;

//Задача №16: Выгрузка данных из файла на экран
//        Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt

public class file {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("./text.txt"), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {

                System.out.println(line);
            }
 
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
