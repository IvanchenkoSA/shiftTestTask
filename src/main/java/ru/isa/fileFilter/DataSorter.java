package ru.isa.fileFilter;

import java.util.List;

// Предоставляет метод для сортировки данных из входящего листа строк, возвращает объект класса SortResult, который содержит

public interface DataSorter {
    public SortResult sort(List<String> stringList);
}
