package com.collectors.codechallenge;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;


public class InMemoryKafka {
    private static final Map<String, Queue<String>> topics = new ConcurrentHashMap<>();

    public static void send(String topic, String message) {
        topics.computeIfAbsent(topic, t -> new ConcurrentLinkedQueue<>()).add(message);
    }

    public static List<String> consume(String topic, int maxMessages) {
        Queue<String> queue = topics.getOrDefault(topic, new ConcurrentLinkedQueue<>());
        List<String> messages = new ArrayList<>();

        for (int i = 0; i < maxMessages; i++) {
            String msg = queue.poll();
            if (msg == null) break;
            messages.add(msg);
        }
        return messages;
    }

    public static void clear() {
        topics.clear();
    }
}
