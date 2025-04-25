package com.collectors.numbers;

/**
 * @author NaveenWodeyar
 * byte is signed, char is unsigned—so -1 becomes 65535
 */

public class NegativeByteToChar {
    public static void main(String[] args) {
        byte b = -1;
        char c = (char) b;
        System.out.println("Byte: " + b + " => Char as int: " + (int) c);
    }
}
