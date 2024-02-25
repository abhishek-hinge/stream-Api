package com.streamAPI;

import java.util.Arrays;
import java.util.List;

public class MaximumAndMinimum {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12, 34, 16, 24, 33, 75, 65);

        Integer max = list.stream().max(Integer::compareTo).get();

        Integer min = list.stream().min(Integer::compareTo).get();

        System.out.println("Maximum : "+max);
        System.out.println("Minimum : "+min);

    }

}
