package com.collectors.ternary;

/**
 * @author NaveenWodeyar
 *
 */

public class TernaryIfElseSimulation {
    public static void main(String[] args) {
        int a = 10, b = 20;
        
        // Ternary operator used in a confusing way
        String result = a > b ? (b > 10 ? "B > 10" : "B <= 10") : "A <= B";
        
        System.out.println(result);
    }
}
