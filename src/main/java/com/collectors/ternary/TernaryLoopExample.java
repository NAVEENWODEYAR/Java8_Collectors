package com.collectors.ternary;

/**
 * @author NaveenWodeyar
 *
 */
public class TernaryLoopExample {
    public static void main(String[] args) {
        int i = 0;
        String result = "";
        
        // Loop with ternary operator
        while (i < 10) {
            result += (i % 2 == 0) ? "Even " : "Odd ";
            i++;
        }
        
        System.out.println(result);
    }
}
