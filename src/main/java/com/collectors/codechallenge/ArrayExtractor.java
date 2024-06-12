
package com.collectors.codechallenge;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Naveen K WOdeyar
 * @date 12/06/2024
 * @apiNote, 
 *
 */
public class ArrayExtractor {

	static void arraySeperator(int[] arr) {
		int[] array = Arrays.stream(arr).boxed().sorted().mapToInt(Integer::intValue).toArray();
		Object[] array2 = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).toArray();
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array2));
	}
	
	
	static void arrySort(int[] arr) {
	
		int one = 0;
		for(int i:arr) {
			if(i==1) {
				one++;
			}
		}
		for(int i=0; i<arr.length; i++) {
			arr[i] = (i<one)?1:0;
		}
		System.out.println(Arrays.toString(arr));
		
		int[] sortedArr = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.collectingAndThen(
                        Collectors.groupingBy(e -> e, HashMap::new, Collectors.counting()),
                        freqMap -> IntStream.concat(
                                IntStream.generate(() -> 1).limit(freqMap.getOrDefault(1, 0L)),
                                IntStream.generate(() -> 0).limit(freqMap.getOrDefault(0, 0L))
                        ).toArray()
                ));
        System.out.println(Arrays.toString(sortedArr));

	}
	
	public static void main(String[] args) {
		int [] arr = {0,1,1,1,0,0,1,0,1,0,1,0,1,0,1,0,0,0,1,1};
		arraySeperator(arr);
		System.out.println("***************\n");
		arrySort(arr);
	}

}
 