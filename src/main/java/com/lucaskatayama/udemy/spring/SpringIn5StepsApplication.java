package com.lucaskatayama.udemy.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

    public static void main(String[] args) {
        ApplicationContext context =
                SpringApplication.run(SpringIn5StepsApplication.class, args);
        BinarySearchImpl binarySearch1 = context.getBean(BinarySearchImpl.class);
        BinarySearchImpl binarySearch2 = context.getBean(BinarySearchImpl.class);

        System.out.println(binarySearch1);
        System.out.println(binarySearch2);
        int result = binarySearch1.search(new int[]{2, 4, 1, 5, 2, 3, 4}, 5);
        System.out.println(result);
    }
}
