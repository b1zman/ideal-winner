package com.mapLine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class MapCreatorTest {

    private  Map<Character, Integer> wordsMap;

    @BeforeEach
    public void init() {
        wordsMap = new TreeMap(Collections.reverseOrder());
    }

    @Test
    void sortMap_whenPutLine() {
        wordsMap.put('A', 1);
        wordsMap.put('a', 4);
        wordsMap.put('o', 6);
        String value = "A aaao oooooa";
        assertThat(wordsMap).isEqualTo(MapCreator.mapCreator(value));
    }

    @Test
    void sortMap_whenPutNull() {
        assertThatThrownBy(() -> MapCreator.mapCreator(null))
                .isInstanceOf(LineIsNull.class)
                .hasMessage("Вы не ввели строку");
    }

    @Test
    void sortMap_whenPutNumber() {
        wordsMap.put('2', 4);
        wordsMap.put('3', 1);
        String value = "23 2 2 2";
        assertThat(wordsMap).isEqualTo(MapCreator.mapCreator(value));
    }
}