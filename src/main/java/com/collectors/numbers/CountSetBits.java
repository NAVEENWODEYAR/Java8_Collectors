package com.collectors.numbers;

/**
 * @author NaveenWodeyar
 *
 */
public class CountSetBits {
    public static void main(String[] args) {
        int num = 2;
        long count = Integer.toBinaryString(num)
                            .chars()
                            .filter(c -> c == '1')
                            .count();
        System.out.println("Number of set bits in " + num + ": " + count);
    }
}
