package com.collectors.coding;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author NaveenWodeyar
 *
 */

public class ChecksumExample {

    public static String calculateChecksum(String data) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(data.getBytes());
            StringBuilder hexString = new StringBuilder();

            // Convert byte array to hexadecimal format
            for (byte b : hash) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        String data = "This is a sample data.";
        String checksum = calculateChecksum(data);
        System.out.println("SHA-256 Checksum: " + checksum);
    }
}

