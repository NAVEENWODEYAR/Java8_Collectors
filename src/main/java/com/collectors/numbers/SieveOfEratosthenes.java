package com.collectors.numbers;

/**
 * @author NaveenWodeyar
 *
 */

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int N = 30;
        printPrimes(N);
    }

    public static void printPrimes(int N) {
        boolean[] isPrime = new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= N; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= N; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Printing primes
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
