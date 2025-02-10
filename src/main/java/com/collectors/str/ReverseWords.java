package com.collectors.str;

/**
 * @author NaveenWodeyar
 *
 */
public class ReverseWords {

	 public static String reverseWords(String s) {
	        String[] words = s.split(" ");
	        StringBuilder result = new StringBuilder();
	        
	        for (int i = words.length - 1; i >= 0; i--) {
	            result.append(words[i]).append(" ");
	        }
	        
	        return result.toString().trim();
	    }

	    public static void main(String[] args) {
	        String sentence = "Hello World from Java";
	        System.out.println(reverseWords(sentence)); // Output: Java from World Hello
	    }
}
