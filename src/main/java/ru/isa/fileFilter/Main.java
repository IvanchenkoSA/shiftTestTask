package ru.isa.fileFilter;

import com.beust.jcommander.JCommander;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Args args1 = new Args();
        JCommander.newBuilder()
                .addObject(args1)
                .build()
                .parse(args);
        File file = new File(args1.file);

        List<String> srtList = new ArrayList<>();
        List<Integer> intList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();


        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (isInteger(line)) {
                    intList.add(Integer.parseInt(line));
                }
                if (isDouble(line)) {
                    doubleList.add(Double.parseDouble(line));
                } else {
                    srtList.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (args1.addFlag) {
            args1.stringWriterA(srtList);
        } else {
            args1.stringWriter(srtList);
        }


    }


    private static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}