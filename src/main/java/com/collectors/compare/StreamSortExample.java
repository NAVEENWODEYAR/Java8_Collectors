package com.collectors.compare;

/**
 * @author NaveenWodeyar
 *
 */

import java.util.*;

class EmployeeEntity implements Comparable<EmployeeEntity> {
    int id;
    String name;
    double salary;

    EmployeeEntity(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Natural ordering by ID
    public int compareTo(Employee e) {
        return Integer.compare(this.id, e.id);
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }

	@Override
	public int compareTo(EmployeeEntity o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class StreamSortExample {
    public static void main(String[] args) {
        List<EmployeeEntity> employees = Arrays.asList(
            new EmployeeEntity(103, "John", 50000),
            new EmployeeEntity(101, "Alice", 60000),
            new EmployeeEntity(102, "Bob", 55000)
        );

        System.out.println("Sorting by ID (Comparable):");
        employees.stream()
                 .sorted()  // uses Comparable (by ID)
                 .forEach(System.out::println);

        System.out.println("\nSorting by Name (Comparator using lambda):");
        employees.stream()
                 .sorted(Comparator.comparing(emp -> emp.name))
                 .forEach(System.out::println);

        System.out.println("\nSorting by Salary (Comparator using lambda):");
        employees.stream()
                 .sorted(Comparator.comparingDouble(emp -> emp.salary))
                 .forEach(System.out::println);
    }
}

