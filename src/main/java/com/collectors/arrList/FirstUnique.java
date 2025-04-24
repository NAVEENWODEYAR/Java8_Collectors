/**
 * 
 */
package com.collectors.arrList;

/**
 * @author NaveenWodeyar
 *
 */
public class FirstUnique {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 0, 4};
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println("First non-repeating: " + arr[i]);
                break;
            }
        }
    }
}
