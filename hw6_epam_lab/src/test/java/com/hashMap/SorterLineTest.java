package com.hashMap;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.assertj.core.api.Assertions.assertThat;

class SorterLineTest {

    @Test
    void sortMap_whenPutLine() {
        Map<String, Map<String, Integer>> wordsMap = new TreeMap<>();
        wordsMap.put("A", Map.of("animal", 2, "At", 1));
        wordsMap.put("B", Map.of("blood", 3));
        String value = "At animal blood blood animal blood";
        assertThat(wordsMap).isEqualTo(SorterLine.sort(value));

    }
}