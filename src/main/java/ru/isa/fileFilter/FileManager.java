package ru.isa.fileFilter;

import java.io.File;
import java.util.List;

public interface FileManager {
    public List<String> readFiles(List<String> inputFiles);
    public void writeFiles(List<String> stringList, String fileName, boolean append);
}
