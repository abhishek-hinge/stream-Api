package com.streamAPI;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {

        String str = "HelloWorld";

         /*
          First Non Repeated Character
         */

        String nonRepeated = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()
                .get().getKey();

        System.out.println("FirstNonRepeatedCharacter : " + nonRepeated);

        /*
          First Repeated Character
         */

        String repeated = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue()>1)
                .findFirst()
                .get().getKey();

        System.out.println("FirstRepeatedCharacter : " + repeated);

    }

}
