package ru.isa.fileFilter;


import java.util.List;

// Из полей этого класса будут извлекаться файлы для чтения и записи конечных файлов, с опциональной конфигурацией и предоставлением статистики

public class Arguments {
    private final List<String> inputFiles;
    private final String prefix;
    private final String path;
    private final boolean append;
    private final Statistics statistics;

    public Arguments(String prefix, String path, boolean append, Statistics statistics, List<String> inputFiles) {
        this.inputFiles = inputFiles;
        this.prefix = prefix;
        this.path = path;
        this.append = append;
        this.statistics = statistics;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getPath() {
        return path;
    }

    public boolean isAppend() {
        return append;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public List<String> getInputFiles() {
        return inputFiles;
    }
}
