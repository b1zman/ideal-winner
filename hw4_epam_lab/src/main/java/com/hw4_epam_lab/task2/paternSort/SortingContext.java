package com.hw4_epam_lab.task2.paternSort;

public class SortingContext {
    Strategy strategy;

    public SortingContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public int[] sort(int[] array) {
        return strategy.sortArray(array);
    }

}

