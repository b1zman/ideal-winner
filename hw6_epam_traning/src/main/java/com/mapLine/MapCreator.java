package com.mapLine;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class MapCreator {

    public MapCreator() {
    }

    public static Map<Character, Integer> mapCreator(String line) {
        if (line == null) {
            throw new LineIsNull("Вы не ввели строку");
        } else {
            String value = line.replaceAll("\\s+", "");
            char[] wordsList = value.toCharArray();
            Map<Character, Integer> wordsMap = new TreeMap(Collections.reverseOrder());
            char[] var5 = wordsList;
            int var6 = wordsList.length;

            for (int var7 = 0; var7 < var6; ++var7) {
                char word = var5[var7];
                wordsMap.merge(word, 1, Integer::sum);
            }
            return wordsMap;
        }
    }
}

