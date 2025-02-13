package com.collectors.str;

/**
 * @author NaveenWodeyar
 *
 */
public class StringToInteger {

	public static int myAtoi(String str) {
        str = str.trim();
        if (str.isEmpty()) return 0;

        int sign = 1, result = 0, i = 0;
        if (str.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (str.charAt(i) == '+') {
            i++;
        }

        while (i < str.length()) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') break;

            result = result * 10 + (c - '0');
            i++;
        }
        return sign * result;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("42"));  // Output: 42
    }
}
