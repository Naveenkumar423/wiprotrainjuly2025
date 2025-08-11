package com.wipro.empolyeedemo.controller;

import com.wipro.empolyeedemo.entity.Employee;
import com.wipro.empolyeedemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping
    public Employee createEmployee(@RequestBody Employee emp) {
        return service.save(emp);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return service.getAll();
    }
}
