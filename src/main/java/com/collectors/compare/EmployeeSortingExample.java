package com.collectors.compare;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

//Employee class implements Comparable for natural ordering (by ID)
class Employee implements Comparable<Employee> {
 int id;
 String name;
 double salary;

 Employee(int id, String name, double salary) {
     this.id = id;
     this.name = name;
     this.salary = salary;
 }

 // Natural ordering by ID
 public int compareTo(Employee e) {
     return this.id - e.id;
 }

 public String toString() {
     return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
 }
}

//Comparator to sort by Name
class NameComparators implements Comparator<Employee> {
 public int compare(Employee e1, Employee e2) {
     return e1.name.compareTo(e2.name);
 }
}

//Comparator to sort by Salary
class SalaryComparator implements Comparator<Employee> {
 public int compare(Employee e1, Employee e2) {
     return Double.compare(e1.salary, e2.salary);
 }
}

public class EmployeeSortingExample {
 public static void main(String[] args) {
     List<Employee> employees = new ArrayList<>();
     employees.add(new Employee(103, "John", 50000));
     employees.add(new Employee(101, "Alice", 60000));
     employees.add(new Employee(102, "Bob", 55000));

     System.out.println("Sorting by ID (using Comparable):");
     Collections.sort(employees);  // Natural order by ID
     for (Employee e : employees) {
         System.out.println(e);
     }

     System.out.println("\nSorting by Name (using Comparator):");
     Collections.sort(employees, new NameComparators());  // Custom order by name
     for (Employee e : employees) {
         System.out.println(e);
     }

     System.out.println("\nSorting by Salary (using Comparator):");
     Collections.sort(employees, new SalaryComparator());  // Custom order by salary
     for (Employee e : employees) {
         System.out.println(e);
     }
 }
}
