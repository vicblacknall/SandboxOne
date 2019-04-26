package com.app.SandboxOne.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "employees")
@NoArgsConstructor
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "associate_ID")
    Long empID;
    String firstName;
    String lastName;

    @OneToMany(mappedBy = "empID")
    Collection<Employee> employees;

    @ManyToOne()
    @JoinColumn(name = "department_name")
    Department department;
    String jobTitle;
    Integer salary;

}
