
package com.collectors.codechallenge;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Naveen K Wodeyar
 * @apiNote, find the nonRepeating element in the list,
 *
 */
public class NonRepatingElement {
	
	static Integer nonRepeatedElement(Integer[] arr) {
		Map<Integer,Integer> hashMap = new HashMap<>();
		Integer nonRep = 0;
		
		for(Integer num:arr) {
			hashMap.put(num,hashMap.getOrDefault(num,0)+1);
		}
		for(int num : arr) {
			if(hashMap.get(num) == 1) {
				nonRep++;
				if(nonRep == 2)
					return num;
			}
		}
		return null;
	}

	public static void main(String[] args) {
        Integer[] arr = {4, 5, 4, 5, 8, 3, 2, 1, 2, 6};
        System.out.println(nonRepeatedElement(arr));
        System.out.println("\n"+nonRepeat(Arrays.stream(arr).mapToInt(Integer::intValue).toArray()));

	}
	
	// using java8,
	static Integer nonRepeat(int arr[]) {
		Optional<Integer> num = Arrays.stream(arr)
				.boxed()
				.collect(Collectors.collectingAndThen(Collectors.groupingBy(n->n,LinkedHashMap::new,Collectors.counting()),
						n->n.entrySet().stream().filter(nu->nu.getValue()==1).map(Map.Entry::getKey).skip(2).findFirst()));
		return num.isPresent() ? num.get() :null;
	}

}
