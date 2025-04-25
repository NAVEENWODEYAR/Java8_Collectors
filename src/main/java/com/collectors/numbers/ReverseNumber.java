package com.collectors.numbers;

import java.util.Scanner;

/**
 * @author NaveenWodeyar
 *
 */

public class ReverseNumber {
	
	static int reverseInt(int num) {
		String reversed = new StringBuilder(String.valueOf(num))
                .reverse()
                .toString();
		int revNum = Integer.parseInt(reversed);
		return revNum;
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number: " + reversed);
        	
    }
}
