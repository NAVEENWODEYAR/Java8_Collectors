package com.collectors.ternary;

/**
 * @author NaveenWodeyar
 *
 */

public class TernaryAssignmentExample {
    public static void main(String[] args) {
        int x = 10, y = 20;
        
        // Ternary operator used to assign values
        String result = (x > y) ? "x is greater" : (x == y ? "x equals y" : "y is greater");
        
        System.out.println(result);
    }
}

