package com.streamAPI;

import java.util.Arrays;
import java.util.List;

public class SumAndAverage {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 34, 15, 56, 23, 18, 20);

        int sum = list.stream().mapToInt(Integer::intValue).sum();

        double average = list.stream().mapToInt(Integer::intValue).average().getAsDouble();

        System.out.println("Sum : " + sum);
        System.out.println("Average : " + average);

    }

}
