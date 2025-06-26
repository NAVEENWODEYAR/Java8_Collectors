package com.collectors.compare;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

//Student class using Comparable to sort by ID
class StudentEntyti implements Comparable<StudentEntyti> {
 int id;
 String name;

 StudentEntyti(int id, String name) {
     this.id = id;
     this.name = name;
 }

 // Natural ordering by ID
 public int compareTo(StudentEntyti s) {
     return this.id - s.id;
 }

 public String toString() {
     return id + " " + name;
 }
}

//Comparator to sort students by name
class NameComparatr implements Comparator<StudentEntyti> {
 public int compare(StudentEntyti s1, StudentEntyti s2) {
     return s1.name.compareTo(s2.name);
 }
}

public class SimpleCompareExample {
 public static void main(String[] args) {
     // Creating sample students
     List<StudentEntyti> list = new ArrayList<>();
     list.add(new StudentEntyti(3, "Zara"));
     list.add(new StudentEntyti(1, "Bob"));
     list.add(new StudentEntyti(2, "Alice"));

     // Sort using Comparable (by ID)
     Collections.sort(list);
     System.out.println("Sorted by ID (Comparable):");
     for (StudentEntyti s : list) {
         System.out.println(s);
     }

     // Sort using Comparator (by name)
     Collections.sort(list, new NameComparatr());
     System.out.println("\nSorted by Name (Comparator):");
     for (StudentEntyti s : list) {
         System.out.println(s);
     }
 }
}
