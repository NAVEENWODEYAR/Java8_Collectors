package com.collectors.compare;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Natural ordering by id
    public int compareTo(Student s) {
        return this.id - s.id;
    }

    public String toString() {
        return id + " " + name;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "John"));
        list.add(new Student(1, "Alice"));
        list.add(new Student(2, "Bob"));

        Collections.sort(list);  // Uses compareTo method

        for (Student s : list) {
            System.out.println(s);
        }
    }
}
