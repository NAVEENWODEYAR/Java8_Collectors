package com.collectors.employee;

import java.util.Objects;

public class Employee {

    private int empId;
    private String empName;
    private int empAge;
    private String empGender;
    private String empDepartment;
    private int DOJ;
    
    public Employee() {}
    
    /**
	 * @param empId
	 * @param empName
	 * @param empAge
	 * @param empGender
	 * @param empDepartment
	 * @param dOJ
	 * @param empSalary
	 */
	public Employee(int empId, String empName, int empAge, String empGender, String empDepartment, int dOJ,
			double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empGender = empGender;
		this.empDepartment = empDepartment;
		DOJ = dOJ;
		this.empSalary = empSalary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(DOJ, empAge, empDepartment, empGender, empId, empName, empSalary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return DOJ == other.DOJ && empAge == other.empAge && Objects.equals(empDepartment, other.empDepartment)
				&& Objects.equals(empGender, other.empGender) && empId == other.empId
				&& Objects.equals(empName, other.empName)
				&& Double.doubleToLongBits(empSalary) == Double.doubleToLongBits(other.empSalary);
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empGender=" + empGender
				+ ", empDepartment=" + empDepartment + ", DOJ=" + DOJ + ", empSalary=" + empSalary + "]";
	}



	private double empSalary;
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the empAge
	 */
	public int getEmpAge() {
		return empAge;
	}
	/**
	 * @param empAge the empAge to set
	 */
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	/**
	 * @return the empGender
	 */
	public String getEmpGender() {
		return empGender;
	}
	/**
	 * @param empGender the empGender to set
	 */
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	/**
	 * @return the empDepartment
	 */
	public String getEmpDepartment() {
		return empDepartment;
	}
	/**
	 * @param empDepartment the empDepartment to set
	 */
	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	/**
	 * @return the dOJ
	 */
	public int getDOJ() {
		return DOJ;
	}
	/**
	 * @param dOJ the dOJ to set
	 */
	public void setDOJ(int dOJ) {
		DOJ = dOJ;
	}
	/**
	 * @return the empSalary
	 */
	public double getEmpSalary() {
		return empSalary;
	}
	/**
	 * @param empSalary the empSalary to set
	 */
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
    
    
}
