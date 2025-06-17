package com.collectors.pattern;

import java.util.regex.*;

/**
 * @author NaveenWodeyar
 *
 */

public class PatternMatchExample {
    public static void main(String[] args) {
        String input = "I love Java programming!";
        String pattern = "Java";
        
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        
        if (m.find()) {
            System.out.println("Match found!");
        } else {
            System.out.println("Match not found.");
        }
    }
}
