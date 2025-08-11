package com.wipro.empolyeedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wipro.empolyeedemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {}
