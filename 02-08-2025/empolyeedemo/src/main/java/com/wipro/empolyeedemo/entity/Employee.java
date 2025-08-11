package com.wipro.empolyeedemo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String empId;
    private String empName;

    @OneToOne
    @JoinColumn(name = "dept_id")
    private Department dept;
}
