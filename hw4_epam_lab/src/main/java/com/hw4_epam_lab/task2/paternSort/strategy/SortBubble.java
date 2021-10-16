package com.hw4_epam_lab.task2.paternSort.strategy;

import com.hw4_epam_lab.task2.paternSort.Strategy;

public class SortBubble implements Strategy {
    @Override
    public int[] sort(int[] array) {
        System.out.println("BubbleSort");
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        return array;
    }
}
