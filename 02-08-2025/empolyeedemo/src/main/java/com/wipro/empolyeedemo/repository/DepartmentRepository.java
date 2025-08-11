package com.wipro.empolyeedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wipro.empolyeedemo.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {}
