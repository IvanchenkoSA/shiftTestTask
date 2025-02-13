package ru.isa.fileFilter;

import com.beust.jcommander.Parameter;

import java.util.ArrayList;
import java.util.List;

// Из полей этого класса будут извлекаться файлы для чтения и записи конечных файлов, с опциональной конфигурацией и предоставлением статистики

public class Arguments {
    private List<String> inputFiles;
    private String prefix;
    private String path;
    private boolean append = false;
    private Statistics statistics;

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
