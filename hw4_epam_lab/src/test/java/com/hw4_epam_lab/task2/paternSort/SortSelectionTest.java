package com.hw4_epam_lab.task2.paternSort;

import com.hw4_epam_lab.task2.paternSort.strategy.SortSelection;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortSelectionTest {
    private static SortSelection sort;
    private static SortingContext context;

    @BeforeAll
    public static void init() {
        sort = new SortSelection();
        context = new SortingContext(sort);
    }

    @Test
    void sortStrategy_whenSortBubble() {
        //given
        int[] arraySorted = new int[]{1, 2, 3, 4, 5, 6};
        int[] arrayNotSorted = new int[]{5, 4, 6, 1, 2, 3};

        //then
        assertThat(context.sort(arrayNotSorted))
                .isEqualTo(arraySorted);
    }

    @Test
    void sortStrategy_whenSortBubbleAndEmptyArray() {
        //given
        int[] arraySorted = new int[]{};
        int[] arrayNotSorted = new int[]{};

        //then
        assertThat(context.sort(arrayNotSorted))
                .isEqualTo(arraySorted);
    }

    @Test
    void sortStrategy_whenSortBubbleAndArrayWithNegative() {
        //given
        int[] arraySorted = new int[]{-7, -5, -2, -1};
        int[] arrayNotSorted = new int[]{-1, -7, -2, -5};

        //then
        assertThat(context.sort(arrayNotSorted))
                .isEqualTo(arraySorted);
    }

}
