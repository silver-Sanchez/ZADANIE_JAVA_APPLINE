package com.company;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//Задача №17: Запись данных в файл
//        Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
//        Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли. Пользователь при тестировании программы по
//        правилу черного ящика должен понимать, какой принцип остановки записи в файл он должен подать.

public class zapisfile {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите текст для заполнения файла");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("хочешь закончит? введи стоп");

        
        String str = null;

        try (FileWriter writer = new FileWriter("./get_hi.txt", true)) {
            while (!"стоп".equals(str)) {
                str = reader.readLine();
                writer.write(str);
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
