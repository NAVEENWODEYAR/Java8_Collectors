package com.collectors.arrList;

/**
 * @author NaveenWodeyar
 *
 */

public class SumOfDigits {
	 public static void main(String[] args) {
	        int number = 1234;
	        System.out.println("Sum of digits: " + sumOfDigits(number));
	    }

	    public static int sumOfDigits(int number) {
	        if (number == 0) {
	            return 0;
	        }
	        return number % 10 + sumOfDigits(number / 10);
	    }
}
