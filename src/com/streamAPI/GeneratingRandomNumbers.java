package com.streamAPI;

import java.util.Random;

public class GeneratingRandomNumbers {

    public static void main(String[] args) {

        new Random().ints(5, 0, 100)
                .forEach(System.out::println);

    }

}

/*

new Random().ints(5, 0, 100): This part creates a stream of random integers.
ints is a method provided by the Random class in Java 8 that returns an infinite stream of pseudorandom int values.
The parameters passed to ints are:
5: Specifies the size of the stream, meaning it generates 5 random integers.
0: Specifies the inclusive lower bound of the random integers to be generated.
100: Specifies the exclusive upper bound of the random integers to be generated (i.e., random integers will be less than 100).


 */