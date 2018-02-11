package com.lucaskatayama.udemy.spring.sorting;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] ints) {
        return ints;
    }
}
