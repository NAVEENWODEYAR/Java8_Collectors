
package com.collectors.coding;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

/**
 * @author Naveen Wodeyar
 *
 */
public class ArrayStatistics {

   static  int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};

	static void arrayStatistics() {
		IntSummaryStatistics summaryStatistics = Arrays.stream(a).summaryStatistics();
		System.out.println("Max value:"+summaryStatistics.getMax()+"\n Min value:"+summaryStatistics.getMin());
	}
	
	public static void main(String[] args) {
		arrayStatistics();
	}

}
