
package com.collectors.codechallenge;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Naveen K Wodeyar
 *How do you remove duplicate elements from a list using Java 8 streams?
 */
public class RemoveDuplicates {
	
	// convert to Set<>
	static void removeDuplicatesInList(List<Integer> list,List<String> strList) {
		Set<Integer> set = list.stream().collect(Collectors.toSet());
		System.out.println("\n List:"+list+" Set:"+set);
		
		System.out.println("\n Using distinct(),");
		strList.parallelStream().distinct().toList().forEach(System.out::print);
	}
	
	public static void main(String[] args) {
		removeDuplicatesInList(Arrays.asList(1,2,3,4,5,4,3,6,7,9),Arrays.asList("Z","B","C","D","D","B","F","E","A"));
	}

}
