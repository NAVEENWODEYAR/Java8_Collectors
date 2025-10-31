package com.collectors.codechallenge;

/**
 * @author NaveenWodeyar
 *
 */

public class SimpleKafkaProducer {
    private final String topic;

    public SimpleKafkaProducer(String topic) {
        this.topic = topic;
    }

    public void sendMessage(String key, String value) {
        // Ignore key for simplicity
        System.out.printf("[Producer] Sending message to topic '%s': %s%n", topic, value);
        InMemoryKafka.send(topic, value);
    }
}
