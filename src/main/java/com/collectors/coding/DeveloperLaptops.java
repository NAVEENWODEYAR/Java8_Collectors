package com.collectors.coding;

/**
 * @author NaveenWodeyar
 *
 */

public class DeveloperLaptops {
    public static void main(String[] args) {
        String[] laptops = {
            "Apple MacBook Air — Great balance of performance, battery life & portability",
            "ASUS Zenbook 14 OLED — Strong all-rounder with crisp display and good power",
            "Samsung Galaxy Book5 — Thin & light with strong performance for coding",
            "Lenovo ThinkPad X1 Carbon — Excellent keyboard/build & business-class reliability",
            "Lenovo IdeaPad Slim 3 — Budget option good for students and light coding",
            "Lenovo LOQ — Gaming-class performance that handles heavy IDEs & containers",
            "HP Victus Gaming Laptop — More affordable, decent performance for dev tasks"
        };

        System.out.println("Best Laptops for Developers (2026):");
        System.out.println("-------------------------------------");
        for (String laptop : laptops) {
            System.out.println("> " + laptop);
        }
        System.out.println("-------------------------------------");
        System.out.println("Tip: Consider at least 16GB RAM, SSD storage, and a modern CPU for smooth development experience!");
    }
}
