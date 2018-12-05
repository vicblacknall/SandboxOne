package com.app.SandboxOne.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@Table(name = "department")
public class Department {
    String departmentID;
    String departmentName;
}
