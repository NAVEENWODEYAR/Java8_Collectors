package com.collectors.numbers;

/**
 * @author NaveenWodeyar
 *
 */

public class WrongObjectCast {
    public static void main(String[] args) {
        Object obj = 42;
        try {
            String str = (String) obj; // Will throw ClassCastException
        } catch (ClassCastException e) {
            System.out.println("Caught: " + e);
        }
    }
}
