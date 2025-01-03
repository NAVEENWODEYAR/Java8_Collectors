package com.collectors.ems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.collectors.employee.Employee;

/**
 * @author NaveenWodeyar
 *
 */
public class EmployeeRealTimeQueries {

	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<Employee>();
		
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

		
		System.out.println("\nEMPLOYEE MANAGEMENT SYSTEM\n");
		System.out.println(employeeList);
		
		System.out.println("\n**## Employee Gender Count ##**\n");
		Map<String, Long> genderCount = employeeList.stream().collect(Collectors.groupingBy(Employee::getEmpGender,Collectors.counting()));
		System.out.println(genderCount);
		
		System.out.println("\n**## Departments ##**\n");
		String deptList = employeeList.stream().map(Employee::getEmpDepartment).distinct().collect(Collectors.joining(",\n"));
		System.out.println(deptList.toString());
		
		System.out.println("\n**## Average age of Employees by gender ##**\n");
		Map<String, Double> avgAge = employeeList.stream().collect(Collectors.groupingBy(Employee::getEmpGender,Collectors.averagingDouble(Employee::getEmpAge)));
		System.out.println(avgAge);
		
		System.out.println("\n**## Highest paid Employee ##**\n");
		Optional<Employee> highestPaidEmployee = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getEmpSalary)));
		System.out.println(highestPaidEmployee.get());
		
	  	System.out.println("\n Employees joined after 2015");
	  	List<Employee> employeeAfter2015 = employeeList.stream().filter(e->e.getDOJ() > 2015).collect(Collectors.toList());
		System.out.println(employeeAfter2015);
		
		System.out.println("**##/nEmployee Count ##**/n");
		Map<String, Long> empCount = employeeAfter2015.stream().collect(Collectors.groupingBy(Employee::getEmpDepartment,Collectors.counting()));
		System.out.println(empCount);
		
		System.out.println("##**/nAverage Salary of Department##**/n");
		Map<String, Double> deptAvgSal = employeeAfter2015.stream().collect(Collectors.groupingBy(Employee::getEmpDepartment,Collectors.averagingDouble(Employee::getEmpSalary)));
		System.out.println(deptAvgSal);
		
		System.out.println("**##/nJunior Male Employee##**/n");
		Optional<Employee> juniorEmployee = employeeList.stream().filter(e->e.getEmpDepartment().equalsIgnoreCase("Product Development") && e.getEmpGender().equalsIgnoreCase("Male")).collect(Collectors.minBy(Comparator.comparing(Employee::getEmpAge)));
		System.out.println(juniorEmployee);
		
		System.out.println("**##/nSeniormost Employee##**/n");
		Optional<Employee> seniorEmp = employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getDOJ)));
		System.out.println(seniorEmp);
		
		System.out.println("**##/nGenderCount in Sales & Markting Team##**/n");
		Map<String, Long> empGenderCount = employeeList.stream().filter(e->e.getEmpDepartment().equalsIgnoreCase("Sales And Marketing")).collect(Collectors.groupingBy(Employee::getEmpGender,Collectors.counting()));
		System.out.println(empGenderCount);
		
		System.out.println("**##/nAverage Salary of Employees based on gender##**/n");
		Map<String, Double> avgEmpSal = employeeList.stream().collect(Collectors.groupingBy(Employee::getEmpGender,Collectors.averagingDouble(Employee::getEmpSalary)));
		System.out.println(avgEmpSal);
	}
}

