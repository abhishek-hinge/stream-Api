package com.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StringMinMax {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("apple", "pineapple", "orange", "kiwi", "mango");

        String max = strings.stream().max((s1, s2) -> Integer.compare(s1.length(), s2.length())).get();

        String min = strings.stream().min((s1, s2) -> Integer.compare(s1.length(), s2.length())).get();

        System.out.println("Largest string: " + max + "\n" + "Smallest string: " + min);


    }
}
