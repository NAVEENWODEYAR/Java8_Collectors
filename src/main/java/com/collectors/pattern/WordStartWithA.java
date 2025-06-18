package com.collectors.pattern;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author NaveenWodeyar
 *
 */

public class WordStartWithA {

    public static List<String> getWordsStartingWithA(String input) {
        List<String> result = new ArrayList<>();
        String regex = "\\b[Aa]\\w*\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            result.add(matcher.group());
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "Apples are amazing and awesome.";
        List<String> words = getWordsStartingWithA(input);

        for (String word : words) {
            System.out.println("Found word: " + word);
        }
    }
}
