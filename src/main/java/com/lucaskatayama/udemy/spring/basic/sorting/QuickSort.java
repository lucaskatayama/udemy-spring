package com.lucaskatayama.udemy.spring.basic.sorting;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] ints) {
        return ints;
    }
}
