package com.collectors.compare;

/**
 * @author NaveenWodeyar
 *
 */

public class Product implements Comparable<Product> {
    private String name;
    private Double price; // nullable
    private int rating;   // from 1 to 5

    public Product(String name, Double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() { return name; }
    public Double getPrice() { return price; }
    public int getRating() { return rating; }

    // Natural ordering by name (case-insensitive)
    @Override
    public int compareTo(Product other) {
        return this.name.compareToIgnoreCase(other.name);
    }

    @Override
    public String toString() {
        return name + " | Price: " + price + " | Rating: " + rating;
    }
}
