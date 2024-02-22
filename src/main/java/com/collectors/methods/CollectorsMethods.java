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
	System.out.println("\n Minimun value in the list,");
	Integer min = numList.stream().min(Comparator.comparing(Integer::intValue)).get();
	Integer min1 = numList.parallelStream().collect(Collectors.minBy(Comparator.naturalOrder())).get();
	System.out.println(min+" "+min1);
	
	//4. Averaging integer value: averagingInt(),
	System.out.println("\n Average value in the list,");
	Double avg = numList.parallelStream().collect(Collectors.averagingDouble(Integer::intValue));
	System.out.println(avg);
	
	//5.Finding maximum value in the collection: maxBy(),
	System.out.println("\n Maximum value in the list,");
	Integer max = numList.parallelStream().max(Comparator.comparing(Integer::intValue)).get();
	Integer max1 = numList.stream().collect(Collectors.maxBy(Comparator.naturalOrder())).get();
	System.out.println(max+" "+max1);
	
	//6.UnModifiable list,
	List<Integer> unModifiablelst = numList.stream().collect(Collectors.toUnmodifiableList());
	System.out.println(unModifiablelst);
    }

}
