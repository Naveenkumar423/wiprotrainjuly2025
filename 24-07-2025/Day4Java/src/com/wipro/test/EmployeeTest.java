package com.wipro.test;

import com.wipro.collection.Employee;
import java.util.*;

public class EmployeeTest {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Nsolutions001", "Arun", 30, 85000));
        employees.add(new Employee("Nsolutions002", "Divya", 28, 92000));
        employees.add(new Employee("Nsolutions003", "Ravi", 34, 75000));
        employees.add(new Employee("Nsolutions004", "Naveen", 29, 99000));
        employees.add(new Employee("Nsolutions005", "Siri", 25, 88000));

        employees.sort((e1, e2) -> Double.compare(e2.getEmpSalary(), e1.getEmpSalary()));

        System.out.println("Employees sorted by descending salary:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
