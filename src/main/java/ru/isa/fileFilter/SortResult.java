package ru.isa.fileFilter;

import java.util.List;

public class SortResult {
    private List<String> intList;
    private List<String> floatList;
    private List<String> stringList;

    private int elemCount;
    private int maxValue;
    private int minValue;
    private int sumValue;
    private int avgValue;

    private int stringCount;

    public SortResult(List<String> intList, List<String> floatList, List<String> stringList) {
        this.intList = intList;
        this.floatList = floatList;
        this.stringList = stringList;
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
}
