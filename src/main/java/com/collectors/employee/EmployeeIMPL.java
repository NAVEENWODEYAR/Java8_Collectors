package com.collectors.employee;

import java.util.*;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeIMPL {

public static void main(String[] args) {
       List<Employee> employeeList = new ArrayList<>();
       
employeeList.add(new Employee(111, "James Bond", 32, "Male", "HR", 2011, 25000.0));
employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
employeeList.add(new Employee(144, "Murali", 28, "Male", "Product Development", 2014, 32500.0));
employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
employeeList.add(new Employee(15, "Nimi", 27, "Female", "HR", 2013, 22700.0));
employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
employeeList.add(new Employee(277, "Anuj Chettiar", 39, "Male", "Product Development", 2012, 5700.0));
employeeList.add(new Employee(27, "Nandi", 20, "Female", "Product Development", 2024, 135700.0));
employeeList.add(new Employee(181, "Parvat", 40, "Male", "Sales And Transport", 2024, 185700.0));



//Query 1 : How many male and female employees are there in the organization?
	System.out.println("\n Gender count");
	employeeList.parallelStream()
		.collect(Collectors.groupingBy(Employee::getEmpGender,Collectors.counting()))
		.entrySet()
		.forEach(System.out::println);

//Query 2 : Print the name of all departments in the organization?
  	System.out.println("\n Departments");
	employeeList.stream()
		.map(Employee::getEmpDepartment)
		.distinct()
		.forEach(System.out::println);

//Query 3 : What is the average age of male and female employees?
	System.out.println("\n Average age");
	Map<String, Double> avgAge = employeeList.stream()
					.collect(Collectors.groupingBy(Employee::getEmpGender,Collectors.averagingDouble(Employee::getEmpAge)));
	System.out.println(avgAge);
 
// Query 4 : Get the details of highest paid employee in the organization?
	System.out.println("\n Highest salary");
	Employee employee = employeeList.parallelStream().collect(Collectors.maxBy(Comparator.comparing(Employee::getEmpSalary))).get();
	System.out.println(" Employee "+employee.getEmpName()+" \n Salary "+employee.getEmpSalary());

//Query 5 : Get the names of all employees who have joined after 2015?
  	System.out.println("\n Employees joined after 2015");
	employeeList.parallelStream()
		.filter(emp-> emp.getDOJ() > 2015)
		.map(emp->emp.getEmpName())
		.forEach(System.out::println);

//Query 6 : Count the number of employees in each department?
  	System.out.println("\n Emp count in Dept");
	employeeList.parallelStream()
			.collect(Collectors.groupingBy(Employee::getEmpDepartment,Collectors.counting()))
			.entrySet()
			.forEach(System.out::println);

//Query 7 : What is the average salary of each department?
	System.out.println("\n Average salary of Dept's");
	employeeList.parallelStream()
			.collect(Collectors.groupingBy(Employee::getEmpDepartment,Collectors.averagingDouble(Employee::getEmpSalary)))
			.entrySet()
			.forEach(System.out::println);

//Query 8 : Get the details of youngest male employee in the product development department?
	System.out.println("\n Youngest male employee");
	Employee employe = employeeList.parallelStream()
		.filter((emp->emp.getEmpGender().equalsIgnoreCase("Male") && emp.getEmpDepartment().equalsIgnoreCase("Product Development")))
		.min(Comparator.comparing(Employee::getEmpAge))
		.get();
	System.out.println(" Name "+employee.getEmpName()+" aged "+employee.getEmpAge());
	

//Query 9 : Who has the most working experience in the organization?
	System.out.println("\n Youngest male employee");
	Employee employe1 = employeeList.parallelStream().collect(Collectors.minBy(Comparator.comparing(Employee::getDOJ))).get();
	System.out.println(" " +employee.getEmpName()+" "+employee.getDOJ());


//Query 10 : How many male and female employees are there in the sales and marketing team?
	System.out.println("\n Employees count in Sales & Marketing");
	employeeList.parallelStream()
			.filter((e->e.getEmpDepartment().equalsIgnoreCase("Sales and Marketing")))
			.collect(Collectors.groupingBy(Employee::getEmpGender,Collectors.counting()))
			.entrySet()
			.forEach(System.out::println);

//Query 11 : What is the average salary of male and female employees?
	System.out.println("\n Average salary of Male & Female employees,");
	employeeList.stream()
		.collect(Collectors.groupingBy(Employee::getEmpGender,Collectors.averagingDouble(Employee::getEmpSalary)))
		.entrySet()
		.forEach(System.out::println);
		
		
//Query 12 : List down the names of all employees in each department?
	System.out.println("\n Departmentwise List");
	Map<String, List<Employee>> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getEmpDepartment));
	System.out.println(collect);
	

//Query 13 : What is the average salary and total salary of the whole organization?
	System.out.println("\n Salary Summary of the organization,");
	DoubleSummaryStatistics sal = employeeList.parallelStream().collect(Collectors.summarizingDouble(Employee::getEmpSalary));
	System.out.println("\n Total sum salary of the organization: "+sal.getSum());
	System.out.println("\n Average salary of the organization: "+sal.getAverage());
	System.out.println("\n Minimum  salary of the organization: "+sal.getMin());
	System.out.println("\n Maximum  salary of the organization: "+sal.getMax());
	

//Query 14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
	System.out.println("\n Collectors.partitioningBy(function)");
	Map<Boolean, List<Employee>> partition = employeeList.stream().collect(Collectors.partitioningBy(emp->emp.getEmpAge() >= 25));
	System.out.println(partition);

//Query 15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?
	System.out.println("\n SeniorMost employee details");
	Employee employee1 = employeeList.parallelStream().collect(Collectors.maxBy(Comparator.comparing(Employee::getEmpAge))).get();
	Employee employee2 = employeeList.stream().max(Comparator.comparing(Employee::getEmpAge)).get();
	System.out.println(employee1.getEmpAge()+"*SENIOR EMPLOYEE*"+employee2.getEmpName());
	}
}
   
