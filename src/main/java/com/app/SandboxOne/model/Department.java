package com.app.SandboxOne.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@Table(name = "department")
public class Department {

    @Column(name = "department_id")
    String departmentID;

    @Id
    String departmentName;
/*
    @OneToMany(mappedBy = "department")
    Set<Employee> employees;*/
}
