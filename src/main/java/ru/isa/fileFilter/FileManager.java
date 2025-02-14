package ru.isa.fileFilter;

import java.util.List;

// Интерфейс предоставляющий методы для работы с файлами (чтение и запись)

public interface FileManager {
    List<String> readFiles(List<String> inputFiles);
    void writeFile(List<String> stringList, String fileName, boolean append, String directory);
}
