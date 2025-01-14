package com.collectors.streams;

import java.util.stream.Stream;

/**
 * @author Naveen K Wodeyar
 * @date 12-06-2024
 * @apiNote Streams can be defined as a sequences of elements from a source which support data processing operations.
 *
 */
public class StrmFunctions {

	static Stream<Integer> st = Stream.of(1,2,3,4,5,6,7,8);
	
	static void intermediateFns() {
		//st.forEach(System.out::print);
		
		//Performs an additional action on each element of a stream. This method is only to support debugging
		st.peek(Integer::doubleValue).forEach(System.out::println);
	}
	
	static void terminalFns() {
		
	}
	
	public static void main(String[] args) {
		intermediateFns();
		System.out.println("\n****************\n");
		terminalFns();
	}

}
