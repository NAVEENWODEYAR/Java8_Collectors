package com.collectors.coding;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author NaveenWodeyar
 *
 */

public class CurrencyConverter {

    private static final String API_URL = "https://api.exchangerate.host/convert";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🌍 Currency Converter");
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        System.out.print("From currency (e.g., USD): ");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.print("To currency (e.g., EUR): ");
        String toCurrency = scanner.next().toUpperCase();

        scanner.close();

        try {
            double result = convertCurrency(fromCurrency, toCurrency, amount);
            System.out.printf("✅ %.2f %s = %.2f %s%n", amount, fromCurrency, result, toCurrency);
        } catch (Exception e) {
            System.err.println("❌ Error occurred: " + e.getMessage());
        }
    }

    public static double convertCurrency(String from, String to, double amount) throws Exception {
        String requestUrl = String.format("%s?from=%s&to=%s&amount=%f", API_URL, from, to, amount);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(requestUrl))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        ObjectMapper mapper = new ObjectMapper();
        JsonNode json = mapper.readTree(response.body());

        if (!json.get("success").asBoolean()) {
            throw new Exception("API returned unsuccessful response.");
        }

        return json.get("result").asDouble();
    }
}
