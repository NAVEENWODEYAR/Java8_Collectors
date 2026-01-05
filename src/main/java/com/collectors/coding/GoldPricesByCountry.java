package com.collectors.coding;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author NaveenWodeyar
 *
 */

public class GoldPricesByCountry {

    public static void main(String[] args) {

        // Gold prices per gram (24K) – sample values
        Map<String, String> goldPrices = new LinkedHashMap<>();

        goldPrices.put("USA", "141.9 USD");
        goldPrices.put("India", "12,885 INR");
        goldPrices.put("United Kingdom", "105.8 GBP");
        goldPrices.put("UAE (Dubai)", "524.6 AED");
        goldPrices.put("Saudi Arabia", "535.7 SAR");
        goldPrices.put("China", "998.1 CNY");
        goldPrices.put("Japan", "21,300 JPY");
        goldPrices.put("Canada", "195.5 CAD");
        goldPrices.put("Australia", "208.3 AUD");
        goldPrices.put("Singapore", "178.6 SGD");

        System.out.println("Gold Prices Per Gram (24K)");
        System.out.println("--------------------------------");

        for (Map.Entry<String, String> entry : goldPrices.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

