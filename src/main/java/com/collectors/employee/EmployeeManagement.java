package com.collectors.employee;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.*;

/**
 * @author Naveen K Wodeyar
 * @date 18/05/2024
 * @apiNote realTime queries using java8 collectors,
 *
 */
public class EmployeeManagement {
	
	public static void main(String[] args) {
	ArrayList<Employee> employeeList = new ArrayList<>(5);
						employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2001, 25000.0));
						employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
						employeeList.add(new Employee(133, "Gopi", 29, "Male", "Infrastructure", 2012, 18000.0));
						employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
						employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
						employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
						employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
						employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
						employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
						employeeList.add(new Employee(211, "Hima Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
						employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
						employeeList.add(new Employee(233, "Jyothi Rao", 27, "Female", "Account And Finance", 2003, 21300.0));
						employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
						employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2008, 12700.0));
						employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
						employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
						employeeList.add(new Employee(279, "Vincent", 41, "Male", "Product Development", 2021, 15700.0));
						employeeList.add(new Employee(2791, "Anu Mathew", 31, "Female", "Testing", 2020, 85701.0));
						
		// EMPLOYEE MANAGEMET SYSTEM,
		System.out.println("\nGender count, " + employeeList.parallelStream().collect(Collectors.groupingBy(Employee::getEmpGender, Collectors.counting())));

		System.out.println("\nDepartment list\n " + employeeList.stream().map(Employee::getEmpDepartment).distinct().collect(Collectors.joining(",\n")));
		
		System.out.println("\nAverage age\n " + employeeList.stream().collect(Collectors.groupingBy(Employee::getEmpGender,Collectors.averagingLong(Employee::getEmpAge))).entrySet().parallelStream().collect(Collectors.toMap(Entry::getKey, e->String.format("%.2f", e.getValue()))));
		
		System.out.println("\nHighest paid Employee\n " +employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getEmpSalary))));
	
		System.out.println("\nEmployees joined after 2015\n "+employeeList.stream().filter(emp-> emp.getDOJ() > 2015).map(Employee::getEmpName).toList());
	
		System.out.println("\nEmployee count"+employeeList.stream().collect(Collectors.groupingBy(Employee::getEmpDepartment,Collectors.counting())));
	
		System.out.println("\nAverage Salary \n"+employeeList.parallelStream().collect(Collectors.groupingBy(Employee::getEmpDepartment,Collectors.averagingDouble(Employee::getEmpSalary))).entrySet().stream().collect(Collectors.toMap(Entry::getKey,e->String.format("%.2f",e.getValue()))));
	
		System.out.println("\nYoungest Female Product Development\n"+employeeList.stream().filter(emp-> emp.getEmpGender().equalsIgnoreCase("Female")||emp.getEmpDepartment().equalsIgnoreCase("Product Development")).min(Comparator.comparing(Employee::getEmpAge)));
	
		System.out.println("\nSeniorMost Employee\n"+employeeList.parallelStream().sorted(Comparator.comparing(Employee::getDOJ)).findFirst());
	
		System.out.println("\nSales & Marketing Team\n"+employeeList.parallelStream().filter(emp->emp.getEmpDepartment().equalsIgnoreCase("Sales And Marketing")).collect(Collectors.groupingBy(Employee::getEmpGender,Collectors.counting())));
		
		System.out.println("\nAverage Salary\n"+employeeList.parallelStream().collect(Collectors.groupingBy(Employee::getEmpGender,Collectors.averagingDouble(Employee::getEmpSalary))).entrySet().stream().collect(Collectors.toMap(Entry::getKey,emp->String.format("%.3f",emp.getValue()))));
	}
}
