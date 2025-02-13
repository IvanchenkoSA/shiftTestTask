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
    static String[] str = {"-f", "-a", "in2.txt"};
    public static void main(String[] args) {
        ArgumentParser parser = new ArgumentParserImpl();
        FileManager fileManager = new FileManagerImpl();
        DataSorter dataSorter = new DataSorterImpl();

        Arguments arguments = parser.parse(str);
        List<String> inputFile = fileManager.readFiles(arguments.getInputFiles());
        SortResult sortData = dataSorter.sort(inputFile);


        if (arguments.getPrefix() != null) {
            fileManager.writeFile(sortData.getStringList(), arguments.getPrefix() + "strings.txt", arguments.isAppend());
            fileManager.writeFile(sortData.getFloatList(), arguments.getPrefix() + "floats.txt", arguments.isAppend());
            fileManager.writeFile(sortData.getIntList(), arguments.getPrefix() + "integers.txt", arguments.isAppend());
        } else {
            fileManager.writeFile(sortData.getStringList(), "strings.txt", arguments.isAppend());
            fileManager.writeFile(sortData.getFloatList(), "floats.txt", arguments.isAppend());
            fileManager.writeFile(sortData.getIntList(), "integers.txt", arguments.isAppend());
        }

        if (arguments.getStatistics() == Statistics.SHORT) {
            if (!sortData.getStringList().isEmpty()) {
                System.out.println("String file short Statistics:");
                System.out.println("Count of elem: " + sortData.getStringList().size() + "\n");
            }
            if (!sortData.getIntList().isEmpty()) {
                System.out.println("Integer file short Statistics:");
                System.out.println("Count of elem: " + sortData.getIntList().size() + "\n");
            }
            if (!sortData.getFloatList().isEmpty()) {
                System.out.println("Float file short Statistics:");
                System.out.println("Count of elem: " + sortData.getFloatList().size());
            }

        } else if (arguments.getStatistics() == Statistics.FULL) {
            if (!sortData.getStringList().isEmpty()){
                System.out.println("String file Full Statistics:");
                System.out.println("Count of elem: " + sortData.getStringList().size());
                System.out.println("Length of shortest string: " + sortData.getLenShortestString());
                System.out.println("Length of longest string: " + sortData.getLenLongestString() + "\n");
            }
            if (!sortData.getIntList().isEmpty()) {
                System.out.println("Integer file Full Statistics:");
                System.out.println("Count of elem: " + sortData.getIntList().size());
                System.out.println("Min value: " + sortData.getMinIntValue());
                System.out.println("Max value: " + sortData.getMaxIntValue());
                System.out.println("Sum of values: " + sortData.getSumIntValue());
                System.out.println("Avg of values: " + sortData.getAvgIntValue() + "\n");
            }
            if (!sortData.getFloatList().isEmpty()) {
                System.out.println("Float file Full Statistics:");
                System.out.println("Count of elem: " + sortData.getFloatList().size());
                System.out.println("Min value: " + sortData.getMinDoubleValue());
                System.out.println("Max value: " + sortData.getMaxDoubleValue());
                System.out.println("Sum of values: " + sortData.getSumDoubleValue());
                System.out.println("Avg of values: " + sortData.getAvgDoubleValue());
            }
        }
    }
}