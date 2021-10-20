package com.hashMap;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class SorterLineTest {

    private static Map<String, Map<String, Integer>> wordsMap;

    @BeforeAll
    public static void init() {
        wordsMap = new TreeMap<>();
    }

    @Test
    void sortMap_whenPutLine() {
        wordsMap.put("A", Map.of("animal", 2, "At", 1));
        wordsMap.put("B", Map.of("blood", 3));
        String value = "At animal blood blood animal blood";
        assertThat(wordsMap).isEqualTo(SorterLine.sort(value));
    }

    @Test
    void sortMap_whenPutNull() {
        assertThatThrownBy(() -> SorterLine.sort(null))
                .isInstanceOf(LineIsNull.class)
                .hasMessage("Вы не ввели строку");
    }

    @Test
    void sortMap_whenPutNumber() {
        wordsMap.put("1", Map.of("1", 2, "123", 1));
        wordsMap.put("2", Map.of("2", 3));
        String value = "1 1 123 2 2 2";
        assertThat(wordsMap).isEqualTo(SorterLine.sort(value));
    }
}
