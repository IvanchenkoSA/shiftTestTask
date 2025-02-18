package ru.isa.fileFilter;

import java.util.ArrayList;
import java.util.List;

public class DataSorterImpl implements DataSorter {
    @Override
    public SortResult sort(List<String> inputList) {
        List<String> intList = new ArrayList<>();
        List<String> doubleList = new ArrayList<>();
        List<String> strList = new ArrayList<>();

        int intCount = 0;
        long maxIntValue = 0;
        long minIntValue = Integer.MAX_VALUE;
        long sumIntValue = 0;
        long avgIntValue = 0;

        double doubleCount = 0;
        double maxDoubleValue = 0;
        double minDoubleValue = Double.MAX_VALUE;
        double sumDoubleValue = 0.0;
        double avgDoubleValue = 0.0;

        int stringCount = 0;
        int lenShortestString = Integer.MAX_VALUE;
        int lenLongestString = 0;

        for (String string : inputList) {
            if (isLong(string)) {
                intList.add(string);
                intCount++;
                maxIntValue = Math.max(maxIntValue, Long.parseLong(string));
                minIntValue = Math.min(minIntValue, Long.parseLong(string));
                sumIntValue += Long.parseLong(string);
                avgIntValue = (sumIntValue / intCount);
            } else if (isInteger(string)) {
                intList.add(string);
                intCount++;
                maxIntValue = Math.max(maxIntValue, Integer.parseInt(string));
                minIntValue = Math.min(minIntValue, Integer.parseInt(string));
                sumIntValue += Long.parseLong(string);
                avgIntValue = (sumIntValue / intCount);
            } else if (isDouble(string)) {
                doubleList.add(string);
                doubleCount++;
                maxDoubleValue = Math.max(maxDoubleValue, Double.parseDouble(string));
                minDoubleValue = Math.min(minDoubleValue, Double.parseDouble(string));
                sumDoubleValue += Double.parseDouble(string);
                avgDoubleValue = (sumDoubleValue / doubleCount);
            } else {
                strList.add(string);
                stringCount++;
                lenShortestString = Math.min(string.length(), lenShortestString);
                lenLongestString = Math.max(string.length(), lenLongestString);
            }
        }

        return new SortResult(intList, doubleList, strList, intCount, maxIntValue, minIntValue,
                sumIntValue, avgIntValue, doubleCount, maxDoubleValue, minDoubleValue, sumDoubleValue,
                avgDoubleValue, stringCount, lenShortestString, lenLongestString);
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

    private static boolean isLong(String str) {
        try {
            Long.parseLong(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
