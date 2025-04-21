package com.collectors.str;

/**
 * @author NaveenWodeyar
 *
 */

public class RotationCheck {
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";

        if (s1.length() == s2.length() && (s1 + s1).contains(s2)) {
            System.out.println("Rotations");
        } else {
            System.out.println("Not Rotations");
        }
    }
}

