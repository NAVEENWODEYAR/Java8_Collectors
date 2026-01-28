package com.collectors.coding;

/**
 * @author NaveenWodeyar
 *
 */

class Smartphone {
    String name;
    String category;
    int price; // in INR

    Smartphone(String name, String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    void display() {
        System.out.println("📱 " + name);
        System.out.println("   Category: " + category);
        System.out.println("   Price: ₹" + price);
        System.out.println();
    }
}

public class BestSmartphones {
    public static void main(String[] args) {

        Smartphone[] phones = {
            new Smartphone("1.iPhone 15 Pro", "Flagship", 135000),
            new Smartphone("2. Samsung Galaxy S24 Ultra", "Flagship", 129999),
            new Smartphone("3. Google Pixel 8", "Camera & Clean Android", 75999),
            new Smartphone("4. OnePlus 12", "Performance", 64999),
            new Smartphone("5. Redmi Note 13 Pro", "Best Budget", 25999)
        };

        System.out.println("Best Smartphones List");
        System.out.println("------------------------");

        for (Smartphone phone : phones) {
            phone.display();
        }
    }
}
