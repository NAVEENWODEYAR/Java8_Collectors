package com.collectors.compare;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class ProductComparingTest {

    @Test
    public void testComparableSortingByNameIgnoreCase() {
        List<Product> products = new ArrayList<>(Arrays.asList(
                new Product("Tablet", 500.0, 3),
                new Product("laptop", 900.0, 4),
                new Product("Phone", 700.0, 5),
                new Product("Camera", 300.0, 4)
        ));

        Collections.sort(products); // uses Comparable

        List<String> expectedOrder = Arrays.asList("Camera", "laptop", "Phone", "Tablet");
        for (int i = 0; i < products.size(); i++) {
            assertEquals(expectedOrder.get(i), products.get(i).getName());
        }
    }

    @Test
    public void testComparatorSortingByRatingThenPriceThenName() {
        List<Product> products = new ArrayList<>(Arrays.asList(
                new Product("Tablet", null, 4),
                new Product("Phone", 750.0, 4),
                new Product("Phone", 800.0, 4),
                new Product("Camera", null, 5),
                new Product("Laptop", 1200.0, 5),
                new Product("laptop", 1100.0, 5)
        ));

        products.sort(new ProductComparator());

        // Expected order:
        // 1. Rating 5: Camera (null), laptop (1100), Laptop (1200)
        // 2. Rating 4: Phone (750), Phone (800), Tablet (null)

        assertEquals("Camera", products.get(0).getName());
        assertEquals("laptop", products.get(1).getName());
        assertEquals("Laptop", products.get(2).getName());

        assertEquals("Phone", products.get(3).getName());
        assertEquals(750.0, products.get(3).getPrice());

        assertEquals("Phone", products.get(4).getName());
        assertEquals(800.0, products.get(4).getPrice());

        assertEquals("Tablet", products.get(5).getName());
        assertNull(products.get(5).getPrice());
    }

    @Test
    public void testComparatorHandlesNullPricesCorrectly() {
        Product p1 = new Product("A", null, 4);
        Product p2 = new Product("B", 500.0, 4);

        List<Product> products = Arrays.asList(p1, p2);
        products.sort(new ProductComparator());

        // p2 should come before p1 because it has non-null lower price
        assertEquals("B", products.get(0).getName());
        assertEquals("A", products.get(1).getName());
    }
}
