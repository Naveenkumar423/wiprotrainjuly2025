package com.wipro.test;

import com.wipro.collection.Employee;
import java.util.concurrent.CopyOnWriteArrayList;

public class EmployeeRemoval {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Employee> employees = new CopyOnWriteArrayList<>();

        employees.add(new Employee("Ns001", "Arun", 30, 85000));
        employees.add(new Employee("Ns002", "Divya", 28, 92000));
        employees.add(new Employee("Ns003", "Ravi", 34, 75000));
        employees.add(new Employee("Ns004", "Naveen", 29, 99000));
        employees.add(new Employee("Ns005", "Siri", 25, 88000));

        System.out.println("Before Removal (All Employees):");
        for (Employee e : employees) {
            System.out.println(e);
        }

        for (Employee e : employees) {
            if (e.getEmpSalary() > 80000) {
                employees.remove(e); 
            }
        }

        System.out.println("\nAfter Removing Employees Earning > ₹80000:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
