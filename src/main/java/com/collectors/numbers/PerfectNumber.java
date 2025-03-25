package com.collectors.numbers;

/**
 * @author NaveenWodeyar
 *A perfect number is a positive integer that is equal to the sum of its proper divisors, excluding the number itself. Write a program to check if a given number is a perfect number.
 */

public class PerfectNumber {
    public static void main(String[] args) {
        int n = 28;
        if (isPerfectNumber(n)) {
            System.out.println(n + " is a perfect number.");
        } else {
            System.out.println(n + " is not a perfect number.");
        }
    }

    public static boolean isPerfectNumber(int n) {
        if (n <= 1) return false;

        int sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) sum += n / i;
            }
        }

        return sum == n;
    }
}
