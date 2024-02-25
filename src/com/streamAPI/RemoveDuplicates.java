package com.streamAPI;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 2, 1, 6, 7);

        List<Integer> collect = list.stream().distinct().toList();

        System.out.println("removed duplicates : "+collect);
    }

}
