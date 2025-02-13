package ru.isa.fileFilter;

import java.util.List;

// Класс предоставляющий методы для работы с файлами (чтение и запись)

public interface FileManager {
    public List<String> readFiles(List<String> inputFiles);
    public void writeFile(List<String> stringList, String fileName, boolean append);
}
