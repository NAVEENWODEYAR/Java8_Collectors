package com.collectors.coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringFrequency {

    /**
     * @author Naveen K Wodeyar
     * @date 25-02-2024,
     */
   static int stringFrequency(String st, String s) {
       List<String> wordsList = Arrays.asList(st.toLowerCase().split(" "));
       return Collections.frequency(wordsList, s);
   }
   
    public static void main(String[] args) {
	System.out.println("\nString Frequency");
	int stringFrequency = stringFrequency("level","l");
	System.out.println(stringFrequency);
    }
}
