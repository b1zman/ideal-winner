package com.mapLine;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String line = "Жыве Беларусь";
        String value = line.replaceAll("\\s+", "");
        char[] wordsList = value.toCharArray();
        Map<Character, Integer> wordsMap = new TreeMap<>(Collections.reverseOrder());
        for (char word : wordsList) {
            wordsMap.merge(word, 1, Integer::sum);
        }
        System.out.println(wordsMap);
    }
}
