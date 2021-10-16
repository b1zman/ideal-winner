package com.hw4_epam_lab.task2.paternSort;

import com.hw4_epam_lab.task2.paternSort.strategy.SortBubble;
import com.hw4_epam_lab.task2.paternSort.strategy.SortSelection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SortSelectionTest {

    @Test
    void sortStrategy_WhenSortBubble() {
        Strategy sort = new SortBubble();
        SortingContext context = new SortingContext(sort);
        context.setArray(new int[]{1, 5, 4, 3});
        context.Sort();
        Assertions.assertArrayEquals(context.array, new int[]{1, 3, 4, 5});
    }

    @Test
    void sortStrategy_WhenSortSelection() {
        Strategy sort = new SortSelection();
        SortingContext context = new SortingContext(sort);
        context.setArray(new int[]{1, 7, 4, 9});
        context.Sort();
        Assertions.assertArrayEquals(context.array, new int[]{1, 4, 7, 9});
    }
}
