package com.collectors.compare;

import java.util.Comparator;

/**
 * @author NaveenWodeyar
 *
 */

public class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        // Compare by rating (descending)
        int ratingCompare = Integer.compare(p2.getRating(), p1.getRating());
        if (ratingCompare != 0) return ratingCompare;

        // Then by price (ascending), nulls last
        if (p1.getPrice() == null && p2.getPrice() == null) return 0;
        if (p1.getPrice() == null) return 1;
        if (p2.getPrice() == null) return -1;

        int priceCompare = Double.compare(p1.getPrice(), p2.getPrice());
        if (priceCompare != 0) return priceCompare;

        // Then by name (case-insensitive)
        return p1.getName().compareToIgnoreCase(p2.getName());
    }
}
