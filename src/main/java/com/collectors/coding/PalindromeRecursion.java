package com.collectors.coding;

/**
 * @author NaveenWodeyar
 *
 */
public class PalindromeRecursion {

    // Recursive method to check palindrome
    static boolean isPalindrome(String s, int left, int right) {

        // Base case: pointers crossed or met
        if (left >= right) {
            return true;
        }

        // If characters don't match
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }

        // Recursive call
        return isPalindrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {

        // Interview-style test cases
        test("madam", true);
        test("racecar", true);
        test("level", true);
        test("hello", false);
        test("a", true);
        test("", true);
    }

    // Test runner (LeetCode style)
    static void test(String input, boolean expected) {
        boolean result = isPalindrome(input, 0, input.length() - 1);
        System.out.println(
            "Input: \"" + input + "\"" +
            " | Expected: " + expected +
            " | Output: " + result +
            " | " + (result == expected ? "PASS" : "FAIL")
        );
    }
}
