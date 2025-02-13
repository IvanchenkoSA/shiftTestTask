package ru.isa.fileFilter;


// Необходим для обработки строки с аргументами. Возвращает объект типа Arguments


public interface ArgumentParser {
    public Arguments parse(String[] args);
}
