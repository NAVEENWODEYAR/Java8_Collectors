package com.collectors.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {

    private int empId;
    private String empName;
    private int empAge;
    private String empGender;
    private String empDepartment;
    private int DOJ;
    private double empSalary;
}
