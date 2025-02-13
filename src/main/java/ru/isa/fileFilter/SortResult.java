package ru.isa.fileFilter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


// Класс с отсортированными листами, содержащим данные для статистики

public class SortResult {
    private List<String> intList;
    private List<String> floatList;
    private List<String> stringList;

    private int intCount;
    private long maxIntValue;
    private long minIntValue;
    private long sumIntValue;
    private long avgIntValue;

    private double doubleCount;
    private double maxDoubleValue;
    private double minDoubleValue;
    private double sumDoubleValue;
    private double avgDoubleValue;

    private int stringCount;
    private int lenShortestString;
    private int lenLongestString;

    public SortResult(List<String> intList, List<String> floatList, List<String> stringList, int intCount,
                      long maxIntValue, long minIntValue, long sumIntValue, long avgIntValue, double doubleCount,
                      double maxDoubleValue, double minDoubleValue, double sumDoubleValue, double avgDoubleValue,
                      int stringCount, int lenShortestString, int lenLongestString) {
        this.intList = intList;
        this.floatList = floatList;
        this.stringList = stringList;
        this.intCount = intCount;
        this.maxIntValue = maxIntValue;
        this.minIntValue = minIntValue;
        this.sumIntValue = sumIntValue;
        this.avgIntValue = avgIntValue;
        this.doubleCount = doubleCount;
        this.maxDoubleValue = maxDoubleValue;
        this.minDoubleValue = minDoubleValue;
        this.sumDoubleValue = sumDoubleValue;
        this.avgDoubleValue = avgDoubleValue;
        this.stringCount = stringCount;
        this.lenShortestString = lenShortestString;
        this.lenLongestString = lenLongestString;
    }

    public List<String> getIntList() {
        return intList;
    }

    public List<String> getFloatList() {
        return floatList;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public int getIntCount() {
        return intCount;
    }

    public long getMaxIntValue() {
        return maxIntValue;
    }

    public long getMinIntValue() {
        return minIntValue;
    }

    public long getSumIntValue() {
        return sumIntValue;
    }

    public long getAvgIntValue() {
        return avgIntValue;
    }

    public double getDoubleCount() {
        return doubleCount;
    }

    public double getMaxDoubleValue() {
        return maxDoubleValue;
    }

    public double getMinDoubleValue() {
        return minDoubleValue;
    }

    public double getSumDoubleValue() {
        return sumDoubleValue;
    }

    public double getAvgDoubleValue() {
        return avgDoubleValue;
    }

    public int getStringCount() {
        return stringCount;
    }

    public int getLenShortestString() {
        return lenShortestString;
    }

    public int getLenLongestString() {
        return lenLongestString;
    }
}
