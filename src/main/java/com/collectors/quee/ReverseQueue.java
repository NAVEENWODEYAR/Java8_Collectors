package com.collectors.quee;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1); q.add(2); q.add(3);

        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.poll());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        System.out.println(q); // Output: [3, 2, 1]
    }
}

