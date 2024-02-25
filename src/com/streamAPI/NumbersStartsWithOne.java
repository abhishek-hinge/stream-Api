package com.streamAPI;

import java.util.Arrays;
import java.util.List;

public class NumbersStartsWithOne {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 34, 15, 56, 23, 18, 20);

        List<String> collect = list.stream()
                .map(String::valueOf)
                .filter(x -> x.startsWith("1"))
                .toList();

        System.out.println("NumbersStartsWithOne : " + collect);

    }

}
