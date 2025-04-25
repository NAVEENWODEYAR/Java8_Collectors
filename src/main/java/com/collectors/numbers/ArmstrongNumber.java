package com.collectors.numbers;

/**
 * @author NaveenWodeyar
 *
 */

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int digits = String.valueOf(num).length();
        int sum = String.valueOf(num)
                        .chars()
                        .map(c -> (int) Math.pow(c - '0', digits))
                        .sum();

        System.out.println(num + " is an Armstrong number: " + (sum == num));
    }
}
