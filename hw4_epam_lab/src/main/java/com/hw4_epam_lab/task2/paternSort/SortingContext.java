package com.hw4_epam_lab.task2.paternSort;

import com.hw4_epam_lab.task2.paternSort.Strategy;

public class SortingContext {
    Strategy strategy;
    int[] array;

    public void setArray(int[] array) {
        this.array = array;
    }

    public SortingContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void Sort() {
        this.strategy.Sort(this.array);
    }

    public void PrintSortArray() {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}

