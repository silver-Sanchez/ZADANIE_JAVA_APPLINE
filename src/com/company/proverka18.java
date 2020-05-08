package com.company;
import java.io.*;
import java.nio.charset.StandardCharsets;

//Задача №18: Выгрузка данных из файла, проверка и перезапись
//Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
//        а потом в этот же файл перезаписывать текстовые данные, введенные вручную. Количество
//        строк после перезаписи должно быть столько же, сколько и в изначальном варианте.

public class proverka18 {
    public static void main(String[] args) {

        File file = new File("./ggg.txt");
        int lines = 0;

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(file), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines++;
                System.out.println(line);
            }
          if (file.exists()) {
               file.delete();
                file.createNewFile();
          }


        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("перезаписать? на что? введи слово");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = null;
        try (FileWriter writer = new FileWriter(file, true)) {
            for (int i = 0; i < lines; i++) {
                System.out.println("Осталось заменить строк: " + (lines - i));
                str = reader.readLine();
                writer.write(str + "\n");
            }
            System.out.println("Все строки были заменены");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }
    }
}
