package com.collectors.hashmap;

/**
 * @author NaveenWodeyar
 *
 */

import java.util.LinkedList;

class Entry<K, V> {
    K key;
    V value;

    Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

// Our own simplified version of a HashMap
class CustomHashMap<K, V> {
    private final int SIZE = 16; // default size (like initial capacity)
    private LinkedList<Entry<K, V>>[] buckets;

    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        // Create an array of LinkedLists (buckets)
        buckets = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    // Hash function to get index
    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        int index = hashCode % SIZE; // simple mod hashing
        return index < 0 ? index + SIZE : index; // handle negative hashCodes
    }

    public void put(K key, V value) {
        int index = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];

        // Check if key already exists and update
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value;
                System.out.println("Updated existing key: " + key + " at index " + index);
                return;
            }
        }

        // If not found, add new entry
        bucket.add(new Entry<>(key, value));
        System.out.println("Added key: " + key + " at index " + index);
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null; // not found
    }

    public void printMap() {
        for (int i = 0; i < SIZE; i++) {
            LinkedList<Entry<K, V>> bucket = buckets[i];
            if (!bucket.isEmpty()) {
                System.out.print("Bucket " + i + ": ");
                for (Entry<K, V> entry : bucket) {
                    System.out.print("[" + entry.key + " -> " + entry.value + "] ");
                }
                System.out.println();
            }
        }
    }
}

public class HashMapInternalWorking {
    public static void main(String[] args) {
        CustomHashMap<String, String> map = new CustomHashMap<>();

        map.put("USA", "Washington D.C.");
        map.put("India", "New Delhi");
        map.put("Germany", "Berlin");
        map.put("France", "Paris");
        map.put("Japan", "Tokyo");

        // Try adding a key that will likely collide
        map.put("SU", "Somewhere"); // May collide with USA due to similar hashCode patterns

        System.out.println("\nRetrieving a value:");
        System.out.println("Capital of India: " + map.get("India"));

        System.out.println("\nCurrent map structure:");
        map.printMap();
    }
}
