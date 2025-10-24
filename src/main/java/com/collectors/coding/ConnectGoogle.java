package com.collectors.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConnectGoogle {
    public static void main(String[] args) {
        try {
            // Create a URL object
            URL url = new URL("https://www.google.com");

            // Open connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Optional: set request method and headers
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", "Java-Client");

            // Get response code
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // Read response content
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            // Close resources
            in.close();
            connection.disconnect();

            // Print a snippet of the HTML
            System.out.println("\n--- Page Content (first 500 chars) ---");
            System.out.println(content.substring(0, Math.min(content.length(), 500)));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
