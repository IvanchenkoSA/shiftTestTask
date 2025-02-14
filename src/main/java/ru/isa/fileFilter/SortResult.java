package ru.isa.fileFilter;

import java.util.List;

// Класс с отсортированными листами, содержащим данные для статистики

public class SortResult {
    private final List<String> intList;
    private final List<String> floatList;
    private final List<String> stringList;

    private final int intCount;
    private final long maxIntValue;
    private final long minIntValue;
    private final long sumIntValue;
    private final long avgIntValue;

    private final double doubleCount;
    private final double maxDoubleValue;
    private final double minDoubleValue;
    private final double sumDoubleValue;
    private final double avgDoubleValue;

    private final int stringCount;
    private final int lenShortestString;
    private final int lenLongestString;

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
