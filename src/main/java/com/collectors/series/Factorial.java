/**
 * 
 */
package com.collectors.series;

/**
 * @author NaveenWodeyar
 *
 */
public class Factorial {
    public static void main(String[] args) {
        int n = 5; // Number for which factorial is calculated
        
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
