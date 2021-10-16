package com.hw4_epam_lab.task2.paternSort.strategy;

import com.hw4_epam_lab.task2.paternSort.Strategy;

public class SortSelection extends Strategy {
    public void Sort(int[] array) {
        System.out.println("SelectionSort");
        for (int i = 0; i < array.length - 1; i++) {
            int k = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[k] > array[j])
                    k = j;
            if (k != i) {
                int temp = array[k];
                array[k] = array[i];
                array[i] = temp;
            }
        }
    }
}
