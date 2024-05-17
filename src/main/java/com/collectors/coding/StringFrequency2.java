package com.collectors.coding;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class StringFrequency2 {

	 public static <Character> Map<Character, Long>  frequencyMap(Stream<Character> elements) {
	        return elements.collect(
	            Collectors.groupingBy(
	            Function.identity(),
	            HashMap::new, // can be skipped
	            Collectors.counting()
	            )
	        );
	    }
   
    public static void main(String[] args) {

    }
}
