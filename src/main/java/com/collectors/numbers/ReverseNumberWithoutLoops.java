/**
 * 
 */
package com.collectors.numbers;

/**
 * @author NaveenWodeyar
 *
 */
public class ReverseNumberWithoutLoops {

	    public static int reverse(int num) {
	        if (num < 10)
	            return num;
	        int length = (int) Math.log10(num);
	        return (num % 10) * (int)Math.pow(10, length) + reverse(num / 10);
	    }

	    public static void main(String[] args) {
	        System.out.println(reverse(12345)); // Output: 54321
	    }
	

}
