package com.collectors.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
    private int empId;
    private int empAge;
    private String empName;
    private double empSalary;
    private String empGender;
    private int DOJ;
}
