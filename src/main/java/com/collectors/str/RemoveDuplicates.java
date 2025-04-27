package com.collectors.str;

/**
 * @author NaveenWodeyar
 *
 */

public class RemoveDuplicates {
	
	public static String removeDuplicateChars(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "I was betrayed by my own people — what can I say?\r\n"
                   + "My boat sank even where the water was shallow";
        System.out.println(removeDuplicateChars(str));
    }
}

