package com.collectors.compare;

/**
 * @author NaveenWodeyar
 *
 */

import java.util.*;

class StudentEntity {
    int id;
    String name;

    StudentEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

// Custom comparator to sort by name
class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "John"));
        list.add(new Student(1, "Alice"));
        list.add(new Student(2, "Bob"));

        Collections.sort(list, new NameComparator());  // Uses compare method

        for (Student s : list) {
            System.out.println(s);
        }
    }
}
