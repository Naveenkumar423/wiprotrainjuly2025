package com.wipro.collection;

public class Employee {
    private String empId;
    private String empName;
    private int empAge;
    private double empSalary;
    public Employee(String empId, String empName, int empAge, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

 
    public double getEmpSalary() {
        return empSalary;
    }

    public String toString() {
        return empId + " - " + empName + " - Age: " + empAge + " - Salary: ₹" + empSalary;
    }
}
