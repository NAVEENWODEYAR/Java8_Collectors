package com.collectors.compare;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

public class ProductComparing {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 1200.0, 5),
            new Product("laptop", 1100.0, 5),  // same name (case-insensitive)
            new Product("Tablet", null, 4),    // null price
            new Product("Phone", 800.0, 4),
            new Product("Phone", 750.0, 4),    // same name, same rating, lower price
            new Product("Camera", null, 5)
        );

        System.out.println("🔤 Sorting by natural order (Comparable):");
        Collections.sort(products);  // Natural order: name (case-insensitive)
        products.forEach(System.out::println);

        System.out.println("\n🎯 Sorting by custom logic (Comparator):");
        products.sort(new ProductComparator());  // Custom multi-criteria logic
        products.forEach(System.out::println);
    }
}
