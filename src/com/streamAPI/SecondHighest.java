package com.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighest {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12, 34, 16, 24, 33, 75, 65,75);

        Integer secondHighest = list.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst().get();

        System.out.println("SecondHighest : "+secondHighest);
    }
}
