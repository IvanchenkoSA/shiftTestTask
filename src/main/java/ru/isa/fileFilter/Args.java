package ru.isa.fileFilter;

import com.beust.jcommander.Parameter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Args {
    @Parameter(names = "-a")
    public boolean addFlag = false;
    @Parameter
    public String file;
    @Parameter(names = "-p", required = true)
    public String prefix;

    public void stringWriterA(List<String> strList) {
        try {
            // Создаем объект File
            File stringFile = new File(file);

            // Создаем новый файл, если он не существует
            if (stringFile.createNewFile()) {
                try {
                    // Объединяем список в одну строку с разделителем "\n" и записываем в файл
                    String content = String.join("\n", strList);

                    Files.write(Paths.get("strOut.txt"), content.getBytes());
                    System.out.println("Файл создан: " + stringFile.getName());
                    System.out.println("Содержимое списка записано в файл: " + stringFile);
                } catch (IOException e) {
                    System.out.println("Произошла ошибка при записи в файл.");
                    e.printStackTrace();
                }
            } else {
                System.out.println("Новые данные добавлены");
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(stringFile, true))) {
                    String content = String.join("\n", strList);
                    writer.write("\n" + content);

                } catch (IOException e) {
                    e.printStackTrace(); // Обработка исключений
                }
            }

        } catch (IOException e) {
            System.out.println("Произошла ошибка при работе с файлом.");
            e.printStackTrace();
        }
    }


    public void stringWriter(List<String> strList) {
        try {
            // Создаем объект File
            File stringFile = new File(file);

            // Создаем новый файл, если он не существует
            if (stringFile.createNewFile()) {

                try {
                    // Объединяем список в одну строку с разделителем "\n" и записываем в файл
                    String content = String.join("\n", strList);

                    Files.write(Paths.get("strOut.txt"), content.getBytes());
                    System.out.println("Файл создан: " + stringFile.getName());
                    System.out.println("Содержимое списка записано в файл: " + stringFile);
                } catch (IOException e) {
                    System.out.println("Произошла ошибка при записи в файл.");
                    e.printStackTrace();
                }
            } else {
                System.out.println("Файл уже существует, данные перезаписаны");
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(stringFile))) {
                    String content = String.join("\n", strList);
                    writer.write(content);
                } catch (IOException e) {
                    e.printStackTrace(); // Обработка исключений
                }
            }

        } catch (IOException e) {
            System.out.println("Произошла ошибка при работе с файлом.");
            e.printStackTrace();
        }
    }

}


