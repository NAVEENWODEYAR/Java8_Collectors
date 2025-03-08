package com.collectors.series;

/**
 * @author Naveen K Wodeyar
 * @date 13/06/2024,
 *
 */

public class FiboSeries {

	static void fibSeries(int n) {
		int a=0;
		int b=1;
		int c=1;
		
		for(int i=0; i<n; i++) {
			System.out.print(a+", ");
			a=b;
			b=c;
			c=a+b;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("\n The Fibonacci series is a series of elements where, the previous two elements are added to get the next element, starting with 0 and 1,\n");
		fibSeries(10);
	}

}
