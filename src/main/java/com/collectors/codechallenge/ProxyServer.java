package com.collectors.codechallenge;

import java.io.*;
import java.net.*;

/**
 * @author NaveenWodeyar
 *
 */

public class ProxyServer {

    public static void main(String[] args) throws IOException {
        int port = 8888;
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Proxy server listening on port " + port);

        while (true) {
            Socket clientSocket = serverSocket.accept();
            new Thread(() -> handleClientRequest(clientSocket)).start();
        }
    }

    private static void handleClientRequest(Socket clientSocket) {
        try (
            InputStream clientIn = clientSocket.getInputStream();
            OutputStream clientOut = clientSocket.getOutputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientIn));
        ) {
            String requestLine = reader.readLine();
            if (requestLine == null || !requestLine.startsWith("GET")) {
                clientSocket.close();
                return;
            }

            String[] parts = requestLine.split(" ");
            URL url = new URL(parts[1]);

            Socket serverSocket = new Socket(url.getHost(), 80);
            PrintWriter serverOut = new PrintWriter(serverSocket.getOutputStream(), true);

            serverOut.println(requestLine);
            String line;
            while (!(line = reader.readLine()).isEmpty()) {
                serverOut.println(line);
            }
            serverOut.println();

            InputStream serverIn = serverSocket.getInputStream();
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = serverIn.read(buffer)) != -1) {
                clientOut.write(buffer, 0, bytesRead);
            }

            serverSocket.close();
            clientSocket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
