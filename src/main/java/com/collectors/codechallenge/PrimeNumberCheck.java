package com.collectors.codechallenge;

/**
 * @author NaveenWodeyar
 *
 */

class PrimeNumberCheck {

    // Method to check if a number is prime
    static boolean isPrime(int n) {

        // Numbers less than or equal to 1 are not prime
        if (n <= 1)
            return false;

        // Check divisibility up to square root of n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Test cases
    public static void main(String[] args) {
        System.out.println(isPrime(29)); // true
        System.out.println(isPrime(15)); // false
        System.out.println(isPrime(2));  // true
    }
    
}
