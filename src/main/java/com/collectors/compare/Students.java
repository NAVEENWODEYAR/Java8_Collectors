package com.collectors.compare;

/**
 * @author NaveenWodeyar
 *
 */

public class Students implements Comparable<Students> {
    private String name;
    private int age;
    private double marks;

    public Students(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public double getMarks() { return marks; }

    // Natural order: sort by name (case-insensitive)
    @Override
    public int compareTo(Students other) {
        return this.name.compareToIgnoreCase(other.name);
    }

    @Override
    public String toString() {
        return name + " | Age: " + age + ", Marks: " + marks;
    }
}
