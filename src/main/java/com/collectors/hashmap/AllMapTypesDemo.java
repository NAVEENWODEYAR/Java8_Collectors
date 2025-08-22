package com.collectors.hashmap;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author NaveenWodeyar
 *
 */

public class AllMapTypesDemo {

    enum Fruit { APPLE, BANANA }

    public static void main(String[] args) {

        // 1. HashMap
        System.out.println("1. HashMap:");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 20);
        hashMap.put(null, 100); // one null key allowed
        System.out.println(hashMap + "\n");

        // 2. LinkedHashMap
        System.out.println("2. LinkedHashMap (insertion order):");
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Apple", 10);
        linkedHashMap.put("Banana", 20);
        linkedHashMap.put("Mango", 30);
        System.out.println(linkedHashMap + "\n");

        // 3. TreeMap
        System.out.println("3. TreeMap (sorted by key):");
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Banana", 20);
        treeMap.put("Apple", 10);
        treeMap.put("Mango", 30);
        System.out.println(treeMap + "\n");

        // 4. Hashtable
        System.out.println("4. Hashtable (legacy, thread-safe, no nulls):");
        Map<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Apple", 10);
        hashtable.put("Banana", 20);
        // hashtable.put(null, 100); // Throws NullPointerException
        System.out.println(hashtable + "\n");

        // 5. ConcurrentHashMap
        System.out.println("5. ConcurrentHashMap (thread-safe, no nulls):");
        Map<String, Integer> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("Apple", 10);
        concurrentMap.put("Banana", 20);
        // concurrentMap.put(null, 100); // NullPointerException
        System.out.println(concurrentMap + "\n");

        // 6. EnumMap
        System.out.println("6. EnumMap (only for enum keys):");
        Map<Fruit, String> enumMap = new EnumMap<>(Fruit.class);
        enumMap.put(Fruit.APPLE, "Red");
        enumMap.put(Fruit.BANANA, "Yellow");
        System.out.println(enumMap + "\n");

        // 7. WeakHashMap
        System.out.println("7. WeakHashMap (keys eligible for GC):");
        Map<Object, String> weakHashMap = new WeakHashMap<>();
        Object weakKey = new String("tempKey");
        weakHashMap.put(weakKey, "value");
        System.out.println("Before GC: " + weakHashMap);
        weakKey = null;
        System.gc();
        try { Thread.sleep(100); } catch (InterruptedException e) {}
        System.out.println("After GC: " + weakHashMap + "\n");

        // 8. IdentityHashMap
        System.out.println("8. IdentityHashMap (uses == instead of equals):");
        Map<String, String> identityMap = new IdentityHashMap<>();
        identityMap.put(new String("A"), "Apple");
        identityMap.put(new String("A"), "Apricot"); // treated as different keys
        System.out.println(identityMap + "\n");

        // 9. NavigableMap (TreeMap with extra features)
        System.out.println("9. NavigableMap (TreeMap features):");
        NavigableMap<String, Integer> navMap = new TreeMap<>();
        navMap.put("A", 1);
        navMap.put("C", 3);
        navMap.put("B", 2);
        System.out.println(navMap);
        System.out.println("Lower key than C: " + navMap.lowerKey("C"));
        System.out.println("First Entry: " + navMap.firstEntry());
    }
}
