package com.wipro.empolyeedemo.service;

import com.wipro.empolyeedemo.entity.Employee;
import com.wipro.empolyeedemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public Employee save(Employee e) {
        return repo.save(e);
    }

    public List<Employee> getAll() {
        return repo.findAll();
    }
}
