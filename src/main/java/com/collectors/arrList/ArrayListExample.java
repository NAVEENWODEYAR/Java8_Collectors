/**
 * 
 */
package com.collectors.arrList;

/**
 * @author NaveenWodeyar
 *
 */
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Printing the ArrayList
        System.out.println("Fruits in the list: " + fruits);

        // Accessing an element by index
        System.out.println("The first fruit is: " + fruits.get(0)); // Index starts from 0

        // Modifying an element
        fruits.set(2, "Pineapple");
        System.out.println("Updated list: " + fruits);

        // Removing an element
        fruits.remove("Banana");
        System.out.println("List after removing Banana: " + fruits);

        // Checking if an element exists
        if (fruits.contains("Mango")) {
            System.out.println("Mango is in the list.");
        }

        // Getting the size of the ArrayList
        System.out.println("The number of fruits in the list: " + fruits.size());

        // Iterating through the ArrayList using a loop
        System.out.println("Iterating through the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

