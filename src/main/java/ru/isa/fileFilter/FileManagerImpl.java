package ru.isa.fileFilter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManagerImpl implements FileManager {
    @Override
    public List<String> readFiles(List<String> inputFiles) {
        List<String> outputFiles = new ArrayList<>();
        for (String inputFile : inputFiles) {
            File file = new File(inputFile);
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    outputFiles.add(line);
                }
            } catch (FileNotFoundException e) {
                System.out.println(inputFile + " File not found");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return outputFiles;
    }

    @Override
    public void writeFile(List<String> stringList, String fileName, boolean append, String directory) {
        if (stringList.isEmpty()) {
            return;
        }

        if (directory != null) {
            String dir = System.getProperty("user.dir");

            String fullPath = dir + File.separator + directory + File.separator + fileName;
            File file = new File(fullPath);

            try {
                file.getParentFile().mkdirs();
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, append))) {
                    for (String line : stringList) {
                        writer.write(line);
                        writer.newLine();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            String filePath = fileName;
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, append))) {
                for (String line : stringList) {
                    writer.write(line);
                    writer.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
