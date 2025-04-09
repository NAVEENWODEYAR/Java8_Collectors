package com.collectors.series;

/**
 * @author NaveenWodeyar
 *
 */

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 7; 
        
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
