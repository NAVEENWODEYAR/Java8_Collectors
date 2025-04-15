package com.collectors.coding;

/**
 * @author NaveenWodeyar
 *
 */

class Immutable {
    private final int[] data;

    public Immutable(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }
}

public class ImmutabilityTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        Immutable obj = new Immutable(arr);
        arr[0] = 100;

        System.out.println(obj.getData()[0]); // 100
    }
}

