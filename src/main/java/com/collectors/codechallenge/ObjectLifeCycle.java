package com.collectors.codechallenge;

/**
 * @author NaveenWodeyar
 *
 */

public class ObjectLifeCycle {

    // Constructor
    public ObjectLifeCycle() {
        System.out.println("Object created.");
    }

    // Method to simulate object usage
    public void useObject() {
        System.out.println("Object is being used.");
    }

    // finalize method (called before garbage collection, not guaranteed)
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is being garbage collected.");
    }

    public static void main(String[] args) {
        // Step 1: Object creation
        ObjectLifeCycle obj = new ObjectLifeCycle();

        // Step 2: Using the object
        obj.useObject();

        // Step 3: Dereferencing the object (ready for GC)
        obj = null;

        // Suggesting garbage collection
        System.gc();

        // Adding delay to see GC effect (optional)
        try {
            Thread.sleep(1000); // 1 second delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of main method.");
    }
}
