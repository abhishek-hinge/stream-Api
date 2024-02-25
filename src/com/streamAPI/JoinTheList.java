package com.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinTheList {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("apple", "banana", "orange", "mango");

        String joinString = list.stream().collect(Collectors.joining("-"));

        System.out.println(joinString);
    }

}
