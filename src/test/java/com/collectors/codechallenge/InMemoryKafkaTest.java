package com.collectors.codechallenge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

/**
 * @author NaveenWodeyar
 *
 */

class InMemoryKafkaTest {

    private SimpleKafkaProducer producer;
    private SimpleKafkaConsumer consumer;

    @BeforeEach
    void setUp() {
        InMemoryKafka.clear();
        producer = new SimpleKafkaProducer("test-topic");
        consumer = new SimpleKafkaConsumer("test-topic");
    }

    @Test
    void testSendAndConsumeMessages() {
        producer.sendMessage("key1", "Hello Kafka!");
        producer.sendMessage("key2", "Message 2");
        producer.sendMessage("key3", "Message 3");

        List<String> messages = consumer.pollMessages(10);

        assertEquals(3, messages.size());
        assertTrue(messages.contains("Hello Kafka!"));
        assertTrue(messages.contains("Message 2"));
        assertTrue(messages.contains("Message 3"));
    }

    @Test
    void testConsumeEmptyTopic() {
        List<String> messages = consumer.pollMessages(5);
        assertTrue(messages.isEmpty());
    }

    @Test
    void testPartialConsume() {
        producer.sendMessage(null, "A");
        producer.sendMessage(null, "B");
        producer.sendMessage(null, "C");

        List<String> firstBatch = consumer.pollMessages(2);
        List<String> secondBatch = consumer.pollMessages(2);

        assertEquals(List.of("A", "B"), firstBatch);
        assertEquals(List.of("C"), secondBatch);
    }
}
