package com.collectors.methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Naveen K Wodeyar
 * @date 13-02-2024
 */
public class CollectorsMethods {

    public static void main(String[] args) {
	
	//1. Creating list: toList()
	List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9);
			numList.parallelStream().map(n->n+1).collect(Collectors.toList()).forEach(System.out::print);
    }

}
