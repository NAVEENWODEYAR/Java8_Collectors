package com.collectors.coding;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

/**
 * @author Naveen K Wodeyar
 * @date 25-02-2024,
 */

public class StringFrequency2 {

	  static <Character> Map<Character, Long>  frequencyMap(Stream<Character> elements) {
	        return elements.collect(
	            Collectors.groupingBy(
	            Function.identity(),
	            HashMap::new, 
	            Collectors.counting()
	            )
	        );
	    }
   
    public static void main(String[] args) {
    		
    }
}
