package com.collectors.coding;

import java.util.zip.CRC32;

/**
 * @author NaveenWodeyar
 *
 */

public class CRC32ChecksumExample {

    public static long calculateCRC32Checksum(String data) {
        CRC32 crc32 = new CRC32();
        crc32.update(data.getBytes());
        return crc32.getValue();
    }

    public static void main(String[] args) {
        String data = "This is a sample data.";
        long checksum = calculateCRC32Checksum(data);
        System.out.println("CRC32 Checksum: " + checksum);
    }
}
