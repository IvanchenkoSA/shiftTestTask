package ru.isa.fileFilter;

import com.beust.jcommander.Parameter;

import java.util.List;

public class Arguments {
    private List<String> inputFiles;
    private String prefix;
    private String path;
    private boolean append = false;
    private Statistics statistics;

    public Arguments(String prefix, String path, boolean append, Statistics statistics) {
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
}
