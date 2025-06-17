package com.collectors.pattern;

import java.util.regex.*;

/**
 * @author NaveenWodeyar
 *
 */

public class WordStartWithA {
    public static void main(String[] args) {
        String input = "Apples are amazing and awesome.";
        String regex = "\\b[Aa]\\w*\\b";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        
        while (matcher.find()) {
            System.out.println("Found word: " + matcher.group());
        }
    }
}

