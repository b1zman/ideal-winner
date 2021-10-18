package com.hashMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SorterLine {

    public static Map<String, Map<String, Integer>> sort(String line) {
        String value = line.replaceAll("[^A-Za-zА-Яа-я0-9]", " ");
        List<String> wordsList = List.of(value.split("\\s+"));
        Map<String, Map<String, Integer>> wordsMap = new TreeMap<>();
        for (String word : wordsList) {
            String firstLetter = word.substring(0, 1).toUpperCase();
            Map<String, Integer> stringIntegerMap = wordsMap.get(firstLetter);
            if (stringIntegerMap != null) {
                stringIntegerMap.merge(word, 1, Integer::sum);
            } else {
                stringIntegerMap = new HashMap<>();
                stringIntegerMap.put(word, 1);
                wordsMap.put(firstLetter, stringIntegerMap);
            }
        }
        return wordsMap;
    }
}
