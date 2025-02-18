package com.collectors.arrList;

import java.util.HashMap;

/**
 * @author NaveenWodeyar
 *
 */

public class FibonacciMemoization {
	
	private static HashMap<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);
        return result;
    }
}
