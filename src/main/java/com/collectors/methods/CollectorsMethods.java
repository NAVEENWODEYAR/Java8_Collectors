package com.collectors.methods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Naveen K Wodeyar
 * @date 13-02-2024
 */
public class CollectorsMethods {

    public static void main(String[] args) {
	
	//1. Creating list: toList(),
	List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9);
			numList.parallelStream().map(n->n+1).collect(Collectors.toList()).forEach(System.out::print);
    
	//2. Creating specific collection: toCollection(),
	LinkedList<Integer> collect = numList.stream().map(n->n*n).collect(Collectors.toCollection(LinkedList::new));
	System.out.println(collect);
	
	//3.Finding minimum value: minBy(),
	Integer min = numList.stream().min(Comparator.comparing(Integer::intValue)).get();
	Integer min1 = numList.parallelStream().collect(Collectors.minBy(Comparator.naturalOrder())).get();
	Integer min2 = numList.parallelStream().collect(Collectors.maxBy(Comparator.reverseOrder())).get();
	System.out.println(min+" "+min1+" "+min2);
	
	//4. Averaging int: averagingInt(),
	Double avg = numList.parallelStream().collect(Collectors.averagingDouble(Integer::intValue));
	System.out.println(avg);
	
	//5.Finding maximum value: maxBy(),
	Integer max = numList.parallelStream().max(Comparator.comparing(Integer::intValue)).get();
	System.out.println(max);
    }

}
