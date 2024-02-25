package com.streamAPI;

import java.util.Arrays;
import java.util.List;

public class StringPalindrome {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Madam", "hello", "level", "malayalam", "demo");

        List<String> list1 = list.stream()
                .filter(word -> word.equalsIgnoreCase(new StringBuffer(word).reverse().toString())).toList();

        System.out.println(list1);
    }

}
