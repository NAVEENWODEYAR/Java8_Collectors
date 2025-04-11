package com.collectors.series;

import java.util.stream.IntStream;

/**
 * @author NaveenWodeyar
 *
 */
public class MultiplicationTableJavaStreams {

    public static void main(String[] args) {
        int number = 7; // Number for which multiplication table is generated
        
        System.out.println("Multiplication Table of " + number + ":");
        
        // Using IntStream and lambda expression
        IntStream.range(1, 11) // Creates a stream from 1 to 10
                 .forEach(i -> System.out.println(number + " * " + i + " = " + (number * i)));
    }
}
