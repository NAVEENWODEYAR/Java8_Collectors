package com.collectors.pattern;

import java.util.regex.*;

/**
 * @author NaveenWodeyar
 *
 */

public class PatternMatchExample {
    public static boolean isPatternFound(String input, String pattern) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        return m.find();
    }

    public static void main(String[] args) {
        String input = "I love Java programming!";
        String pattern = "Java";

        if (isPatternFound(input, pattern)) {
            System.out.println("Match found!");
        } else {
            System.out.println("Match not found.");
        }
    }
}
