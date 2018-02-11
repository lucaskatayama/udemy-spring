package com.lucaskatayama.udemy.spring.basic;

import com.lucaskatayama.udemy.spring.basic.sorting.SortAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

    @Autowired
    @Qualifier("quick")
    private SortAlgorithm sort;


    public int search(int[] ints, int i) {
        int[] sorted = this.sort.sort(ints);
        System.out.println(this.sort.getClass());
        return 5;
    }
}
