package com.collectors.codechallenge;

import java.util.List;

/**
 * @author NaveenWodeyar
 *
 */

public class SimpleKafkaConsumer {
    private final String topic;

    public SimpleKafkaConsumer(String topic) {
        this.topic = topic;
    }

    public List<String> pollMessages(int maxMessages) {
        List<String> messages = InMemoryKafka.consume(topic, maxMessages);
        for (String msg : messages) {
            System.out.printf("[Consumer] Received message: %s%n", msg);
        }
        return messages;
    }
}
