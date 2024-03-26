package com.streamAPI;

import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FilterIntegers {

    public static void main(String[] args) {

        List<String> list = List.of("123", "Mango", "Orange", "18", "Pineapple", "45");

        List<String> collect = list.stream()
                .filter(string -> Pattern.compile("\\d+").matcher(string).matches()).toList();

        System.out.println(collect);
    }

}
