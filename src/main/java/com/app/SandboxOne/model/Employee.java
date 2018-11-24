package com.app.SandboxOne.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import javax.persistence.*;

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
    String department;
    String jobTitle;
    Integer salary;

}
