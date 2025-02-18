package ru.isa.fileFilter;

import java.io.IOException;
import java.util.List;


public interface FileManager {
    List<String> readFiles(List<String> inputFiles) throws IOException;
    void writeFile(List<String> stringList, String fileName, boolean append, String directory);
}
